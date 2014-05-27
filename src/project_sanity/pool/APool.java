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

    public APool() {
        this.counters = new ArrayDeque<>();
    }

    @Override
    public int addCounter(ACounter counter) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public int removeCounter() {
        throw new UnsupportedOperationException("Not supported yet.");
    }
}
