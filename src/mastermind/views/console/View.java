package mastermind.views.console;

import mastermind.controllers.AcceptController;
import mastermind.controllers.ControllersVisitor;

public abstract class View implements ControllersVisitor {

    public void interact(AcceptController acceptController) {
        acceptController.accept(this);
    }


}
