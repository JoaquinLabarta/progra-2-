
/**
 4-A- Definir una clase para representar flotas de micros. Una flota se caracteriza por conocer a los 
 micros que la componen (a lo sumo 15). 
    i. Defina un constructor para crear una flota vacía (sin micros)
    Implemente métodos para:
    ii. devolver si la flota está completa (tiene 15 micros) o no.
    iii. agregar a la flota un micro recibido como parámetro.
    iv. eliminar de la flota el micro con patente igual a una recibida como parámetro.
    v. buscar en la flota un micro con patente igual a una recibida como parámetro y 
    retornarlo (en caso de no existir dicho micro, retornar NULL). 
    vi. buscar en la flota un micro con destino igual a uno recibido como parámetro y 
    retornarlo (en caso de no existir dicho micro, retornar NULL).
 */
public class Flota
{
    // instance variables - replace the example below with your own
    private Micro[] Vmicros;
    private final int Dimf=2;
    private int act;

    /**
     * Constructor for objects of class Flota
     */
    //Punti i
    public Flota()
    {
        act=-1;
        Vmicros = new Micro[Dimf];
        for(int i=0; i< Dimf;  i++){
            Vmicros[i]=null;
        }
    }
    //ii. devolver si la flota está completa (tiene 15 micros) o no.

    public boolean estaCompleta(){
        boolean lleno=true;
        for(int i=0; i< Dimf;  i++){
            if(Vmicros[i]==null)
                lleno=false;
        }
        return lleno;}
        
    //iii. agregar a la flota un micro recibido como parámetro.  
    public void agregarMicro(Micro m){
        if(act<Dimf){
            act++;
            Vmicros[act]=m;
        }
    }
    
    //iv. eliminar de la flota el micro con patente igual a una recibida como parámetro.
    public void eliminarMicro(String pat){
        int i=0;
        while( !( Vmicros[i].getPatente().equals(pat)) && (i<Dimf) ){
            i++;
        }
        if(i!=Dimf){
            Vmicros[i]=null;
        }
    }
    
    /** v. buscar en la flota un micro con patente igual a una recibida como parámetro y retornarlo (en caso de no existir dicho 
    micro, retornar NULL) **/
    
    public Micro buscarMicroPorPatente(String pat){
        int i=0;
        while( (i<Dimf)  && !( Vmicros[i].getPatente().equals(pat))){
            i++;
        }
        if( i!=Dimf)
          return Vmicros[i];
        else
          return null;
    }
    
    /** vi. buscar en la flota un micro con destino igual a uno recibido como parámetro y 
    retornarlo (en caso de no existir dicho micro, retornar NULL). **/ 
    public Micro buscarMicroPorDestino(String dest){
        int i=0;
        for(int i=0; i< Dimf;  i++){
            if((Vmicros[i]!=null)&& !( Vmicros[i].getDestino().equals(dest) )&&(i<Dimf))
                
        }
        if( Vmicros[i].getDestino().equals(dest))
          return Vmicros[i];
        else
          return null;  
    }

    //IMPRIMIR LOS MICROS 
    public void imprimir(){
        for(int i=0; i< Dimf;  i++){
            if(Vmicros[i]!=null){
                System.out.println(Vmicros[i].getPatente());
                System.out.println(Vmicros[i].getDestino());
                System.out.println(Vmicros[i].getHs());
                System.out.println(Vmicros[i].getAsiento());
            }
        }
    }
}