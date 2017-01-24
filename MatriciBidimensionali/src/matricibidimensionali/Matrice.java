package matricibidimensionali;


import java.io.FileWriter;
import java.io.IOException;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author luca
 */
public class Matrice {
    
    int [][] theMatrix;
    
    public Matrice(int x, int y){
        theMatrix = new int[x][y];
    }
    
    public Matrice(int[][] m){
        theMatrix = m;
    }
    
    
    public void fillRandom(){
        for (int i = 0; i < theMatrix.length; i++) {
            for (int j = 0; j < theMatrix[i].length; j++) {
                theMatrix[i][j] = (int) (Math.random()*10);
            }
            
        }
    }
    
   @Override
   public String toString(){
       String s="";
       for (int i = 0; i < theMatrix.length; i++) {
           for (int j = 0; j < theMatrix[i].length; j++) {
               s += theMatrix[i][j]+"\t";
           }
           s+="\n";
       }
       return s;
   }
   public void toFile(String filename){
       try{
           
           FileWriter out=new FileWriter(filename);
           out.write(this.toString());
           out.close();
       }catch(IOException ex){
           System.out.println("Errore: "+ex.getMessage());
       }
   }
}
