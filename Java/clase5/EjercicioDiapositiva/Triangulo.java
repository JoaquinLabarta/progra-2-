public class Triangulo extends Figura
{
    // instance variables - replace the example below with your own
    private double lado1;
    private double lado2;
    private double lado3;

    /**
     * Constructor for objects of class Triangulo
     */

    public Triangulo(double nuevoL1, double nuevoL2, double nuevoL3,String nuevoCR, String nuevoCL,Punto unPunto){
        super(nuevoCR, nuevoCL, unPunto);
        lado1=nuevoL1;
        lado2=nuevoL2;
        lado3=nuevoL3;
    }
    
    public Triangulo(double nuevoL1, double nuevoL2, double nuevoL3)
    {
        this(nuevoL1,nuevoL2,nuevoL3,"blanco","negro",new Punto());
    }
    
    public Triangulo()
    {
        
    }
    
    public Double getLado1(){
        return lado1;
    }
    
    public Double getLado2(){
        return lado2;
    }
    
    public Double getLado3(){
        return lado3;
    }
        
    public void setLado1(Double lado1){
        this.lado1 = lado1;
    }
    
    public void setLado2(Double lado2){
        this.lado2 = lado2;
    }
    
    public void setLado3(Double lado3){
        this.lado3 = lado3;
    }
    
    public double calcularArea(){
        double s=(lado1+lado2+lado3)/2;
        return Math.sqrt(s*(s-lado1)*(s-lado2)*(s-lado3));
    }
    
    public double calcularPerimetro(){
        return (lado1+lado2+lado3);
    }
    
    public void dibujar(){
        System.out.println("Triangulo: ");
        super.dibujar();
        System.out.println("lado1: "+lado1);
        System.out.println("lado2: "+lado2);    
        System.out.println("lado3: "+lado3);
    }
    
}
