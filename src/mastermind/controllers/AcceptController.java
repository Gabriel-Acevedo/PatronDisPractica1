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
public abstract class AcceptController extends Controller{

    public AcceptController(Session session) {
        super(session);
    }

    
    public abstract void accept(ControllersVisitor controllersVisitor);
    
}
