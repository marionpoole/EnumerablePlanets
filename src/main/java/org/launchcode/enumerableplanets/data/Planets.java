package org.launchcode.enumerableplanets.data;

public enum Planets {
    MERCURY(88, "slate gray"),
    VENUS(225, "golden brown"),
    EARTH(365, "blue"),
    MARS(687, "red"),
    JUPITER(4333, "yellow, brown, red"),
    SATURN(10759, "yellow, brown, gray"),
    URANUS(30687, "cyan"),
    NEPTUNE(60200, "blue");

    private final int yearLength;
    private final String color;

    Planets(int yearLength, String color) {
        this.yearLength = yearLength;
        this.color = color;
    }

    public int getYearLength() {
        return yearLength;
    }

    public String getColor() {
        return color;
    }
}
