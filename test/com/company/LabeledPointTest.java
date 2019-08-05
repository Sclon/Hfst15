package com.company;

import org.junit.Test;

import java.util.HashSet;
import java.util.Random;
import java.util.TreeSet;

import static org.junit.Assert.*;

public class LabeledPointTest {

    @Test
    public void testEqualsAndHashcode() {
        HashSet<LabeledPoint> hashSetLabelPoint = new HashSet<>();
        LabeledPoint lp1 = new LabeledPoint(5,5,"Label A");
        LabeledPoint lp2 = new LabeledPoint(5,5,"Label A");
        LabeledPoint lp3 = new LabeledPoint(5,5,"Label C");
        LabeledPoint lp4 = new LabeledPoint(5,5,"Label D");

        hashSetLabelPoint.add(lp1);
        hashSetLabelPoint.add(lp2);
        hashSetLabelPoint.add(lp3);
        hashSetLabelPoint.add(lp4);

        assertTrue(hashSetLabelPoint.size() == 3);

        lp2.setLabel("Label B");
        hashSetLabelPoint.add(lp2);

        assertTrue(hashSetLabelPoint.size() == 4);

        lp4.setLabel("Label A");

        assertTrue(hashSetLabelPoint.size() == 4);
    }

    private int randomNumber() {
        int r = (int) Math.random() * 10;
        return r;
    }

    @Test
    public void testComparable() {
        TreeSet<LabeledPoint> ts = new TreeSet<>();

        LabeledPoint lp1 = new LabeledPoint(7,9,"Label H");
        LabeledPoint lp2 = new LabeledPoint(7,9,"Label G");
        LabeledPoint lp3 = new LabeledPoint(7,9,"Label O");
        LabeledPoint lp4 = new LabeledPoint(7,9,"Label Z");
        LabeledPoint lp5 = new LabeledPoint(7,9,"Label Y");
        LabeledPoint lp6 = new LabeledPoint(7,9,"Label A");
        LabeledPoint lp7 = new LabeledPoint(7,9,"Label L");
        LabeledPoint lp8 = new LabeledPoint(7,9,"Label K");

        ts.add(lp1);
        ts.add(lp2);
        ts.add(lp3);
        ts.add(lp4);
        ts.add(lp5);
        ts.add(lp6);
        ts.add(lp7);
        ts.add(lp8);

        System.out.println(ts);
    }
}






















