package com.company;

public class LabeledPoint {
    private int x;
    private int y;
    private String label;

    public LabeledPoint(int x, int y, String label) {
        this.x = x;
        this.y = y;
        this.label = label;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public String getLabel() {
        return label;
    }

    public void setLabel(String label) {
        this.label = label;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null) {
            return false;
        }
        if (!(o instanceof LabeledPoint)) {
            return false;
        }
        LabeledPoint obj = (LabeledPoint) o;
        return obj.label == this.label && obj.x == this.x && obj.y == this.y;
    }

    @Override
    public int hashCode() {
        int result = 17;
        result = 31 * result + x;
        result = 31 * result + y;
        result = 31 * result + label.hashCode();
        return result;
    }

    @Override
    public String toString() {
        return "LabeledPoint " + label + "(" + x + ", " + y + ")";
    }
}
