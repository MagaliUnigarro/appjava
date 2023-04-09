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
      
public class FuncionVoid {
    
    static Scanner read = new Scanner(System.in);
    
    
    // declaramos las variables fuera del método main
    static String name;
    static String lastName;
    static double salary;
    static String eMail;
    
    

    
    // creamos nuestro método main donde haremos el llamado de la función
    public static void main(String [] args){
        
        fillForm("Ber", "Mira", 1250000, "bamiraga@cesde.net");
        fillForm();
        printForm();
    
    
    }
    
    // 3. Declaramos la función fuera del método main
    
    public static void fillForm(){
        
        System.out.println("Ingrese su nombre");
        name = read.nextLine();
        System.out.println("INgrese su apellido");
        lastName = read.next();
        System.out.println("Ingrese su salario");
        salary = read.nextDouble();
        System.out.println("Ingrese su email: ");
        eMail = read.next();
  
    }
    
    
    // Explaramos el concepto de sobrecarga de metodos
    public static void fillForm(String name, String lastName , double salary, String eMail){
     
        System.out.println("Ingrese su nombre" + name);
      
        System.out.println("INgrese su apellido" + lastName);
        
        System.out.println("Ingrese su salario"+ salary);
        
        System.out.println("Ingrese su email: " + eMail);
        
        System.out.println("Datos del Cliente: \n 1. Nombre: " + name +" "+lastName +"\n" 
                +"2. Salario: "+ salary + "\n"
                +"3. Email: " + eMail);
        
    }
    
    
    public static void printForm(){
        
        
        
        
        System.out.println("Datos del Cliente: \n 1. Nombre: " + name +" "+lastName +"\n" 
                +"2. Salario: "+ salary + "\n"
                +"3. Email: " + eMail);
   
    }
    
    
    
    
    
}
