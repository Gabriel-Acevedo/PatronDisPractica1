/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mastermind.views.menu;

import mastermind.controllers.AcceptController;
import mastermind.controllers.PlayController;
import mastermind.views.MessageView;

/**
 *
 * @author Gabri
 */
class ExitCommand extends Command{

	protected ExitCommand(PlayController playController) {
		super(MessageView.EXIT_COMMAND.getMessage(), playController);
	}

	@Override
	protected void execute() {
		((PlayController) this.acceptController).next();	
	}

	@Override
	public boolean isActive() {
		return true;
	}
    
}
