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
public class RedoController extends Controller{
   
    public RedoController(Session session) {
        super(session);
    }

    public void redo() {
        ((SessionImplementation) this.session).redo();
    }
    
    public boolean redoable(){
        return ((SessionImplementation) this.session).redoable();
    }
    
}
