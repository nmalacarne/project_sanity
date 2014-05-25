package project_sanity.decaypool;

import java.util.ArrayDeque;
import java.util.Deque;
import project_sanity.IDecayable;
import project_sanity.IGrowable;
import project_sanity.IValuable;
import project_sanity.counter.ACounter;
import project_sanity.counter.DecayCounter;

/**
 * Used to manage a deque of decay counters.
 * 
 * @author nicholas
 * @version %G%
 */
public class DecayPool implements IDecayable, IGrowable, IValuable {
    
    private final Deque<ACounter> pool;

    /**
     * Default constructor
     */
    public DecayPool() {
        pool = new ArrayDeque<>();
    }
    
    /**
     * Increase number of decay counters by one
     */
    @Override
    public void decay() {
        pool.add(new DecayCounter());
    }

    /**
     * Decrease number of decay counters by one
     */
    @Override
    public void grow() {
        pool.pollFirst();
    }
    
    /**
     * 
     * @return int  current number of decay counters
     */
    @Override
    public int getValue() {
        return pool.size();
    }
}
