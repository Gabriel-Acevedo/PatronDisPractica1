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
public class UndoCommand extends Command{
    
	UndoCommand(PlayController playController) {
		super(MessageView.UNDO_COMMAND.getMessage(), playController);
	}

	@Override
	protected void execute() {
		((PlayController) this.acceptController).undo();
	}

	@Override
	public boolean isActive() {
		return ((PlayController) this.acceptController).undoable();
	}
    
}
