/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mastermind.distributed;

import mastermind.distributed.dispatchers.DispatcherPrototype;
import mastermind.models.DAO.SessionImplementationDAO;

/**
 *
 * @author Gabri
 */
public class MastermindServer {
    
    private DispatcherPrototype dispatcherPrototype;

    private LogicImplementationServer logic;

    private MastermindServer() {
	this.dispatcherPrototype = new DispatcherPrototype();
	this.logic = new LogicImplementationServer(new SessionImplementationDAO());
	this.logic.createDispatchers(this.dispatcherPrototype);
    }
    
    private void serve() {
    	this.dispatcherPrototype.serve();
    }

    public static void main(String[] args) {
	new MastermindServer().serve();
    }
}
