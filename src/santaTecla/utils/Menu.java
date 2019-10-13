/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package santaTecla.utils;

import santaTecla.utils.Command;
import java.util.ArrayList;
import santaTecla.utils.ClosedInterval;
import santaTecla.utils.Console;

/**
 *
 * @author Gabri
 */
public abstract class Menu {
    private static final String OPTION = "Choose an option: ";
    private Console cons;
    private ArrayList<Command> commandList;
    
    public void execute() {
        ArrayList<Command> commands = new ArrayList<Command>();
        for (int i = 0; i < this.commandList.size(); i++) {
            if (this.commandList.get(i).isActive()) {
                commands.add(this.commandList.get(i));
            }
        }
        boolean error;
        int option;
        do {
            error = false;
            for (int i = 0; i < commands.size(); i++) {
                cons.writeln((i + 1) + ") " + commands.get(i).getTitle());
            }
            cons.write(OPTION);
            option = cons.readInt("") - 1;
            if (!new ClosedInterval(0, commands.size() - 1).includes(option)) {
                error = true;
            }
            cons.writeln();
        } while (error);
        commands.get(option).execute();
    }
    
        protected void addCommand(Command command) {
        this.commandList.add(command);
    }
}
