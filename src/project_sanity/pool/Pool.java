package project_sanity.pool;

import java.util.ArrayDeque;
import java.util.Deque;
import project_sanity.ICountable;
import project_sanity.ITypable;
import project_sanity.counter.ACounter;

/**
 *
 * @author nicholas malacarne <nicholas.malacarne@gmail.com>
 */
public class Pool implements ITypable, ICountable {
    
    private final ACounter prototype;
    
    private final Deque<ACounter> counters;

    /**
     * sole constructor
     */
    public Pool(ACounter prototype) {
        this.prototype = prototype;
        
        this.counters = new ArrayDeque<>();
    }

    @Override
    public Class getType() {
        return this.prototype.getClass();
    }

    /**
     *
     * @param counter 
     * @return int
     */
    @Override
    public int addCounter() {
        this.counters.addLast(this.prototype);
        
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
