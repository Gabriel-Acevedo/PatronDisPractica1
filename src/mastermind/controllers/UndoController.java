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
public class UndoController extends Controller{

    public UndoController(Session sesion) {
        super(sesion);
    }

    public void undo() {
        ((SessionImplementation) this.session).undo();
    }
    
    public boolean undoable(){
        return ((SessionImplementation) this.session).undoable();
    }

    
}
