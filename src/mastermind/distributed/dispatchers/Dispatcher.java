/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mastermind.distributed.dispatchers;

import mastermind.controllers.AcceptController;

/**
 *
 * @author Gabri
 */
public abstract class Dispatcher {
    
    protected AcceptController acceptController;
	
    protected TCPIP tcpip;
	
    public Dispatcher (AcceptController acceptorController) {
	this.acceptController = acceptorController;
    }

    public abstract void dispatch();
	
    public void associate(TCPIP tcpip) {
	this.tcpip = tcpip;
    }
    
}
