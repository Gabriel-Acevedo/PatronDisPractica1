/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mastermind.views.menu;

import mastermind.controllers.PlayController;
import santaTecla.utils.Menu;

/**
 *
 * @author Gabri
 */
public class PlayMenu extends Menu{
    
        public PlayMenu(PlayController playController) { 
        this.addCommand(new ProposalCommand(playController));
        this.addCommand(new UndoCommand(playController));
        this.addCommand(new RedoCommand(playController));
        this.addCommand(new ExitCommand(playController));
    }
    
}
