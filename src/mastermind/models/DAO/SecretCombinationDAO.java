/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mastermind.models.DAO;

import java.io.BufferedReader;
import mastermind.models.SecretCombination;

/**
 *
 * @author Gabri
 */
public class SecretCombinationDAO extends CombinationDAO{

    	SecretCombinationDAO(SecretCombination secretCombination) {
		super(secretCombination);
	}
	
	public void load(BufferedReader bufferedReader) {
		this.combination.clearColors();
		super.load(bufferedReader);
	}
   
}
