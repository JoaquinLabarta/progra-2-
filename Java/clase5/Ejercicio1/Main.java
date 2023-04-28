
/**
 E) Escriba un programa principal que instancie un jugador y un entrenador con datos leídos desde teclado.
 Pruebe el correcto funcionamiento de cada método implementado. 
 */
public class Main
{
    public static void main(String[] args) {
        //IMPRIMO ENTRENADOR
        Entrenadores entr =new Entrenadores(4," matias ",43471156, 2000.0);
        System.out.println(entr.toString()); 
        //IMPRIMO JUGADOR
        Jugadores juga =new Jugadores(7,15," camila ",  44789321, 1000.0);
        System.out.println(juga.toString()); 
    }
}
