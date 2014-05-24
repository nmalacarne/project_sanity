package project_sanity.decaypool;

import java.util.ArrayDeque;
import java.util.Deque;
import project_sanity.IDecayable;
import project_sanity.IGrowable;
import project_sanity.IValuable;
import project_sanity.counter.ACounter;
import project_sanity.counter.DecayCounter;

/**
 * Used to manage a 'health' system.
 * 
 * @author nicholas
 * @version %G%
 */
public abstract class ADecayPool implements IDecayable, IGrowable, IValuable {
    
    private final Deque<ACounter> decayPool;

    /**
     * Default constructor
     */
    public ADecayPool() {
        decayPool = new ArrayDeque<>();
    }
    
    /**
     * Increase number of decay counters by one
     */
    @Override
    public void decay() {
        decayPool.add(new DecayCounter());
    }

    /**
     * Decrease number of decay counters by one
     */
    @Override
    public void grow() {
        decayPool.pollFirst();
    }
    
    /**
     * 
     * @return int  current number of decay counters
     */
    @Override
    public int getValue() {
        return decayPool.size();
    }
}
