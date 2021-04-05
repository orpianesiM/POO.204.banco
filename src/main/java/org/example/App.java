package org.example;

import java.util.Scanner;

public class App
{
    public static void main( String[] args )
    {
        int opcion=0;
        float cantidad=0;
        Scanner s = new Scanner(System.in);

        Banco cliente1 = new Banco();
        cliente1.setNombreCuenta("Frances");
        cliente1.setBalanceCuenta(15000F);

        Banco cliente2 = new Banco();
        cliente2.setNombreCuenta("Patagonia");
        cliente2.setBalanceCuenta(8654632F);

       do {
            System.out.println("¿Que procedimiento desea realizar?");
            System.out.println("1. Debitar");
            System.out.println("2. Acreditar");
            System.out.println("3. Consultar saldo");
            System.out.println("0. Salir");
            System.out.println("Seleccione una opcion: ");
            opcion = s.nextInt();


            switch (opcion) {
                case 1:
                    String respuesta="";
                    do {
                    System.out.println("Ingrese cuanto desea debitar: ");
                    cantidad = s.nextFloat();

                        if (cliente1.getBalanceCuenta() >= cantidad) {
                            cliente1.debito(cantidad);
                            respuesta="N";
                        }else{
                            System.out.println("AVISO: la extracción que desea realizar excede al monto total");
                            System.out.println("¿Desea realizar otra operacion de debito? (S/N): ");

                            respuesta = s.next();
                        }
                    }while(respuesta.equalsIgnoreCase("S"));

                    System.out.println("Su saldo actual es de: " + cliente1.getBalanceCuenta());
                    break;
                case 2:
                    System.out.println("Ingrese cuanto desea acreditar: ");
                    cantidad = s.nextFloat();
                    cliente1.credito(cantidad);

                    System.out.println("Su saldo actual es de: "+ cliente1.getBalanceCuenta());
                    break;
                case 3:
                    System.out.println(mostrarBanco(cliente1)); //ver como detallar sin cliente
                    System.out.println("*********************************************");
                    break;
                case 0:
                    break;
                default:
                    System.out.println("Ingreso una opcion incorrecta");
            }
       }while(opcion != 0);



    }

    public static String mostrarBanco(Banco banco){
        return banco.verDetalle();
    }
}
