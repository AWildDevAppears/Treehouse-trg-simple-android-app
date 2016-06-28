package uk.co.joshburgess.funfacts;

import android.content.DialogInterface;
import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RelativeLayout;
import android.widget.TextView;
import android.widget.Toast;

import java.lang.reflect.Array;
import java.util.Random;

public class FunFactsActivity extends AppCompatActivity {
    public static final String TAG = FunFactsActivity.class.getSimpleName();
    private static final String KEY_FACT = "KEY_FACT";

    private FactBook mFactBook = new FactBook();
    private ColorWheel mColorWheel = new ColorWheel();
    private String mFact;
    private int mColor;

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
                mFact = mFactBook.GetFact();
                mColor = mColorWheel.GetColor();

                factLabel.setText(mFact);
                pageBackPane.setBackgroundColor(mColor);
                showFactButton.setTextColor(mColor);
            }
        };

        showFactButton.setOnClickListener(listener);

        Toast
            .makeText(this, "Ping goes the toast", Toast.LENGTH_LONG)
            .show();
    }

    @Override
    protected void onSaveInstanceState(Bundle outState) {
        super.onSaveInstanceState(outState);

        outState.putString(KEY_FACT, mFact);
        outState.putInt(KEY_FACT, mColor);
    }
}
