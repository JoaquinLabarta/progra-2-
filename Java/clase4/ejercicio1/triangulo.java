/**
1- A- Definir una clase para representar triángulos. Un triángulo se caracteriza por el tamaño de sus 3 lados (double),
 el color de relleno (String) y el color de línea (String). 
El triángulo debe saber: 
    • Devolver/modificar el valor de cada uno de sus atributos (métodos get# y set#) 
    • Calcular el área y devolverla (método calcularArea)
    • Calcular el perímetro y devolverlo (método calcularPerimetro)

NOTA: Calcular el área con la fórmula   , donde a,b y c son los lados y  . La función raíz cuadrada es Math.sqrt(#)
 */
public class triangulo
{
    // instance variables - replace the example below with your own
    private double Lado1;
    private double Lado2;
    private double Lado3;
    private String ColorR;
    private String ColorL;

    /**
     * Constructor for objects of class triangulo
     */
    public triangulo(Double unLado1,Double unLado2,Double unLado3,String unColorR,String unColorL){
        Lado1 = unLado1;
        Lado2 = unLado2;
        Lado3 = unLado3;
        ColorR = unColorR;
        ColorL = unColorL;
    }
    
    public triangulo()
    {
    }
    
    public Double getLado1(){
        return Lado1;
    }
    
    public Double getLado2(){
        return Lado2;
    }
    
    public Double getLado3(){
        return Lado3;
    }
    
    public String getColorR(){
        return ColorR;
    }
    
    public String getColorL(){
        return ColorR;
    }
    
    public void setLado1(Double unLado1){
        Lado1 = unLado1;
    }
    
    public void setLado2(Double unLado2){
        Lado2 = unLado2;
    }
    
    public void setLado3(Double unLado3){
        Lado3 = unLado3;
    }
    
    public void setColorR(String unColorR){
        ColorR = unColorR;
    }
    
    public void setColorL(String unColorL){
        ColorL = unColorL;
    }
    
    
    public Double getPerimetro(){
        Double Perimetro = Lado1+Lado2+Lado3;
        return Perimetro;
    }
    
    public Double getArea(){
        Double s=(Lado1+Lado2+Lado3)/2;
        Double Area = Math.sqrt(s*(s-Lado1)*(s-Lado2)*(s-Lado3));
        return Area;
    }
       
    @Override
    public String toString(){
        return ("el lado uno es :"+Lado1 + " el lado dos es: " + Lado2 + " el lado tres es: " + Lado3 + " el colorR es " + ColorR+" el colorL es :"+ColorL);
    }
}
