package project_sanity.decaypool;

import java.util.ArrayDeque;
import java.util.Deque;
import project_sanity.IDecayable;
import project_sanity.IGrowable;
import project_sanity.IValuable;
import project_sanity.counter.DecayCounter;

/**
 * Decay can represent the amount of damage taken or the cooldown
 * for a skill.
 * 
 * @author nicholas malacarne <nicholas.malacarne@gmail.com>
 */
public class DecayPool implements IDecayable, IGrowable, IValuable {
    
    private final Deque< DecayCounter > pool;

    /**
     * Default constructor
     */
    public DecayPool() {
        this.pool = new ArrayDeque<>();
    }
    
    /**
     * Increase number of decay counters by one
     */
    @Override
    public void decay() {
        this.pool.add( new DecayCounter() );
    }

    /**
     * Decrease number of decay counters by one
     */
    @Override
    public void grow() {
        this.pool.pollFirst();
    }
    
    /**
     * 
     * @return int  current number of decay counters
     */
    @Override
    public int getValue() {
        return this.pool.size();
    }
}
