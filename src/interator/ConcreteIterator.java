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
public class ConcreteIterator extends Iterator{

    ArrayAggregate Arr;
    int i = 0;

    public ConcreteIterator(){
        //
    }
    
    public ConcreteIterator(ArrayAggregate arr){
        this.Arr=arr;
    }

    @Override
    public int First() {
        return Arr.getItem(i);
    }

    @Override
    public int Next() {
        int a = Arr.getItem(i);
        i = i + 1;
        
        return a;
    }

    @Override
    public boolean isDone() {
        if(i == Arr.Count())
            return true;
        else            
            return false;
    }

    @Override
    public int CurrentItem() {
        return Arr.getItem(i);
    }

    
    
    
    
}
