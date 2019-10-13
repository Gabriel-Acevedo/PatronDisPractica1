/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mastermind.models.DAO;

import java.io.BufferedReader;
import java.io.FileWriter;

/**
 *
 * @author Gabri
 */
public interface DAO {
    
    void save(FileWriter fileWriter);

    void load(BufferedReader bufferedReader);

    
}
