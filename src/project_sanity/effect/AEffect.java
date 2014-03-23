/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package project_sanity.effect;

import project_sanity.IDecayable;

/**
 *
 * @author nicholas
 */
public abstract class AEffect implements IDecayable {

    @Override
    public abstract void decay();
}
