public class Circulo extends Figura{
    // instance variables - replace the example below with your own
    private Double radio;

    /**
     * Constructor for objects of class Circula
     */
    
    
     public Circulo(double nuevoRadio,String colorRelleno, String colorLinea,Punto punto){
        super(colorRelleno, colorLinea, punto); 
        radio=nuevoRadio;   
    } 
    
    public Circulo()
    {
    }
    
    public Double getRadio(){
        return radio;
    }  
    public void setRadio(Double nuevoRadio){
        radio = nuevoRadio;
    }
    
    double calcularArea(){
        return (Math.PI*radio*radio);
    }
    
    double calcularPerimetro(){
        return (2*Math.PI*radio);
    }
    
    public void dibujar(){
        System.out.println("Circulo: ");
        super.dibujar();
        System.out.println("lado1: "+radio);
    }
}
