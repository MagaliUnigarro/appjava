/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicios;

/**
 *
 * @author desarrollo
 */

import java.util.Scanner;
public class EjemploApp {
    
    static Scanner leer = new Scanner(System.in);
    
    static String name;
    static String lastName;
    static String mail;
    static int password;
    static boolean isActived = false;
    
    static String mailUser;
    static int passwUser;
    static int capchat= 20;
    static int capchatUser;
    
    public static void main(String[] args) {
        
        menuInicio();
        
    }
    
    public static void fillForm(){
        
        System.out.println("Escriba su nombre: ");
        name = leer.next();
                
        System.out.println("Escriba su apellido: ");
        lastName = leer.next();
                
        System.out.println("Escriba su email");
        mail = leer.next();
                
        System.out.println("Escriba su password");
        password = leer.nextInt();
    }
    
    public static void printForm(){
        
        System.out.println("Datos del Cliente: \n 1. Nombre y Apellido : " + name +" "+lastName +"\n" 
                +"2. Email: "+ mail + "\n"
                );
    }
    
    
    public static void login(){
        
        System.out.println("Ingrese su email");
                mailUser= leer.next();
                
                System.out.println("Ingrese su contraseña");
                
                passwUser= leer.nextInt();
                
                
                System.out.println("Resuelva la siguiente operación: 2*5+10 ");
                capchatUser = leer.nextInt();
                
                
                if((mail.equals(mailUser)&& password==passwUser)
                        &&capchat==capchatUser){
                    
                    System.out.println("Bienvenido "+ name);
                    isActived= true;
                    
                    while(isActived== true){
                    
                    
                    
                    
                    
                    }
                
                
                
                }else{
                    
                    System.out.println("Valide sus credenciales");
                
                
                }
        
    }
    
    
    public static void menuInicio(){
        
        try{
        int opc;
        
        
        System.out.println("Por favor seleccione una opción: \n"
                + "\n1. Registrarse"
                + "\n2. Iniciar sesión"
                + "\n3. Salir");
        
        opc = leer.nextInt();
        
        
         do{
        switch(opc){
            
            case 1:
                System.out.println("1. Formulario");
                
                
                fillForm();
                
                
          
                
                System.out.println("Por favor seleccione una opción: \n"
                + "\n1. Registrarse"
                + "\n2. Iniciar sesión"
                + "\n3. Salir");
                opc = leer.nextInt();
                break;
            case 2:
                System.out.println("2. Login");
                
                login();
                
            
                
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
        } while(opc!=3);
        }catch(Exception e){
            
            System.out.println("Ingrese solo numeros");
            
        
        }
    
    
    
    
    }
    
}
