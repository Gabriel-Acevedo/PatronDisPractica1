/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mastermind.views.menu;

import mastermind.controllers.StartController;

/**
 *
 * @author Gabri
 */
public class GameSelectCommand extends Command{
    
    
    protected GameSelectCommand(String title, StartController startController) {
	super(title, startController);
    }

	@Override
	protected void execute() {
		System.out.println(this.title);
		((StartController) this.acceptController).start(this.title);
	}

	@Override
	public boolean isActive() {
		return true;
	}
    
}
