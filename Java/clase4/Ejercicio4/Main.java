
/**
B- Realice un programa ppal. que cree un micro con patente “ABC123”, destino “Mar del Plata” y hora de salida “5:00 am”.  
Cargue pasajeros en el micro de la siguiente manera: Leer nros. 
de asientos desde teclado que corresponden a pedidos de personas. 
La lectura finaliza cuando se ingresa el nro. de asiento -1 o cuando se llenó el micro.
Para cada nro. de asiento leído debe: validar el nro; en caso que esté libre, ocuparlo e 
informar a la persona el éxito de la operación; en caso que esté ocupado informar a la persona la situación y mostrar el nro. 
del primer asiento libre.  
Al finalizar, informe la cantidad de asientos ocupados del micro.
 */
import java.util.Scanner;
public class Main
{
    public static void Main(String[] args) {
        Scanner in = new Scanner(System.in);
        int numero;
        //cargo micro
        micros micro1= new  micros("ABC123","Mar del Plata","5:00 am");
        System.out.println("ingrese el numero de asiento que desea entre el 0 y el 19");
        numero=in.nextInt();
        micro1.setOcupar(numero);
        while( ( numero!=-1 )||( micro1.getLleno()==false ) ){
            if(micro1.getLleno()==false){   
                System.out.println("ingrese el numero de asiento que desea entre el 0 y el 19");
                numero=in.nextInt();
                if(micro1.getVnumero(numero) ){
                    if( micro1.getVasien(numero)==false ){
                        micro1.setOcupar(numero);
                    }
                    else{
                        System.out.println("el asiento elegido esta ocupado");
                        System.out.println("el numero del primer asiento libre es : "+micro1.getCanto());
                }
                }
                else
                System.out.println("el numero de asiento no es valido");
               
            }
            else{
                System.out.println("el micro esta lleno precione -1");
                System.out.println("ingrese el valor -1 a continuacion");
                numero=in.nextInt();}
        }
        in.close();
    }
}
