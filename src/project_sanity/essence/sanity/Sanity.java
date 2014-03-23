/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package project_sanity.essence.sanity;

import java.util.ArrayDeque;
import java.util.Deque;
import project_sanity.IMendable;
import project_sanity.IWoundable;
import project_sanity.counter.ACounter;
import project_sanity.counter.WoundCounter;
import project_sanity.essence.AEssence;
import project_sanity.range.Range;

/**
 *
 * @author nicholas
 */
public class Sanity extends AEssence implements IWoundable, IMendable {

    private final Range validRange;
    
    private final Deque<ACounter> delusionPool;

    public Sanity() {
        validRange = new Range(0, 100);
        delusionPool = new ArrayDeque<>();
    }

    @Override
    public void wound() {
        delusionPool.add(new WoundCounter());
    }

    @Override
    public void mend() {
        delusionPool.pollFirst();
    }
    
    @Override
    public void decay() {
        if (super.getValue() < validRange.getMAX()){
            super.decay();
        }else{
            // alert sanity empty -nm
        }
    }

    @Override
    public void grow() {
        if (super.getValue() > validRange.getMIN()){
            super.grow();
        }else{
            // alert sanity full -nm
        }
    }
    
    @Override
    public int getValue() {
        int total = validRange.getMAX() - delusionPool.size() - super.getValue();
        return validRange.rangeCheck(total);
    }

    @Override
    public String toString() {
        return this.getClass().getSimpleName();
    }
}
