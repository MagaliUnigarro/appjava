/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package estructurasdecontrol;

/**
 *
 * @author desarrollo
 */

import java.util.Scanner;
public class AppWhile {
    
    public static void main(String [] args){
    
    Scanner leer = new Scanner(System.in);
        
        
        try{
        int opc;
        System.out.println("Por favor seleccione una opción: \n"
                + "\n1. Registrarse"
                + "\n2. Iniciar sesión"
                + "\n3. Salir");
        
        opc = leer.nextInt();
        
        while(opc!=3){
        
        switch(opc){
            
            case 1:
                System.out.println("1. Formulario");
                System.out.println("Por favor seleccione una opción: \n"
                + "\n1. Registrarse"
                + "\n2. Iniciar sesión"
                + "\n3. Salir");
                opc = leer.nextInt();
                break;
            case 2:
                System.out.println("2. Login");
                System.out.println("Por favor seleccione una opción: \n"
                + "\n1. Registrarse"
                + "\n2. Iniciar sesión"
                + "\n3. Salir");
                opc = leer.nextInt();
                break;
            case 3:
                System.out.println("3. Salir");
                break;
            default:
                System.out.println("Ingrese una opcion correcta");
                System.out.println("Por favor seleccione una opción: \n"
                + "\n1. Registrarse"
                + "\n2. Iniciar sesión"
                + "\n3. Salir");
                opc = leer.nextInt();
        
        
        
        
        }
        }
        
        }catch(Exception e){
            
            System.out.println("Ingrese solo numeros");
            /*System.out.println("Por favor seleccione una opción: \n"
                + "\n1. Registrarse"
                + "\n2. Iniciar sesión"
                + "\n3. Salir");
                opc = leer.nextInt();
                continue;*/
        
        }
        
        
    
    
    }
    
}
