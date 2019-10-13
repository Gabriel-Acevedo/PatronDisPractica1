package mastermind.views.graphics;

import java.awt.GridBagLayout;

import javax.swing.JLabel;
import javax.swing.JPanel;
import mastermind.controllers.Controller;

import mastermind.controllers.StartController;
import mastermind.views.MessageView;

@SuppressWarnings("serial")
class SecretCombinationView extends JPanel {

	private Controller controller;
	
	SecretCombinationView(Controller controller) {
		super();
		this.controller = controller;
	}
	
	void writeln() {
		for (int i = 0; i < this.controller.getWidth(); i++) {
			MessageView.SECRET.write();
		}
		MessageView.NEW_LINE.writeln();
	}
}
