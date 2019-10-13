package mastermind.views.console;

import mastermind.controllers.AcceptController;
import mastermind.controllers.PlayController;
import mastermind.controllers.ResumeController;
import mastermind.controllers.SaveController;
import mastermind.controllers.StartController;

public class ConsoleView extends View {

    private StartView startView;

    private ProposalView proposalView;

    private ResumeView resumeView;
    
    private SaveView saveView;
    
    public ConsoleView() {
        this.startView = new StartView();
        this.proposalView = new ProposalView();
        this.resumeView = new ResumeView();
    }

    @Override
    public void visit(StartController startController) {
        this.startView.interact(startController);
    }

    @Override
    public void visit(PlayController inGameController) {
        this.proposalView.interact(inGameController);
    }

    @Override
    public void visit(ResumeController resumeController) {
        this.resumeView.interact(resumeController);
    }
    
    @Override
    public void visit(SaveController saveController) {
        this.saveView.interact(saveController);
    }

    @Override
    public void interact(AcceptController acceptorController) {
        acceptorController.accept(this);
    }

}
