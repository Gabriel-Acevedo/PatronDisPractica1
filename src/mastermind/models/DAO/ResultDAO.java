/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mastermind.models.DAO;

import java.io.BufferedReader;
import java.io.FileWriter;
import java.io.IOException;
import mastermind.models.Result;

/**
 *
 * @author Gabri
 */
public class ResultDAO implements DAO{

    private Result result;
    
    ResultDAO(Result result){
        this.result=result;
    }
    
    @Override
    public void save(FileWriter fileWriter) {
        try{
            fileWriter.write(this.result.getBlacks() + "\n");
            fileWriter.write(this.result.getWhites() + "\n");
        }catch(IOException e){
            e.printStackTrace();
        }
    }

    @Override
    public void load(BufferedReader bufferedReader) {
        try{
            this.result.setBlacks(Integer.parseInt(bufferedReader.readLine()));
            this.result.setWhites(Integer.parseInt(bufferedReader.readLine()));
        }catch(IOException e){
            e.printStackTrace();
        }
    }
    
    public Result getResult() {
	return this.result;
    }
    
}
