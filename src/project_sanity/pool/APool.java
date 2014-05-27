package project_sanity.pool;

import java.util.ArrayDeque;
import java.util.Deque;
import project_sanity.ICountable;
import project_sanity.counter.ACounter;

/**
 *
 * @author nicholas malacarne <nicholas.malacarne@gmail.com>
 */
public class APool implements ICountable {
    
    private final Deque<ACounter> counters;

    /**
     * sole constructor
     */
    public APool() {
        this.counters = new ArrayDeque<>();
    }

    /**
     *
     * @param counter 
     * @return int
     */
    @Override
    public int addCounter(ACounter counter) {
        this.counters.addLast(counter);
        
        return this.getCount();
    }

    /**
     *
     * @return int 
     */
    @Override
    public int removeCounter() {
        this.counters.pollFirst();
        
        return this.getCount();
    }

    /**
     *
     * @return int
     */
    @Override
    public int getCount() {
        return this.counters.size();
    }
}
