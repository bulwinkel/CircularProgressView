package com.github.rahatarmanahmed.cpv;

import android.graphics.Color;

public class Colors {

  private Colors() {
    // no instances
  }

  public static int adjustAlpha(int color, float factor) {
    int alpha = Math.round(Color.alpha(color) * factor);
    int red = Color.red(color);
    int green = Color.green(color);
    int blue = Color.blue(color);
    return Color.argb(alpha, red, green, blue);
  }
}
