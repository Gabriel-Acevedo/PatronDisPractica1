/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mastermind.views.menu;

import mastermind.controllers.StartController;
import santaTecla.utils.Menu;

/**
 *
 * @author Gabri
 */
public class GameSelectMenu extends Menu{
   
    GameSelectMenu(StartController startController) {
    	String[] gamesNames = startController.getGamesNames();
	for (String title : gamesNames) {
		this.addCommand(new GameSelectCommand(title, startController));
	}
    }
    
}
