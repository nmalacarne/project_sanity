/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package project_sanity.attribute;

import project_sanity.range.Range;

/**
 *
 * @author nicholas
 */
public class Strength extends AAttribute {
    
    private final Range validRange;

    public Strength() {
        validRange = new Range(1, 10);
    }

    @Override
    public void decay() {
        super.decay();
    }

    @Override
    public void grow() {
        super.grow();
    }

    @Override
    public int getValue() {
        int total = validRange.getMAX() - super.getValue();
        return validRange.rangeCheck(total);
    }

    @Override
    public String toString() {
        return this.getClass().getSimpleName();
    }
}
