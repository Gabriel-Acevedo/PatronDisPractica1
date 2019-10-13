package mastermind;

import mastermind.controllers.Logic;
import mastermind.controllers.implementation.LogicImplementation;
import mastermind.models.DAO.SessionImplementationDAO;
import mastermind.views.console.View;
import mastermind.views.console.ConsoleView;

public class ConsoleMastermind extends Mastermind{

    protected View createView() {
        return new ConsoleView();
    }

    public static void main(String[] args) {
        new ConsoleMastermind().play();
    }

    @Override
    protected Logic createLogic() {
         return new LogicImplementation(new SessionImplementationDAO());
    }

}
