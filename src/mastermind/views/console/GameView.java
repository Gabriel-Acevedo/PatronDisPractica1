package mastermind.views.console;


import mastermind.controllers.PlayController;
import mastermind.views.MessageView;
import mastermind.views.MessageView;
import mastermind.views.console.ProposedCombinationView;
import mastermind.views.SecretCombinationView;
import mastermind.views.SecretCombinationView;
import mastermind.views.console.AttemptsView;

public class GameView{

    private final PlayController playController;

    public GameView(PlayController playController) {
        this.playController = playController;
    }

    public void writeln() {
        MessageView.NEW_LINE.writeln();
        new AttemptsView(playController).writeln();
        new SecretCombinationView(playController).writeln();
        for (int i = 0; i < playController.getAttempts(); i++) {
            new ProposedCombinationView(playController).write(i);
            new ResultView(playController).writeln(i);
        }
        if (playController.isWinner()) {
            MessageView.WINNER.writeln();
        } else if (playController.isLooser()) {
            MessageView.LOOSER.writeln();
        }
    }

}
