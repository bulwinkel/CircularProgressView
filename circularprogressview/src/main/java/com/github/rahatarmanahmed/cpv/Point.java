package com.github.rahatarmanahmed.cpv;

final class Point {

  public static final Point EMPTY = Point.of(Float.MAX_VALUE, Float.MAX_VALUE);

  public final float x;
  public final float y;

  public static Point of(float x, float y) {
    return new Point(x, y);
  }

  public static Point of(double x, double y) {
    return new Point((float)x, (float)y);
  }

  private Point(float x, float y) {
    this.x = x;
    this.y = y;
  }

  public float distance(final Point point) {

    final float xSide = point.x - x;
    final float ySide = point.y - y;
    return (float)Math.sqrt(square(xSide) + square(ySide));
  }

  private static float square(float value) {
    return value * value;
  }

  @Override public String toString() {
    return "x = " + x + " y = " + y;
  }
}
