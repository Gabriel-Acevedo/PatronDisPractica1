/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mastermind.distributed.dispatchers;

import mastermind.controllers.implementation.PlayControllerImplementation;

/**
 *
 * @author Gabri
 */
public class NextDispatcher extends Dispatcher{

    public NextDispatcher(PlayControllerImplementation playControllerImplementation){
        super(playControllerImplementation);
    }
    
    @Override
    public void dispatch() {
        ((PlayControllerImplementation) this.acceptController).next();
    }
    
}
