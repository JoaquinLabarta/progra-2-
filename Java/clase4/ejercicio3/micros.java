
/**
 3-A- Definir una clase para representar micros. Un micro se caracteriza por su patente, destino, hora salida, 
 una cantidad de asientos fija (20) para los que debe registrar su 
 estado (es decir si está o no ocupado) y cantidad de asientos ocupados.  
 El micro puede ocuparse total o parcialmente.
    a) Defina métodos getters/setters para patente, destino y hora de salida.
    b) Implemente un constructor que permita inicializar el micro creado con una patente,  un destino y 
    una hora de salida (recibidas como parámetro) y sin pasajeros. 
    c) Implemente métodos para: 
    i. devolver la cantidad de asientos ocupados
    ii. devolver si el micro está lleno
    iii. validar un número de asiento recibido como parámetro
    iv. devolver el estado de un nro. de asiento válido recibido como parámetro
    v. ocupar un nro. de asiento válido recibido como parámetro
    vi. liberar un nro. de asiento válido recibido como parámetro
    vii. devolver el nro. del primer asiento libre
 */
public class micros
{
    // instance variables - replace the example below with your own
    private String patente;
    private String Destino;
    private String hs;
    private int canta;
    private boolean[] Vasi;
    
    /**
     * Constructor for objects of class micros
     */
    
    public micros(String patente,String Destino,String  hs)
    {
        this.patente= patente;
        this.Destino= Destino;
        this.hs= hs;
        //Vasi=null; esto ver que onda
        Vasi = new boolean[20];
        for(int i=0; i< 20;  i++){
            Vasi[i]=false;
        }
    }
    
    public micros()
    {
    }
    
    public String getPatente(){
        return patente;
    }
    
    public void setPatente(String patente){
        this.patente = patente;
    }
    
    public String getDestino(){
        return patente;
    }
    
    public void setDestino(String Destino){
        this.Destino = Destino;
    }
    
    public String getHs(){
        return hs;
    }
    
    public void setHs(String hs){
        this.hs = hs;
    }
    
    //i. devolver la cantidad de asientos ocupados
    public int getCanta(){
        int cantidad=0;
        for(int i=0; i< 20;  i++){
            if(Vasi[i]==true)
                cantidad++;
        }
        return cantidad;
    }
    
    //ii. devolver si el micro está lleno
    public boolean getLleno(){
        boolean lleno=true;
        for(int i=0; i< 20;  i++){
            if(Vasi[i]==false)
                lleno=false;
        }
        return lleno;
    }
    
    //iii. validar un número de asiento recibido como parámetro
    public boolean getVnumero(int numero){
        boolean valido=false;
        if( (numero < 20 ) && (numero>=0) ){
            valido=true;    
        }
        return valido;
    }
    
    //iv. devolver el estado de un nro. de asiento válido recibido como parámetro
    public boolean getVasien(int numero){
        boolean ocupado;
        if(Vasi[numero]==true)
            ocupado=true;
        else
            ocupado=false;
        return ocupado;
    }
    
    //v. ocupar un nro. de asiento válido recibido como parámetro
    public void setOcupar(int numero){
        if( (numero < 20 ) && (numero>=0) ){
            Vasi[numero]=true;    
        }
    }
    //vi. liberar un nro. de asiento válido recibido como parámetro
    public void setLibre(int numero){
        if( (numero<20)&&(numero>=0) ) {
            Vasi[numero]=false;
        }
    }
    //vii. devolver el nro. del primer asiento libre
    public int getCanto(){
        int posicion=-1;
        do{
            posicion++;
        }while((Vasi[posicion]==true)&&(posicion<20) );   
        return posicion;
    }    
}
