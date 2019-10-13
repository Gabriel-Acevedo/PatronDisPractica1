/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mastermind;

import mastermind.controllers.Logic;
import mastermind.controllers.implementation.LogicImplementation;
import mastermind.models.DAO.SessionImplementationDAO;
import mastermind.views.console.View;
import mastermind.views.graphics.GraphicsView;

/**
 *
 * @author Gabri
 */
public class MastermindStandalone extends Mastermind{


    public static void main(String[] args) {
        new MastermindStandalone().play();
    }

    @Override
    protected Logic createLogic() {
        return new LogicImplementation(new SessionImplementationDAO());
    }

    @Override
    protected View createView() {
        return new GraphicsView();
    }
    
}