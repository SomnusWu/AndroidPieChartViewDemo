package app.somnus.com.androidpiechartviewdemo;

import android.graphics.Color;

/**
 * Created by Somnus on 2019/1/16.
 */

public class ColorUtils {

    public static int[] pieColors = {getIColor(255, 123, 132), getIColor(63, 211, 128),
            getIColor(26, 168, 250), getIColor(255, 147, 42), getIColor(255, 142, 201),
            getIColor(118, 115, 243), getIColor(115, 220, 243), getIColor(255, 217, 66),
            getIColor(133, 200, 45), getIColor(299, 101, 110)};


    private static int getIColor(int rColor, int gColor, int bColor) {
        return Color.rgb(rColor, gColor, bColor);
    }
}
