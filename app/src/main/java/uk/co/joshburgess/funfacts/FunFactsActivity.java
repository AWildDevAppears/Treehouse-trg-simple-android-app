package uk.co.joshburgess.funfacts;

import android.content.DialogInterface;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.lang.reflect.Array;
import java.util.Random;

public class FunFactsActivity extends AppCompatActivity {


    private String[] funFacts = {
            "fact one",
            "fact two",
            "fact three",
            "fact four",
            "fact five",
            "fact six",
            "fact seven",
            "fact eight",
            "fact nine",
            "fact ten"
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fun_facts);

        final TextView factLabel = (TextView) findViewById(R.id.funFactTextView);
        Button showFactButton = (Button) findViewById(R.id.showFactButton);

        View.OnClickListener listener = new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String fact = "";

                Random randomGen = new Random();
                int randomNumber = randomGen.nextInt(funFacts.length);

                fact = funFacts[randomNumber];

                factLabel.setText(fact);
            }
        };

        showFactButton.setOnClickListener(listener);
    }
}
