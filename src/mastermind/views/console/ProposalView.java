package mastermind.views.console;


import mastermind.controllers.PlayController;
import mastermind.views.menu.PlayMenu;
import santaTecla.utils.WithConsoleView;

public class ProposalView extends WithConsoleView {
    
    void interact(PlayController playController) {
        new PlayMenu(playController).execute();
    }

}
