import java.util.Scanner; //Clase para entrada de datos primitivos.

public class RetoArrayParte1 {
    public static void main(String[] args) {

        Scanner sc = new Scanner (System.in); //Objeto Scanner.

        int enteros[] = new int [5]; // Array enteros.
        for (int i = 0; i < enteros.length; i++){ //For para recorrer el arreglo e ingresar datos.

            int ingreso; //Variable ingreso.
            System.out.println("ingrese un número"); //Solicita al usuario un numero.
            ingreso = sc.nextInt(); //Se guarda el dato ingresado a la variable ingreso.

            enteros[i] = ingreso; // Guarda el dato de ingreso en un espacio del arreglo.

        }

        for (int i = 0; i < enteros.length; i++){ //For para recorrer y mostrar el arreglo.

            System.out.println("[" + i + "] = " + enteros[i]); //Muestra los datos que fueron igresados.

        }
    }
}