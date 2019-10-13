/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mastermind.models;

/**
 *
 * @author Gabri
 */
public interface Session {
    
    StateValue getValueState();
    int getWidth();
    String getName();
    void setName(String title);
}
