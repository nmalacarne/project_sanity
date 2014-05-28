/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package project_sanity.essence.energy;

import java.util.logging.Logger;
import project_sanity.essence.AEssence;
import project_sanity.range.Range;

/**
 *
 * @author nicholas malacarne <nicholas.malacarne@gmail.com>
 */
public class Energy extends AEssence {

    private final static Logger LOG = Logger.getLogger(Energy.class.getName());
    
    private final Range range;

    public Energy() {
        this.range = new Range(0, 10);
    }
    
    @Override
    public void decay() {
        if (super.getValue() < range.getMAX()){
            super.decay();
        }else{
            // alert energy empty -nm
        }
    }

    @Override
    public void grow() {
        if (super.getValue() > range.getMIN()){
            super.grow();
        }else{
            // alert energy full -nm
        }
    }
    
    @Override
    public int getValue() {
        int total = this.range.getMAX() - super.getValue();
        return range.rangeCheck(total);
    }

    @Override
    public String toString() {
        return this.getClass().getSimpleName();
    }
}
