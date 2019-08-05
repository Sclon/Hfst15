package com.company;

import org.junit.Test;

import java.util.HashSet;

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
}