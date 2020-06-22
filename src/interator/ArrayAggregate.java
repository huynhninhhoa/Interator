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
public class ArrayAggregate extends Aggregate{
    
    int[] Arr = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
    
    public ArrayAggregate() {
    }
    
    @Override
    public Iterator CreateIterator() {
        return new ConcreteIterator(this);
    }
    
    public int Count(){
        return Arr.length;
    }
    
    public int getItem(int i){
        return Arr[i];
    }
}
