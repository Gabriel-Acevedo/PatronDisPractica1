package mastermind.views.graphics;

import javax.swing.JLabel;
import mastermind.views.MessageView;

class AttemptsView extends JLabel{


    AttemptsView(int attempts) {
        this.setText(MessageView.ATTEMPTS.getMessage().replaceFirst("#attempts", "" + (attempts)));
    }

}
