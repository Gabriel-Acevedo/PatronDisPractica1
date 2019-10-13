package mastermind;

import mastermind.controllers.Logic;
import mastermind.controllers.implementation.LogicImplementation;
import mastermind.models.DAO.SessionImplementationDAO;
import mastermind.views.console.View;
import mastermind.views.graphics.GraphicsView;

public class GraphicsMastermind extends Mastermind{

    protected View createView() {
        return new GraphicsView();
    }

    public static void main(String[] args) {
        new GraphicsMastermind().play();
    }

    @Override
    protected Logic createLogic() {
         return new LogicImplementation(new SessionImplementationDAO());
    }
    
}
