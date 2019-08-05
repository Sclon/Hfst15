package com.company;

import java.awt.*;

public class LabeledPoint extends Point implements Comparable<LabeledPoint>{
    private Point point;
    private int x;
    private int y;
    private String label;

    public LabeledPoint(int x, int y, String label) {
        this.x = x;
        this.y = y;
        this.label = label;
        point = new Point(x, y);
    }

    public void setLabel(String label) {
        this.label = label;
    }

    @Override
    public boolean equals(Object o) {
        return super.equals(o);
        /*
        if (o == null) {
            return false;
        }
        if (!(o instanceof LabeledPoint)) {
            return false;
        }
        LabeledPoint obj = (LabeledPoint) o;
        return obj.label == this.label && obj.x == this.x && obj.y == this.y;
         */
    }

    @Override
    public int hashCode() {
        return super.hashCode();
        /*
        int result = 17;
        result = 31 * result + x;
        result = 31 * result + y;
        result = 31 * result + label.hashCode();
        return result;
         */
    }

    @Override
    public String toString() {
        return label + "(" + x + ", " + y + ")";
    }

    @Override
    public int compareTo(LabeledPoint o) {
        if (o.x == this.x) {
            if (o.y == this.y) {
                return this.label.compareTo(o.label);
            } else if (o.y < this.y) {
                return 1;
            } else {
                return -1;
            }
        } else if (o.x < this.x) {
            return 1;
        }
        return -1;
    }
}














