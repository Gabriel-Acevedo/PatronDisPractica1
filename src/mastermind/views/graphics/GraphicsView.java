package mastermind.views.graphics;

import mastermind.controllers.AcceptController;
import mastermind.controllers.PlayController;
import mastermind.controllers.ProposalController;
import mastermind.controllers.ResumeController;
import mastermind.controllers.SaveController;
import mastermind.controllers.StartController;
import mastermind.views.console.View;

public class GraphicsView extends View {

	 private GameView gameView;

    public GraphicsView() {
        this.gameView = new GameView();
    }

    @Override
    public void visit(StartController startController) {
        this.gameView.interact(startController);
    }

    
    public void visit(ProposalController proposalController) {
        this.gameView.interact(proposalController);
    }

    @Override
    public void visit(ResumeController resumeController) {
        ResumeDialog resumeDialog = new ResumeDialog();
        resumeController.resume(resumeDialog.isNewGame());
        if (resumeDialog.isNewGame()) {
            this.gameView = new GameView();
        } else {
            this.gameView.setVisible(false);
            System.exit(0);
        }
    }

    @Override
    public void visit(PlayController playController) {
    }

    @Override
    public void visit(SaveController saveController) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
