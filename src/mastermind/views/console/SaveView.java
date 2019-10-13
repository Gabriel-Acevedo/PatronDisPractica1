/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mastermind.views.console;

import mastermind.controllers.SaveController;
import mastermind.views.MessageView;
import mastermind.views.MessageView;
import santaTecla.utils.WithConsoleView;
import santaTecla.utils.YesNoDialog;

/**
 *
 * @author Gabri
 */
public class SaveView extends WithConsoleView{
    
    	void interact(SaveController saveController) {
		boolean save = new YesNoDialog().read(MessageView.SAVE.getMessage());
		String name = null;
		if (save) {
			if (saveController.hasName()) {
				saveController.save();
			} else {
				boolean exists = false;
				do {
					name = this.console.readString(MessageView.NAME.getMessage());
					exists = saveController.exists(name);
					if (exists) {
						this.console.writeln("The proposed name already exists");
					}
				} while (exists);
				saveController.save(name);
			}
		}
		saveController.next();
	}
    
}
