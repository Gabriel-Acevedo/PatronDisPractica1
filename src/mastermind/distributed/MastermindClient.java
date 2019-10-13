/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mastermind.distributed;

import mastermind.Mastermind;
import mastermind.controllers.Logic;
import mastermind.views.console.View;

/**
 *
 * @author Gabri
 */
public class MastermindClient extends Mastermind{

    private LogicProxy logicProxy;

    @Override
    protected Logic createLogic() {
        this.logicProxy = new LogicProxy();
        return this.logicProxy;
    }

    @Override
    protected void play() {
        super.play();
        this.logicProxy.close();
    }

    public static void main(String[] args) {
        new MastermindClient().play();
    }

    @Override
    protected View createView() {
        return null;   
    }
    
}
