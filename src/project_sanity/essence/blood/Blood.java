/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package project_sanity.essence.blood;

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
public class Blood extends AEssence implements IWoundable, IMendable {
    
    private final Range validRange;
    
    private final Deque<ACounter> woundPool;

    public Blood() {
        validRange = new Range(0, 100);
        woundPool = new ArrayDeque<>();
    }

    @Override
    public void wound() {
        woundPool.add(new WoundCounter());
    }

    @Override
    public void mend() {
        woundPool.pollFirst();
    }
    
    @Override
    public void decay() {
        if (super.getValue() < validRange.getMAX()){
            super.decay();
        }else{
            // alert blood empty -nm
        }
    }

    @Override
    public void grow() {
        if (super.getValue() > validRange.getMIN()){
            super.grow();
        }else{
            // alert blood full -nm
        }
    }
    
    @Override
    public int getValue() {
        return validRange.getMAX() - woundPool.size() - super.getValue();
    }

    @Override
    public String toString() {
        return this.getClass().getSimpleName();
    }
}
