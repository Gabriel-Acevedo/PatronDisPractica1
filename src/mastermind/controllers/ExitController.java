/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mastermind.controllers;

import mastermind.models.Session;
import mastermind.models.SessionImplementation;

/**
 *
 * @author Gabri
 */
public class ExitController extends Controller{

    public ExitController(Session session) {
        super(session);
    }

    public void next() {
        ((SessionImplementation) this.session).next();
    }   
    
    
}
