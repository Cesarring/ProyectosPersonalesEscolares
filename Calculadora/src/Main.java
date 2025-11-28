//Librerias
import java.util.Scanner;

public class Main {

    //Se encarga de "limpiar" la pantalla.
    public static void Limpiar() {
        for (int i = 0; i < 50; i++) {
            System.out.println();
        }
    }

    public static void main(String[] args) {

        //Declaracion de variable "scanner" para poder usar la libreria "util.Scanner".
        Scanner scanner = new Scanner(System.in);

        //Variables para parar el programa.
        byte i = 1, opcion;

        do{
            //Ordenes para el usuario; registro de digitos y eleccion de operador.
            System.out.print("-------------------------------- \n\tIngrese 2 numeros: \n\nNumero 1: ");
            int numero1 = scanner.nextInt(); //Input para retener informacion en la memoria.

            System.out.print("Numero 2: ");
            int numero2 = scanner.nextInt();System.out.print("--------------------------------");            

                //Listado del 1 al 4 para la eleccion del operador, ademas del 5 para la eleccion de cerrar el programa.
            System.out.print("\nIngresa la operacion: " + "\n\n\t1) Suma." + "\n\t2) Resta." + "\n\t3) Multiplicacion." + "\n\t4) Division. \n\nOperador: ");
            int operacion = scanner.nextInt();System.out.print("--------------------------------\n");            

            //Cadena de if's para la decision del operador
            if(operacion == 1){

                int resultado = numero1+numero2;
                System.out.println("\nEl resultado es: " +resultado);

            }else if (operacion == 2) {

                int resultado = numero1 - numero2;
                System.out.println("\nEl resultado de la resta es: " + resultado);

            } else if (operacion == 3) {

                int resultado = numero1*numero2;
                System.out.println("\nEl resultado es: " +resultado);

            } else if (operacion == 4) {

                if(numero2 == 0){ //En caso de que el divisor sea 0 se reconocera e imprimira un mensaje.

                    System.out.println(" \nNo se puede dividir entre cero. ");

                } else{

                    int division = numero1 / numero2;
                    System.out.println("\nEl resultado es: "+ division);

                }

            }

            //Pregunta para parar el programa.
            System.out.println("\n-------------------------------- \n¿Desea salir de la calculadora? \n1)Si  2)No");
            opcion = scanner.nextByte();

            //Llamar al metodo.
            Limpiar();

        }while(i != opcion);
     
        scanner.close(); //Cierra la operacion de "scanner" para evitar desperdicio de memoria.

    }

}
