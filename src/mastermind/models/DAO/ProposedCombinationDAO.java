/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mastermind.models.DAO;

import mastermind.models.ProposedCombination;


/**
 *
 * @author Gabri
 */
public class ProposedCombinationDAO extends CombinationDAO{

   ProposedCombinationDAO(ProposedCombination proposedCombination){
       super(proposedCombination);
   }
       
   ProposedCombination getProposedCombination(){ 
    return (ProposedCombination) this.combination;
   }
   
}
