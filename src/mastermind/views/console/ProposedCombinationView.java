package mastermind.views.console;

import java.util.ArrayList;
import java.util.List;
import mastermind.controllers.PlayController;
import mastermind.types.Color;
import mastermind.views.MessageView;
import santaTecla.utils.WithConsoleView;


public class ProposedCombinationView extends WithConsoleView {
    
    private final PlayController playController;

    public ProposedCombinationView(PlayController playController) {
        this.playController = playController;
    }

    void write(int position) {
        for (Color color : this.playController.getColors(position)) {
            new ColorView(color).write();
        }
    }

    public List<Color> read() {
        String characters = this.console.readString(MessageView.PROPOSED_COMBINATION.getMessage());
        List<Color> colors = new ArrayList<Color>();
        for (int i = 0; i < characters.length(); i++) {
            colors.add(ColorView.getInstance(characters.charAt(i)));
        }
        return colors;
    }
	
}
