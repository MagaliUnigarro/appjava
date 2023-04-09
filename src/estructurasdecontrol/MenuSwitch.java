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
public class MenuSwitch {
    
    public static void main(String [] args){
        
        Scanner leer = new Scanner(System.in);
        
        try{
        int opc;
        
        System.out.println("Por favor seleccione una opción: \n"
                + "\n1. Registrarse"
                + "\n2. Iniciar sesión"
                + "\n3. Salir");
        
        opc = leer.nextInt();
        
        switch(opc){
            
            case 1:
                System.out.println("1. Formulario");
                break;
            case 2:
                System.out.println("2. Login");
                break;
            case 3:
                System.out.println("3. Salir");
                break;
            default:
                System.out.println("Ingrese una opcion correcta");
        
        
        
        
        }
        
        }catch(Exception e){
            
            System.out.println("Ingrese solo numeros");
        
        }   
    
    }
    
}
