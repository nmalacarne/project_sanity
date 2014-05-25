package project_sanity.pool.wound;

import project_sanity.IMendable;
import project_sanity.IValuable;
import project_sanity.IWoundable;

/**
 *
 * @author nicholas malacarne <nicholas.malacarne@gmail.com>
 */
public class WoundPool implements IWoundable, IMendable, IValuable {

    @Override
    public void wound() {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public void mend() {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public int getValue() {
        throw new UnsupportedOperationException("Not supported yet.");
    }
}
