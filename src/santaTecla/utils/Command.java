/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package santaTecla.utils;

/**
 *
 * @author Gabri
 */
public abstract class Command {
    
    
    protected String title;

    protected Command(String title) {
        this.title = title;
    }

    protected abstract void execute();

    String getTitle() {
        return this.title;
    }

    public abstract boolean isActive();
}
