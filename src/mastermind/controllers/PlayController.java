/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mastermind.controllers;


import java.util.List;
import mastermind.models.Session;
import mastermind.types.Color;
import mastermind.types.Error;


/**
 *
 * @author Gabri
 */
public abstract class PlayController extends AcceptController{

    protected PlayController(Session session) {
        super(session);
    }

    public abstract Error addProposedCombination(List<Color> colors);

    public abstract void undo();

    public abstract void redo();

    public abstract void next();

    public abstract boolean undoable();

    public abstract boolean redoable();

    public abstract boolean isWinner();

    public abstract boolean isLooser();

    public abstract int getBlacks(int position);

    public abstract int getWhites(int position);

    public abstract int getAttempts();
    
    public abstract List<Color> getColors(int position);

    @Override
    public void accept(ControllersVisitor controllersVisitor) {
        controllersVisitor.visit(this);
    }
    
}
