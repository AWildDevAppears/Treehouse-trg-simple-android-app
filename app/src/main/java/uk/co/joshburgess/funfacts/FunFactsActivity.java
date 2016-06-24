package uk.co.joshburgess.funfacts;

import android.content.DialogInterface;
import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RelativeLayout;
import android.widget.TextView;

import java.lang.reflect.Array;
import java.util.Random;

public class FunFactsActivity extends AppCompatActivity {
    private FactBook mFactBook = new FactBook();
    private ColorWheel mColorWheel = new ColorWheel();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fun_facts);

        final TextView factLabel = (TextView) findViewById(R.id.funFactTextView);
        final RelativeLayout pageBackPane = (RelativeLayout) findViewById(R.id.backPane);
        final Button showFactButton = (Button) findViewById(R.id.showFactButton);


        View.OnClickListener listener = new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String fact = mFactBook.GetFact();
                int color = mColorWheel.GetColor();

                factLabel.setText(fact);
                pageBackPane.setBackgroundColor(color);
                showFactButton.setTextColor(color);

            }
        };

        showFactButton.setOnClickListener(listener);
    }
}
