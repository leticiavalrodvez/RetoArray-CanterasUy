public class RetoArrayParte2 {
    public static void main(String[] args) {

        int enteros[] = new int[20]; //Arreglo enteros para randomizar los 100 números.
        int impares[] = new int[20]; // Arreglo impares para números impares.
        int pares[] = new int[20]; //Arreglo pares para numeros pares.

        for (int i = 0; i < enteros.length; i++){ //For para guardar los 20 números random.

            enteros[i] = (int)(Math.random() * (1 - (-100))); //Función que genera números random y los guarda en enteros.

        }

        System.out.print("Números pares: "); // Notación de que números se van a ver.

        for (int i = 0; i < enteros.length; i++){ // For que recorre enteros para seleccionar los números pares.

            if (enteros[i] % 2 == 0){ // If que condiciona para elegir solo números pares.

                pares[i] = enteros[i]; // Según el indice i, los números que cumplan la condición se guardan en pares.

                System.out.print(pares[i] + "," ); // Muestra los números contenidos en el arreglo de pares.

            }
        }

        System.out.println(); // Salto de linea.

        System.out.print("Números impares: "); // Notación de que números se van a ver.

        for (int i = 0; i < enteros.length; i++){ // For que recorre enteros para seleccionar los números impares.

            if (enteros[i] % 2 != 0){ // If que condiciona para elegir solo números impares.

                impares[i] = enteros[i]; // Según el indice i, los números que cumplan la condición se guardan en impares.

                System.out.print(impares[i] + ","); // Muestra los números contenidos en el arreglo de impares.

            }
        }
    }
}
