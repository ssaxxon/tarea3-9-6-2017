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
public class Trabajo_clase2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("Bienvenido  selecciona una opcion ");
        System.out.println("1- Leer números mayores que 20 ");
        System.out.println("2- Permitir al usuario que intente hasta 5 veces  teclear  resultado ");
        System.out.println("3- Juego de la adivinanza ");
        System.out.println("4-  Dibujar para un numero entero N las siguientes series ");
        
        Scanner leer = new Scanner(System.in);
        int n = 0 ;
        n = leer.nextInt();
        
        switch (n){
            case 1:
       mayores_que_20 par = new  mayores_que_20();
       par.condicion();
       break;
       
            case 2:
       numeros_random rand = new  numeros_random();
       rand.random();
       
       break;
            case 3 :
       adivinanza ad = new  adivinanza();
       ad.adivinanza();
       break;
            case 4 :
      series  sr= new  series();
       sr.serie();
       break;
        }
       
    }
    
}
