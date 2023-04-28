public abstract class Vehiculo
{
   private int año;
   private double importe;
   private Propietario propietario;
   
   public Vehiculo(Propietario propietario, double importe, int año)
    {
        this.setPropietario(propietario);
        this.setImporte(importe);
        this.setAño(año);
    }
   
    public void setPropietario(Propietario propietario){
        this.propietario=propietario;
    }
    public void setAño(int año){
        this.año=año;
    }
    public void setImporte(double importe){
        this.importe=importe;
    }
    public int getAño(){
        return año;
    }
    public double getImporte(){
        return importe;
    }
    public Propietario getPropietario(){
        return propietario;
    }
    
    abstract double calcularCostosImpu(Double importe);
    
    public Double mostrar(){
        return this.calcularCostosImpu(importe);
    }
    
}
