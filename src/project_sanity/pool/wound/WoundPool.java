package project_sanity.pool.wound;

import project_sanity.IMendable;
import project_sanity.IWoundable;

/**
 *
 * @author nicholas malacarne <nicholas.malacarne@gmail.com>
 */
public class WoundPool implements IWoundable, IMendable {

    @Override
    public void wound() {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public void mend() {
        throw new UnsupportedOperationException("Not supported yet.");
    }
}
