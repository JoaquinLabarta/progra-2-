    
/**
 B- Genere un programa que cree una flota vacía. 
 Cargue micros (sin pasajeros) a la flota con información leída desde teclado (hasta que se ingresa la patente “ZZZ000” o 
 hasta completar la flota). Luego lea una patente, busque si existe un micro con dicha patente y
 en ese caso elimínelo de la flota. Lea un destino e informe la patente del micro que va a dicho destino y su hora de salida.
 */
public class Micro
{
    // instance variables - replace the example below with your own
    
    private String Patente;
    private String Destino;
    private String Hs;
    private int Asiento;
    
    /**
     * Constructor for objects of class Micro
     */
    
    public Micro(String Patente,String Destino,String  Hs,int  Asiento)
    {
        this.Patente= Patente;
        this.Destino= Destino;
        this.Hs= Hs;
        this.Asiento= Asiento;
    }
    
    public Micro()
    {
    }

    public String getPatente(){
        return Patente;
    }
    public void setPatente(String Patente){
        this.Patente = Patente;
    }
    
    public String getDestino(){
        return Destino;
    }
    public void setDestino(String Destino){
        this.Destino = Destino;
    }
    
    public String getHs(){
        return Hs;
    }
    public void setHs(String Hs){
        this.Hs = Hs;
    }
    
    public int getAsiento(){
        return Asiento;
    }
    public void setAsientos(int numero){
        this.Asiento = Asiento;
    }
}
