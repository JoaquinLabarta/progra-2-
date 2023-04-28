
/**
 B- Genere un programa que cree una flota vacía. Cargue micros (sin pasajeros) a la flota con 
 información leída desde teclado (hasta que se ingresa la patente “ZZZ000” o hasta completar la flota).
 Luego lea una patente, busque si existe un micro con dicha patente y en ese caso elimínelo de la flota.
 Lea un destino e informe la patente del micro que va a dicho destino y su hora de salida.
 */
import java.util.Scanner;
public class main
{
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int numero=0;
        //creo flota vacia
        Flota flota= new  Flota();
        
        //creo primer micro sin pasajeros
        Micro m=new Micro();
        System.out.println(" ingrese el patente ");
        m.setPatente( in.next() );
        System.out.println(" ingrese el destino ");
        m.setDestino( in.next() );
        System.out.println(" ingrese la hora de salido ");
        m.setHs( in.next());
        m.setAsientos(0);  
        while( ( flota.estaCompleta()==false)||( m.getPatente().equals("ZZZ000") ) ){
            //fin creacion
            flota.agregarMicro(m);
            //creo primer micro sin pasajeros
            if(flota.estaCompleta()==false){
                m=new Micro();
                System.out.println(" ingrese el patente ");
                m.setPatente( in.next() );
                System.out.println(" ingrese el destino ");
                m.setDestino( in.next() );
                System.out.println(" ingrese la hora de salido ");
                m.setHs( in.next());
                m.setAsientos(0);
            }
        }
        flota.imprimir();
        //Luego lea una patente, busque si existe un micro con dicha patente y en ese caso elimínelo de la flota
        System.out.println(" ingrese el patente ");
        String pat=in.next();
        if(flota.buscarMicroPorPatente(pat)!=null){
            System.out.println("el micros existe");
            flota.eliminarMicro(pat);
            System.out.println("el micro se elimino");
        }else
            System.out.println("el micro no existe");    
        flota.imprimir();
        //Lea un destino e informe la patente del micro que va a dicho destino y su hora de salida.
        System.out.println(" ingrese un destino ");
        String dest=in.next();
        Micro microaux=new Micro();
        microaux= flota.buscarMicroPorDestino(dest);
        if(microaux!=null){
            System.out.println("el micros con ese destino existe");
            System.out.println(microaux.getPatente());
            System.out.println(microaux.getHs());
        }else
            System.out.println("el micro con ese destino no existe");
        
        in.close();
    }
}
