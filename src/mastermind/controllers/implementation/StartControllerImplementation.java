/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mastermind.controllers.implementation;

import mastermind.controllers.StartController;
import mastermind.models.DAO.SessionImplementationDAO;
import mastermind.models.Session;
import mastermind.models.SessionImplementation;

/**
 *
 * @author Gabri
 */
public class StartControllerImplementation extends StartController{

    private SessionImplementationDAO sessionImplementationDAO;
    
    public StartControllerImplementation(Session session, SessionImplementationDAO sessionImplementationDAO) {
        super(session);
        this.sessionImplementationDAO = sessionImplementationDAO;
    }
    
    @Override
    public void start(){
        ((SessionImplementation) this.session).next();
    }
    
    
    public void start(String name){
        this.sessionImplementationDAO.load(name);
    }
    
    public String[] getGamesNames(){
        return this.sessionImplementationDAO.getGamesNames();
    }
    
}
