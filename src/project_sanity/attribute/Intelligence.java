/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package project_sanity.attribute;

/**
 *
 * @author nicholas
 */
public class Intelligence extends AAttribute {

    public Intelligence(int value) {
        super(value);
    }

    @Override
    public void decay() {
        super.decay();
    }

    @Override
    public void grow() {
        super.grow();
    }

    @Override
    public String toString() {
        return this.getClass().getSimpleName();
    }
}
