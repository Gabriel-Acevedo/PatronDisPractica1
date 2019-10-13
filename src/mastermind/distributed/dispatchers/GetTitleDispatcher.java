/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mastermind.distributed.dispatchers;

import mastermind.controllers.implementation.SaveControllerImplementation;

/**
 *
 * @author Gabri
 */
public class GetTitleDispatcher extends Dispatcher{
    
    public GetTitleDispatcher(SaveControllerImplementation saveControllerImplementation){
        super(saveControllerImplementation);
    }
    
    @Override
    public void dispatch() {
	this.tcpip.send(this.acceptController.getName());
    }
    
}
