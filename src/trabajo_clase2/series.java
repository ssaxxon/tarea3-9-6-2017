/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package trabajo_clase2;
import java.util.Scanner;

/**
 *
 * @author consuelo
 */
public class series {
    
    public void serie(){
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingresa un numero entero");
       int  n = leer.nextInt();
        switch (n){
            case 1 :{
      
        System.out.println("Imprimir series ");
        
      
        
        
      System.out.println( "* *****\n" +
"** ****\n" +
"*** ***\n" +
"**** **\n" +
"*****" + n );
      break;
            }
           
              case 2 :{
      
        System.out.println("Imprimir series ");
        
      
        
        
      System.out.println( "* *****\n" +

"*** ***\n" +
"**** **\n" +
              "** ****\n" +
              "*** ***\n" +
"*****" + n );
      break;
            }
              default :{
              System.out.println("Gracias por utilizar las series ");
              }
            
        }
       
    
    
    }
    
}
