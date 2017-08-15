
package fibonaccirecursivo;

import java.util.Scanner;

public class FibonacciRecursivo {

    public static void main(String[] args) {
     int x=0;
     
      Scanner leer=new Scanner(System.in);
      System.out.println("ingrese número");
      x= leer.nextInt();
      
     System.out.println(FibonacciRecursivo(x));
      }
      public static int FibonacciRecursivo(int z){
        
          if(z==0 || z==1){
              return 1;
      
          }
          else 
              return FibonacciRecursivo(z-1)+ FibonacciRecursivo(z-2);
      }
      
          
    }
    

