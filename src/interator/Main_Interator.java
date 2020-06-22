/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package interator;

/**
 *
 * @author Administrator
 */
public class Main_Interator {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        ArrayAggregate arr = new ArrayAggregate();
        
        Iterator iterator = arr.CreateIterator();
        
        while(! iterator.isDone()){
            System.out.println(iterator.Next());
            
        }
    }
    
}
