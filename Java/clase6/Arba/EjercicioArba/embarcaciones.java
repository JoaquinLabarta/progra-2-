
/*
 Embarcación, que tiene asociado un código del Registro Especial de Yates (REY), 
 nombre, un tipo de embarcación (lancha, crucero, velero, etc.), eslora (longitud de proa a popa), 
 un tonelaje (peso) y un valor declarado de la embarcación.
 
 De las embarcaciones, el propietario paga un monto semestral que varía según el valor
 declarado de la embarcación: valuadas hasta $6.000, pagan el 4% del su valor 
 declarado; entre $6.000 y $180.000, pagan el 2% del valor declarado y, finalmente superiores 
 a $180.000 pagan el 5% de dicho valor declarado.
 */
public class embarcaciones extends Vehiculo
{
    // instance variables - replace the example below with your own
    private int rey;
    private String nombreb;
    private String tipo;
    private Double eslora;
    private Double peso;
    private Double valor;

    /**
     * Constructor for objects of class embarcaciones
     */
    public embarcaciones(int nrey,String nnombreb,String ntipo,Double neslora,Double npeso,Double nvalor,Propietario propietario, double importe, int año)
    {
        super(propietario,importe,año);
        rey=nrey;
        nombreb=nnombreb;
        tipo=ntipo;
        eslora=neslora;
        peso=npeso;
        valor=nvalor;
    }

    public int getRey(){
        return rey;
    }  
    public void setRey(int nrey){
        rey = nrey;
    }
    
    public String getNombreb(){
        return nombreb;
    }  
    public void setNombreb(String nnombreb){
        nombreb = nnombreb;
    }
    
    public String getTipo(){
        return tipo;
    }  
    public void setTipo(String ntipo){
        tipo = ntipo;
    }
    
    public Double getEslora(){
        return eslora;
    }  
    public void setEslora(Double neslora){
        eslora = neslora;
    }
    
    public Double getPeso(){
        return peso;
    }  
    public void setPeso(Double npeso){
        peso = npeso;
    }
    
    public Double getValor(){
        return valor;
    }  
    public void setValor(Double Nvalor){
        valor = Nvalor;
    }
    /*
     De las embarcaciones, el propietario paga un monto semestral que varía según el valor
     declarado de la embarcación: valuadas hasta $6.000, pagan el 4% del su valor 
     declarado; entre $6.000 y $180.000, pagan el 2% del valor declarado y, finalmente superiores 
     a $180.000 pagan el 5% de dicho valor declarado.
     */
    public double calcularCostosImpu(Double importe){
        Double devuelve=0.0;
        if(this.getValor()<6000)
            devuelve=4*this.getValor()/100;
        else
            if((this.getValor()>=6000)&&(this.getValor()<=180000))
                devuelve=2*this.getValor()/100;
            else
                if(this.getValor()>180000)
                    devuelve=5*this.getValor()/100;
        return devuelve;
    }
}
