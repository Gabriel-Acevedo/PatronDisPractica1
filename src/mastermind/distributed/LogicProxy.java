/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mastermind.distributed;

import mastermind.controllers.Logic;
import mastermind.controllers.StartController;
import mastermind.distributed.dispatchers.TCPIP;
import mastermind.models.StateValue;

/**
 *
 * @author Gabri
 */
public class LogicProxy extends Logic{
   
    private TCPIP tcpip;
    
    public LogicProxy(){
        this.tcpip = TCPIP.createClientSocket();
        this.session = new SessionProxy(this.tcpip);
        this.acceptController.put(StateValue.INITIAL, new StartControllerProxy(this.session, this.tcpip));
        this.acceptController.put(StateValue.IN_GAME, new PlayControllerProxy(this.session, this.tcpip));
        this.acceptController.put(StateValue.SAVE, new SaveControllerProxy(this.session, this.tcpip));
        this.acceptController.put(StateValue.FINAL, new ResumeControllerProxy(this.session, this.tcpip));
        this.acceptController.put(StateValue.EXIT, null);
    }
    
    public void close(){
        this.tcpip.close();
    }
    
}
