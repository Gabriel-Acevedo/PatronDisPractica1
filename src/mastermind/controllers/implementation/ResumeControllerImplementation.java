/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mastermind.controllers.implementation;

import mastermind.controllers.ResumeController;
import mastermind.models.Session;
import mastermind.models.SessionImplementation;

/**
 *
 * @author Gabri
 */
public class ResumeControllerImplementation extends ResumeController{

        public ResumeControllerImplementation(Session session) {
        super(session);
    }

    @Override
    public void resume(boolean newGame) {
        if (newGame) {
            ((SessionImplementation) this.session).resume();
        } else {
            ((SessionImplementation) this.session).next();
        }
    }
    
}
