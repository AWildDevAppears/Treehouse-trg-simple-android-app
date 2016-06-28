package uk.co.joshburgess.funfacts;

import java.util.Random;

/**
 * Created by joshburgess on 24/06/2016.
 */
public class FactBook {
    public String[] mFunFacts = {
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

    public String GetFact() {

        Random randomGen = new Random();
        int randomNumber = randomGen.nextInt(mFunFacts.length);

        return mFunFacts[randomNumber];
    }
}
