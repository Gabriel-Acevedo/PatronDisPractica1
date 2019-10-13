/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mastermind.distributed.dispatchers;

/**
 *
 * @author Gabri
 */
public enum FrameType {
    	START, 
	STATE,
	UNDO, 
	REDO, 
	UNDOABLE, 
	REDOABLE, 
	WINNER, 
	LOOSER, 
	ATTEMPTS, 
	COLORS, 
	PROPOSECOMBINATION, 
	WIDTH,
	NEW_GAME,
	EXISTS, 
	HAS_NAME, 
	SAVE,
	NEXT,
	CLOSE, 
	START_NAME, 
	TITLES, 
	GET_TITLE, 
	SET_TITLE, 
	SAVE_NAMED, 
	BLACKS, 
	WHITES;

	public static FrameType parser(String string) {
		for(FrameType frameType : FrameType.values()) {
			if (frameType.name().equals(string)) {
				return frameType;
			}
		}
		return null;
	}

}
