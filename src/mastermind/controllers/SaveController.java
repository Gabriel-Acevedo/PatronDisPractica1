/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mastermind.controllers;

import mastermind.models.Session;

/**
 *
 * @author Gabri
 */
public abstract class SaveController extends AcceptController{
    
    public SaveController(Session session) {
        super(session);
    }

    public abstract void save(String name);
    
    public abstract void save();

    public abstract void next();

    public abstract boolean hasName();

    public abstract boolean exists(String readString);

    @Override
    public void accept(ControllersVisitor controllersVisitor) {
        controllersVisitor.visit(this);
    }
    
}
