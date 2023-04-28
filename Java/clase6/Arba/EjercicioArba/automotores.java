/*   
 Automotor, que también tiene asociado una patente, un importe adicional según el año de fabricación y una descripción.
 
 De los automotores, el propietario paga mensualmente el importe básico más el adicional calculado según su año de fabricación.
 */
public class automotores extends Vehiculo
{
    // instance variables - replace the example below with your own
    private String patente;
    private Double IA;
    private String descripcion;
    private double adicionalaño;
    
    
    public automotores(String npatente,Double nIA,String ndescripcion,Double nadicionalaño,Propietario propietario, double importe, int año)
    {
        super(propietario,importe,año);
        patente=npatente;
        IA=nIA;
        descripcion=ndescripcion;
        adicionalaño=nadicionalaño;
    }
    
    public Double getAdicionalaño(){
        return adicionalaño;
    }  
    public void setAdicionalaño(Double Nadicionalaño){
        adicionalaño = Nadicionalaño;
    }
    

    public String getValor(){
        return patente;
    }  
    public void setValor(String Npatente){
        patente = Npatente;
    }
    
    public Double getIA(){
        return IA;
    }  
    public void setIA(Double NIA){
        IA = NIA;
    }
    
    public String getDescripcion(){
        return descripcion;
    }  
    public void setDescripcion(String Ndescripcion){
        descripcion = Ndescripcion;
    }
    //De los automotores, el propietario paga mensualmente el importe básico más el adicional calculado según su año de fabricación.
    public double calcularCostosImpu(Double importe){
        Double devuelva=importe+this.getAdicionalaño();
        return devuelva;    
    }
}
