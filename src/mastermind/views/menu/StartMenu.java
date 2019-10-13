/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mastermind.views.menu;

import santaTecla.utils.Menu;
import mastermind.controllers.StartController;

/**
 *
 * @author Gabri
 */
public class StartMenu extends Menu{
    
    public StartMenu(StartController startController) {
	this.addCommand(new NewGameCommand(startController));
	this.addCommand(new OpenGameCommand(startController));
    }
    
}
