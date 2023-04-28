public abstract class Figura{
    // instance variables - replace the example below with your own
    private String colorRelleno;
    private String colorLinea;
    private Punto punto;

    /**
     * Constructor for objects of class Figura
     */
    
    public Figura(String colorRelleno,  String colorLinea, Punto punto){
        this.setColorRelleno(colorRelleno);
        this.setColorLinea(colorLinea);
        this.setPunto(punto);
    }
    
    public Figura()
    {
    }
    
    public String getColorRelleno(){
        return colorRelleno;
    }
    public void setColorRelleno(String colorRelleno){
        this.colorRelleno = colorRelleno;
    }
    
    public String getColorLinea(){
        return colorLinea;
    }
    public void setColorLinea(String colorLinea){
        this.colorLinea = colorLinea;
    }
    
    public Punto getPunto(){
        return punto;
    }
    public void setPunto(Punto nuevoPunto){
        punto=nuevoPunto;
    }
    
    
    public void dibujar(){
           System.out.println( "Color de Línea " + this.getColorLinea() + "Color de Relleno" +  this.getColorRelleno() +"Punto: " + this.getPunto().toString() );
    }
    
    
    abstract double calcularArea();
    abstract double calcularPerimetro();
}
