
package estructurasdecontrol;

import java.util.Scanner;



public class FuncionReturn {
    
    
    static double salary;
    
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        
        System.out.println("Ingrese su salario");
        salary = input.nextDouble();
        
        double toPaid = calculateSalary();
        
        System.out.println("El  salario a pagar es: " + toPaid );
        System.out.println("El  salario a pagar es: " + calculateSalary());

       
        
        
    }
    
    public static double calculateSalary(){
        
        double eps = salary * 0.04;
        
        double pension = salary * 0.04;
        
        double salaryPaid = salary - pension - eps;
        
        return salaryPaid;
    
    
    }
    
    
}
