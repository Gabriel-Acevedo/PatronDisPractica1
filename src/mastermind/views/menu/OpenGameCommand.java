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
public class OpenGameCommand extends Command{

    	protected OpenGameCommand(StartController startController) {
		super(MessageView.OPENGAME_COMMAND.getMessage(), startController);
	}

	@Override
	protected void execute() {
		new GameSelectMenu((StartController) this.acceptController).execute();
	}

	@Override
	public boolean isActive() {
		return true;
	}
    
}
