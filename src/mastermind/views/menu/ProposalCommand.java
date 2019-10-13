/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mastermind.views.menu;

import java.util.List;
import mastermind.controllers.PlayController;
import mastermind.types.Color;
import mastermind.views.ErrorView;
import mastermind.views.MessageView;
import mastermind.views.console.ProposedCombinationView;
import santaTecla.utils.Console;
import mastermind.types.Error;



/**
 *
 * @author Gabri
 */
public class ProposalCommand extends Command{
    
    private Console console;

    ProposalCommand(PlayController playController) {
        super(MessageView.PROPOSE_COMMAND.getMessage(), playController);
    }

    @Override
    protected void execute() {
        Error error;
        do {
            List<Color> colors = new ProposedCombinationView((PlayController) this.acceptController).read();
            error = ((PlayController) this.acceptController).addProposedCombination(colors);
            if (error != null) {
                this.console.writeln(new ErrorView(error).getMessage());
            }
        } while (error != null);
    }

    @Override
    public boolean isActive() {
        return true;
    }
    
}
