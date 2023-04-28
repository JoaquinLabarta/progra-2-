public class Entrenadores extends Empleados
{
    // Los entrenadores son empleados  que se caracterizan por la cantidad de campeonatos ganados.
    private int cantCampGanados;

    public Entrenadores(int ncantCampGanados,String nombre,  int DNI, Double sueldoBasico)
    {
        super(nombre, DNI, sueldoBasico);
        cantCampGanados=ncantCampGanados;
    }
    
    public int getCG(){
        return cantCampGanados;
    }  
    public void setCG(int nuevoCG){
        cantCampGanados = nuevoCG;
    }
    
    /*Para los entrenadores: el sueldo a cobrar es el sueldo básico al cual se le adiciona un plus por 
     campeonatos ganados (5000$ si ha ganado entre 1 y 4 campeonatos;  $30.000 si ha ganado 
     entre 5 y 10 campeonatos; 50.000$ si ha ganado más de 10 campeonatos). */
    public double calcularSueldoACobrar(Double sueldoBasico){
        if((1<=cantCampGanados)&&(cantCampGanados<=4))
            sueldoBasico=sueldoBasico+5000;
        else
            if((5<=cantCampGanados)&&(cantCampGanados<=10))
                sueldoBasico=sueldoBasico+30.000;
                else
                    if(cantCampGanados<10)
                        sueldoBasico=sueldoBasico+50.000;      
        return sueldoBasico;
    }
}
