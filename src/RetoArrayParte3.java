public class RetoArrayParte3 {
               public static void main(String[] args){

                   int arrayPrimos[] = new int[1000]; //Array 0 a 1000.
                   for (int j = 0; j < arrayPrimos.length; j++){ // For que llena el array con los numeros de 0 a 1000.

                       arrayPrimos[j] = j;
                   }


                   for(int i=0; i < arrayPrimos.length; i++){ // For con índice del 0 al 1000.

                         if(esPrimo(i)){ // If con condición esPrimo con índice i del for 0 a 1000.
                              System.out.println(i); //Imprime el índice si se cumple.
                         }
                    }
               }

               public static boolean esPrimo(int numero){ //Clase esPrimo, donde numero será i.
                    boolean primo = false; // Variable booleana primo.
                    int cont=0; // Variable contador.
                    int cantNumPrimos=2; // Variable contador números primos.

                    for(int i = 1; i<=numero; i++){ // For para saber si numero es primo.
                         if(numero%i==0){ // Si número divido i (índice del for actual) tiene un resto de 0.
                              cont++; // cont suma 1.
                         } //Esto se repite hasta que i igual numero en cantidad.
                    }
                    if(cont == cantNumPrimos){ // Si cont igual a 2
                         primo = true; // Es primo
                    }
                    return primo; // Devuelve el resultado.
               }

          }