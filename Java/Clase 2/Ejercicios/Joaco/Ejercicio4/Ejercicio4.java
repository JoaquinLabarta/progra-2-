/*
 * 4- Se dispone de la clase Partido (descargar de moodle). Un objeto partido representa un encuentro entre dos equipos (local y visitante).
    Un objeto partido puede crearse sin valores iniciales y agregando luego el nombre del equipo local, el nombre del visitante, 
    la cantidad de goles del local y del visitante (en ese orden). Un objeto partido sabe responder a los siguientes mensajes:
        getLocal()	retorna el nombre (String) del equipo local
        getVisitante()	retorna el nombre (String) del equipo visitante
        getGolesLocal()	retorna la cantidad de goles (int) del equipo local
        getGolesVisitante()	retorna la cantidad de goles (int) del equipo visitante
        setLocal(X) 	modifica el nombre del equipo local al “String” pasado por parámetro (X)
        setVisitante(X)	modifica el nombre del equipo visitante al “String” pasado por parámetro (X)
        setGolesLocal(X)	modifica la cantidad de goles del equipo local “int” pasado por parámetro (X)
        setGolesVisitante(X)	modifica la cantidad de goles del equipo visitante “int” pasado por parámetro (X)
        hayGanador()	retorna un boolean que indica si hubo (true) o no hubo (false) ganador
        getGanador()	retorna el nombre (String) del ganador del partido (si no hubo retorna un String vacío). 
        hayEmpate()	retorna un boolean que indica si hubo (true) o no hubo (false) empate
        ----------------------------------------------------------------------------------------------------------------------------------------
        a) Implemente un programa que cargue un vector con los 325 partidos disputados en la superliga 2018/2019. 
        Luego de la carga realizar los métodos que considere necesarios para informar:
        b) La cantidad de partidos que ganó River.
        c) El total de goles que realizó Boca jugando de local.
        d) El porcentaje de partidos finalizados con empate. 
*/
import java.util.Scanner;
public class Ejercicio4{
    public static void main (String[]args){
        //Declaracion de variables.
        Scanner in = new Scanner (System.in);
        int dimfv = 2;
        Partido vector[] = new Partido[dimfv];
        //Cargar vector con datos.
        vector = PuntoA.cargarvector(vector, dimfv);
        
        //-----------------------PuntoB-------------------------------
        System.out.println("La cantidad de partidos que gano river es de: "+PuntoB.partidosriver(vector,dimfv));
        
        //-----------------------PuntoC-------------------------------
        System.out.println("La cantidad de goles que hizo boca de local es de: "+PuntoC.golesboca(vector,dimfv));
        
        //-----------------------PuntoD-------------------------------
        System.out.println("El porcentaje de partidos que termino con empate fue de: "+PuntoD.empates(vector,dimfv));
    }
}