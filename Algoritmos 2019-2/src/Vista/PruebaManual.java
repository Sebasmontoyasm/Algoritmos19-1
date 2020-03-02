/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vista;

import Modelo.Algoritmos;
import java.util.ArrayList;

/**
 *
 * @author Remote
 */
public class PruebaManual {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
      /**  
      //  int arr[] = { 12, 11, 13, 5, 6 }; 
        Algoritmos ob = new Algoritmos(); 
      //  ob.sort(arr); 
  
      //  printArray(arr); 
        
        //System.out.println("resultado: "+ob.GCD2(3918848,1653264));
      //  System.out.println("residuo: "+48%23);
      
        //System.out.println("punto 9 taller es igual a :"+ob.point9(2));
        
        ArrayList<Integer> vector = new ArrayList<>();
        
        vector.add(29);
        vector.add(25);
        vector.add(3);
        vector.add(49);
        vector.add(9);
        vector.add(37);
        vector.add(21);
        vector.add(43);
            
        //ob.Bucket(vector);
        
        ArrayList<Integer> vector2 = new ArrayList<>();
        
        vector2.add(1);
        vector2.add(4);
        vector2.add(1);
        vector2.add(2);
        vector2.add(7);
        vector2.add(5);
        vector2.add(2);
            
        ob.Counting(vector2);
        **/
        Algoritmos ob = new Algoritmos();
        int [] denominaciones = {5,2,4,5,8};
        ob.MultiMatrices(denominaciones);
      
    }
    
    /* A utility function to print array of size n*/
    static void printArray(int arr[]) 
    { 
        int n = arr.length; 
        for (int i = 0; i < n; ++i) 
            System.out.print(arr[i] + " "); 
  
        System.out.println(); 
    } 
    
}
