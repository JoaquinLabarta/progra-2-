package Ejercicio6;
/*6- Escriba un programa que defina una matriz de enteros de tama�o 10x10. Inicialice la matriz con los primeros 100 n�meros pares
 * (ej: la pos. 0,0 contendr� 0; la pos. 0,1 contendr� 2; la pos. 0,2 contendr� 4; as� siguiendo). 

Luego realice las siguientes operaciones: 
-	Mostrar el contenido de la matriz en consola. 
-	Calcular e informar la suma de todos los elementos almacenados entre las filas 2 y 9 y las columnas 0 y 3
-	Generar un vector de 10 posiciones donde cada posici�n i contiene la suma de los elementos de la columna i de la matriz.
-	Lea un valor entero e indique si se encuentra o no en la matriz. En caso de encontrarse indique su ubicaci�n (fila y columna)
        en caso contrario imprima �No se encontr� el elemento�.
*/
import java.util.Scanner;
public class ejercicio6 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        //Declaracion de variables y matriz
        int DIMF = 10;
        int DIMC = 10;
        int [][] matriz;    
        matriz = new int [DIMF][DIMC];
        int num = 0;
        //----------------PUNTO A---------------------------------------------
        //Lleno la matriz con los datos solicitados
        for (int i = 0; i < DIMF; i++){
            for (int j = 0; j < DIMC; j++){
                matriz[i][j] = (2 * num);
                num ++;
            }
        }
        //----------------PUNTO B---------------------------------------------
        int suma = 0;
        for (int i = 2; i < DIMF; i++){
            for (int j = 0; j < 3; j++){
                suma = suma + matriz[i][j];
            }
        }
        
        System.out.println("La suma total es: "+suma);
        //----------------PUNTO C---------------------------------------------
        int DIMFV = 10;
        int [] vector;
        vector = new int [DIMF];
                
        in.close();
    }
}
