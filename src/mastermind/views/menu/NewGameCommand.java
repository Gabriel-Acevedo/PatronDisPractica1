/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mastermind.views.menu;

import mastermind.controllers.StartController;
import mastermind.views.MessageView;

/**
 *
 * @author Gabri
 */
public class NewGameCommand extends Command{
    
    	protected NewGameCommand(StartController startController) {
		super(MessageView.NEWGAME_COMMAND.getMessage(), startController);
	}

	@Override
	protected void execute() {
		((StartController) this.acceptController).start();
	}

	@Override
	public boolean isActive() {
		return true;
	}
}
