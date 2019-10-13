/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mastermind.views.menu;

import mastermind.controllers.PlayController;
import mastermind.views.MessageView;

/**
 *
 * @author Gabri
 */
public class RedoCommand extends Command{
    
    	RedoCommand(PlayController playController) {
		super(MessageView.REDO_COMMAND.getMessage(), playController);
	}

	@Override
	protected void execute() {
		((PlayController) this.acceptController).redo();
	}

	@Override
	public boolean isActive() {
            return ((PlayController) this.acceptController).redoable();
	}
    
}
