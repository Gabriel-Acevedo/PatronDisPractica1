/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mastermind.models;

import java.util.List;
import mastermind.types.Color;

/**
 *
 * @author Gabri
 */
public class SessionImplementation implements Session{
    
    private State state;

	private Game game;

	private Registry registry;

	private String name;

	public SessionImplementation() {
		this.state = new State();
		this.game = new Game();
		this.registry = new Registry(this.game);
		this.name = null;
	}

	public void next() {
		this.state.next();
	}

	public void addProposedCombination(List<Color> colors) {
		this.game.addProposedCombination(colors);
		this.registry.registry();
	}

	public boolean undoable() {
		return this.registry.undoable();
	}

	public boolean redoable() {
		return this.registry.redoable();
	}

	public void undo() {
		this.registry.undo(this.game);
	}

	public void redo() {
		this.registry.redo(this.game);
	}

	public void resume() {
		this.game.clear();
		this.state.reset();
		this.registry.reset();
		this.name = null;
	}

	public void clearGame() {
		this.game = new Game();		
	}

	public void registry() {
		this.registry = new Registry(this.game);
	}

	public void resetRegistry() {
		this.registry.reset();
	}

	public void setStateValue(StateValue stateValue) {
		this.state.setStateValue(stateValue);
	}

	public boolean isWinner() {
		return this.game.isWinner();
	}

	public boolean isLooser() {
		return this.game.isLooser();
	}

	public List<Color> getColors(int i) {
		return this.game.getColors(i);
	}

	public int getAttempts() {
		return this.game.getAttempts();
	}

	public int getBlacks(int i) {
		return this.game.getBlacks(i);
	}

	public int getWhites(int i) {
		return this.game.getWhites(i);
	}

	public boolean hasName() {
		return this.name != null;
	}

	public Game getGame() {
		return this.game;
	}

	@Override
	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String getName() {
		return this.name;
	}

	@Override
	public int getWidth() {
		return this.game.getWidth();
	}

	@Override
	public StateValue getValueState() {
		return this.state.getValueState();
	}
}
