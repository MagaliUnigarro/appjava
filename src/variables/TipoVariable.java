/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package variables;

/**
 *
 * @author desarrollo
 */

import java.util.Scanner;
public class TipoVariable {
    
    public static void main(String [] args){ 
        
        Scanner input = new Scanner(System.in);
        
        //System.out.println("Hola Mundo Moviles I");
    
        String name = "Ber";
        String apellido;
        
        apellido= "Mira";
        
        int age = 25;
        
        double salary;
        
        float currency = 500f;
        
        long telephone= 3222272028l;
        
        char number = 25555;
        
        char letter1 = 'd';
        
        byte letter = 1;
        
        boolean isActive= true;
        
        final double PI = 3.1416;
        
        System.out.println("Ingrese su salario: ");
        salary = input.nextDouble();
        
        System.out.println("Mi nombre es: " + name + " "+ apellido + "\n"
        + "Mi edad es: " + age + "\n"
        + "Salario:" + salary);
       
    
    
    }
    
}
