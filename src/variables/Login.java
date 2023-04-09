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
public class Login {
    
    
    public static void main(String [] args){
        
        Scanner input = new Scanner(System.in);
        String name = "Ber";
        String email;
        int password;
        String user;
        int passw;
    System.out.println("Registre su correo: ");
    email = input.nextLine();
    System.out.println("Registre su contraseña");
    password= input.nextInt();
    
        System.out.println("Ingrese su usuario: ");
        user = input.next();
        System.out.println("Ingrese su contraseña: ");
        passw = input.nextInt();
        
        // generar la validación de la contraseña y el usuario ingresado contra el mail y password registrado
        
        if (email.equals(user)&&password==passw){
            
            System.out.println("Bienvenido " + name );
        
        
        }else{
            System.out.println("Valide sus credenciales");
        
        }
        
            }
}
