package uk.co.joshburgess.funfacts;

import android.graphics.Color;

import java.util.Random;

/**
 * Created by joshburgess on 24/06/2016.
 */
public class ColorWheel {
    public String[] mColors = {
            "#39add1", // light blue
            "#3079ab", // dark blue
            "#c25975", // mauve
            "#e15258", // red
            "#f9845b", // orange
            "#838cc7", // lavender
            "#7d669e", // purple
            "#53bbb4", // aqua
            "#51b46d", // green
            "#e0ab18", // mustard
            "#637a91", // dark gray
            "#f092b0", // pink
            "#b7c0c7"  // light gray
    };

    public int GetColor() {

        Random randomGen = new Random();
        int randomNumber = randomGen.nextInt(mColors.length);

        return Color.parseColor(mColors[randomNumber]);
    }
}
