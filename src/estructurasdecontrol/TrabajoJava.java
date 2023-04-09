package estructurasdecontrol;
import java.util.Scanner;
public class TrabajoJava {
    static String name;
    static String lastName;
    static String mail;
    static int password;
    static boolean isActived = false;
    static String nombre1;
    static float cantProducto;
    static float precioCosto;
    static float precioVenta;
    static float valorDeventa;
    static String nombreCliente;
    static int cedula;
    static int opciones;


    static Scanner lea = new Scanner(System.in);

    public static void main(String[] args) {


        try {
            int opc;

            System.out.println("porfavor seleccione una opcion: \n"
                    + "\n1. registrarse"
                    + "\n2. inicio de sesion"
                    + "\n3. salir");
            opc = lea.nextInt();
            do {
                switch (opc) {
                    case 1:
                        System.out.println("formulario");


                        System.out.println("escriba su nombre ");
                        name = lea.next();
                        System.out.println(" escriba su apellido");
                        lastName = lea.next();
                        System.out.println("escriba su email");
                        mail = lea.next();
                        System.out.println("escriba su contraseña");
                        password = lea.nextInt();
                        System.out.println("porfavor seleccione una opcion: \n"
                                + "\n1. registrarse"
                                + "\n2. iniciar secion"
                                + "\n3. salir");
                        opc = lea.nextInt();
                        break;
                    case 2:
                        System.out.println("login");
                        String mailUser;
                        int passwUser;
                        int capchat = 20;
                        int capchatUser;


                        System.out.println("imprima su email");
                        mailUser = lea.next();
                        System.out.println("ingrese su password");
                        passwUser = lea.nextInt();
                        System.out.println("resuelva la siguiente operacion: 2 *10 -9");
                        capchatUser = lea.nextInt();

                        if (mail.equals(mailUser) && (password == passwUser) && capchat == capchatUser) {
                            System.out.println("bienvenido " + name);
                            isActived = true;
                            while (isActived == true) {
                                int menu;
                                System.out.println(" seleccione una de las siguientes opciones : '\n "
                                        + "\n1.registrar producto"
                                        + "\n2.mostrar producto"
                                        + "\n3.registrar cliente"
                                        + "\n4.relizar venta"
                                        + "\n5. volver");
                                menu = lea.nextInt();

                                switch (menu) {
                                    case 1:
                                        System.out.println("registro producto");


                                        fillForm();


                                        break;
                                    case 2:

                                        printForm();
                                        // Llamar a la función que imprime los datos del producto
                                        break;

                                    case 3:
                                        System.out.println("registro de cliente ");


                                        System.out.println("ingrese nombre del cliente ");
                                        nombreCliente = lea.next();
                                        System.out.println("ingrese cedula de cliente");
                                        cedula = lea.nextInt();


                                        System.out.println("seleccione metodo de pago :'\n "
                                                + "\n1.credito"
                                                + "\n2.ahorro"
                                                + "\n3.transferencia");
                                        opciones = lea.nextInt();
                                        switch (opciones) {
                                            case 1:
                                                System.out.println("credito");
                                                break;
                                            case 2:
                                                System.out.println("ahorro");
                                                break;
                                            case 3:
                                                System.out.println("transferencia");
                                        }
                                        break;
                                    case 4:
                                        System.out.println("realizar venta");
                                        float totalVenta = cantProducto * precioVenta;
                                        System.out.println("el valor de la venta es :  " + totalVenta);

                                        printUserData();

                                        break;
                                    default: {
                                        System.out.println(" seleccione una opcion: \n"
                                                + "\n1. registrarse"
                                                + "\n2. iniciar secion"
                                                + "\n3. salir");
                                    }


                                }

                            }
                        } else {
                            System.out.println("valide sus credenciales");
                        }


                        System.out.println("porfavor seleccione una opcion: \n"
                                + "\n1. registrarse"
                                + "\n2. iniciar secion"
                                + "\n3. salir");
                        opc = lea.nextInt();
                        break;
                    case 3:
                        System.out.println("salir");
                    default:
                        System.out.println("ingrese una opcion correcta");
                        System.out.println("porfavor seleccione una opcion: \n"
                                + "\n1. registrarse"
                                + "\n2. iniciar secion"
                                + "\n3. salir");
                        opc = lea.nextInt();
                        break;
                }
            } while (opc != 3);
        } catch (Exception e) {
            System.out.println("solo ingrese numeros");
        }


    }

    public static void fillForm() {
        System.out.println("ingrese nombre de producto");
        nombre1 = lea.next();
        lea.nextLine(); // Consumir la nueva línea
        System.out.println("ingrese cantidad del producto");
        cantProducto = lea.nextFloat();
        System.out.println("ingrese precio costo");
        precioCosto = lea.nextFloat();
        System.out.println("ingrese precio venta ");
        precioVenta = lea.nextFloat();


    }
    public static void fillForm(String nombre1, float cantProducto, float precioCosto, float precioVenta) {
        System.out.println("Nombre de producto: " + nombre1);
        System.out.println("cantida de prducto: " + cantProducto);
        System.out.println("precio costo: " + precioCosto);
        System.out.println("precio de venta: " + precioVenta);
    }
    public static void printForm(){


        System.out.println("Datos del cliente: \n 1. Nombre del producto :  " + nombre1 + "\n " + "2. cantidad del producto:  " + cantProducto + "\n" + "3. precio costo: " + precioCosto + "\n" + "4. precio venta: " + precioVenta);



    }

    public static void printUserData() {

        System.out.println("Nombre del producto:  " + nombre1);
        System.out.println("cantidad del producto: " + cantProducto);
        System.out.println("precio de venta: " + precioVenta);

        System.out.println("nombre del cliente:  " + nombreCliente);
        System.out.println("nombre de vendedor:  " + name + " " + lastName);
        System.out.println("metodos de pago: " + opciones);

    }


}


