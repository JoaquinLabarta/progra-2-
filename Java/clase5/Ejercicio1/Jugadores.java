public class Jugadores extends Empleados
{
    //Los jugadores son empleados que se caracterizan por el número de partidos jugados y el número de goles anotados.
    private int partidosJugados;
    private int numeroGoles;

    /**
     * Constructor for objects of class Jugadores
     */
    public Jugadores(int npartidosJugados, int nnumeroGoles,String nombre,  int DNI, Double sueldoBasico)
    {
        super(nombre, DNI, sueldoBasico); 
        partidosJugados=npartidosJugados;
        numeroGoles=nnumeroGoles;
    }
    
    public int getPJ(){
        return partidosJugados;
    }  
    public void setPJ(int PJ){
        partidosJugados = PJ;
    }
    
    public int getRadio(){
        return numeroGoles;
    }  
    public void setRadio(int NG){
        numeroGoles = NG;
    }
    
    /*Para los jugadores: el sueldo a cobrar es el sueldo básico y si el promedio de goles por  
     partido es superior a 0,5 se adiciona un plus de otro sueldo básico.*/
    public double calcularSueldoACobrar(Double sueldoBasico){
        double promedio=numeroGoles/partidosJugados;
        if(promedio>0.5){
            sueldoBasico=sueldoBasico+sueldoBasico;
        }
        return sueldoBasico;
    }

}
