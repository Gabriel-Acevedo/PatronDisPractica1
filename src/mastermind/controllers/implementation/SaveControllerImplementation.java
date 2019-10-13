/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mastermind.controllers.implementation;

import mastermind.controllers.SaveController;
import mastermind.models.DAO.SessionImplementationDAO;
import mastermind.models.Session;
import mastermind.models.SessionImplementation;

/**
 *
 * @author Gabri
 */
public class SaveControllerImplementation extends SaveController{

    private final SessionImplementationDAO sessionImplementationDAO;    
    
    SaveControllerImplementation(Session session, SessionImplementationDAO sessionImplementationDAO) {
        super(session);
        this.sessionImplementationDAO = sessionImplementationDAO;
    }
    
    @Override
    public void save(String name) {
        this.sessionImplementationDAO.save(name);
    }

    @Override
    public void save() {
        this.sessionImplementationDAO.save();
    }

    @Override
    public void next() {
        ((SessionImplementation) this.session).next();
    }

    @Override
    public boolean hasName() {
        return ((SessionImplementation) this.session).hasName();
    }

    @Override
    public boolean exists(String name) {
        return this.sessionImplementationDAO.exists(name);
    }
    
    
    
}
