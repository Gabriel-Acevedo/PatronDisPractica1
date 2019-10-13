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
public class AttemptsDispatcher extends Dispatcher{
    
    public AttemptsDispatcher(PlayControllerImplementation playControllerImplementation){
        super(playControllerImplementation);
    }
    
    @Override
    public void dispatch(){
        this.tcpip.send(((PlayControllerImplementation) this.acceptController).getAttempts());
    }
    
}
