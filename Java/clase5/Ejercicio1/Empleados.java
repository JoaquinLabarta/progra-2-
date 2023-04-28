public abstract class Empleados
{
    //Cualquier empleado se caracteriza por su nombre, DNI, edad y sueldo básico.
    private String nombre;
    private int DNI;
    private Double sueldoBasico;

    /**
     * Constructor for objects of class Empleados
     */
    public Empleados(String nombre,  int DNI, Double sueldoBasico)
    {
        this.setNombre(nombre);
        this.setDNI(DNI);
        this.setSB(sueldoBasico);
    }
    
    public String getNombre(){
        return nombre;
    }  
    public void setNombre(String nuevoNombre){
        nombre = nuevoNombre;
    }
    
    public int getDNI(){
        return DNI;
    }  
    public void setDNI(int nuevoDNI){
        DNI = nuevoDNI;
    }
    
    public Double getSB(){
        return sueldoBasico;
    }  
    public void setSB(Double SB){
        sueldoBasico = SB;
    }
    
    abstract double calcularSueldoACobrar(Double sueldoBasico);
    
    @Override
    public String toString(){
        return ("El nombre es " + this.getNombre() + " y su dni es " +  this.getDNI() +" su sueldo basico es "+this.calcularSueldoACobrar(sueldoBasico));
    } 
}
