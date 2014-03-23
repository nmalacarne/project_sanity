/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package project_sanity.essence;

import java.util.ArrayDeque;
import java.util.Deque;
import project_sanity.IDecayable;
import project_sanity.IGrowable;
import project_sanity.IValuable;
import project_sanity.counter.ACounter;
import project_sanity.counter.DecayCounter;

/**
 *
 * @author nicholas
 */
public abstract class AEssence implements IDecayable, IGrowable, IValuable {
    
    private final Deque<ACounter> decayPool;

    public AEssence() {
        decayPool = new ArrayDeque<>();
    }
    
    @Override
    public void decay() {
        decayPool.add(new DecayCounter());
    }

    @Override
    public void grow() {
        decayPool.pollFirst();
    }
    
    @Override
    public int getValue() {
        return decayPool.size();
    }
}
