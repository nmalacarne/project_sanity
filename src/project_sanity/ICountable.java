package project_sanity;

import project_sanity.counter.ACounter;

/**
 *
 * @author nicholas malacarne <nicholas.malacarne@gmail.com>
 */
public interface ICountable {

    int addCounter(ACounter counter);
    int removeCounter();
}
