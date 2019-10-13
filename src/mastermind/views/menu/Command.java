/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mastermind.views.menu;

import mastermind.controllers.AcceptController;
import santaTecla.utils.Console;

/**
 *
 * @author Gabri
 */
public abstract class Command extends santaTecla.utils.Command{
    
    	protected AcceptController acceptController;

	protected Command(String title, AcceptController acceptorController) {
		super(title);
		this.acceptController = acceptorController;
	}
    
}
