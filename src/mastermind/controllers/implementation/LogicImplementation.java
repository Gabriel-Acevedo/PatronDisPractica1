/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mastermind.controllers.implementation;

import mastermind.controllers.Logic;
import mastermind.models.DAO.SessionImplementationDAO;
import mastermind.models.SessionImplementation;
import mastermind.models.StateValue;

/**
 *
 * @author Gabri
 */
public class LogicImplementation extends Logic{
    
	protected SessionImplementationDAO sessionImplementationDAO;

	protected StartControllerImplementation startControllerImplementation;

	protected PlayControllerImplementation playControllerImplementation;

	protected SaveControllerImplementation saveControllerImplementation;

	protected ResumeControllerImplementation resumeControllerImplementation;

	public LogicImplementation(SessionImplementationDAO sessionImplementationDAO) {
		this.session = new SessionImplementation();
		this.sessionImplementationDAO = sessionImplementationDAO;
		this.sessionImplementationDAO.associate((SessionImplementation) this.session);
		this.startControllerImplementation = new StartControllerImplementation(this.session,this.sessionImplementationDAO);
		this.playControllerImplementation = new PlayControllerImplementation(this.session);
		this.saveControllerImplementation = new SaveControllerImplementation(this.session,this.sessionImplementationDAO);
		this.resumeControllerImplementation = new ResumeControllerImplementation(this.session);
		this.acceptController.put(StateValue.INITIAL, this.startControllerImplementation);
		this.acceptController.put(StateValue.IN_GAME, this.playControllerImplementation);
		this.acceptController.put(StateValue.SAVE, this.saveControllerImplementation);
		this.acceptController.put(StateValue.FINAL, this.resumeControllerImplementation);
		this.acceptController.put(StateValue.EXIT, null);
	}
    
}
