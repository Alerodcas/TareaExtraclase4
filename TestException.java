/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exc.TareaExtraclase4;

/**
 *
 * @author alero
 */

public class TestException{
    public static void main(String[] args){
        try{
            int result = divideNum(100,5);
            System.out.println("100 dividido entre 5 es:" + result);
            result = divideNum(8,0);
            System.out.println("8 dividido entre 0 es: "+ result);
        
    }catch(Ej1Exception ex){
            System.out.println(ex.getMessage());
    }
    }
    public static int divideNum(int i, int j)throws Ej1Exception{
        if (j==0){
            throw new Ej1Exception("Denominador no puede ser 0");
        }
        return i/j;
    }
    
}

class Ej1Exception extends Exception{
    public Ej1Exception(String message){
        super(message);
    }
}
