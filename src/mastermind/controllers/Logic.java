package mastermind.controllers;

import java.util.HashMap;
import java.util.Map;


import mastermind.models.Session;
import mastermind.models.StateValue;

public class Logic {
    
        protected Session session;
	
	protected Map<StateValue, AcceptController> acceptController;
		
	public Logic() {
            this.acceptController=new HashMap<StateValue, AcceptController>();
        }
	
	public AcceptController getController() {
		return this.acceptController.get(this.session.getValueState());
	}
	
}
