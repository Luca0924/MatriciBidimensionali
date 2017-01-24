/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package matricibidimensionali;

/**
 *
 * @author luca
 */
public class MatriciBidimensionali {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Matrice m = new Matrice (4, 6);
        m.fillRandom();
        System.out.println(m);
        
        m.toFile("data/matrice.txt");
    }
    
}
