import java.util.Scanner;
public class ProgramaArba{
    private Vehiculo[] Vecvehiculos;
    private embarcaciones barcos;
    private automotores autos;
    private Propietario prop;
    private int Dimf=2;
    
    public void cargar() {
        Scanner in = new Scanner(System.in);
        Vecvehiculos=new Vehiculo[Dimf];
        for(int f=0;f<Dimf;f++) {
            System.out.println("Ingrese el cit:");
            int cit=in.nextInt();
            System.out.println("Ingrese el nombre:");
            String nombre=in.next();
            System.out.println("Ingrese el apellido:");
            String apellido=in.next();
            prop=new Propietario(nombre,apellido,cit);
            System.out.println("Ingrese el año:");
            int año=in.nextInt();
            System.out.println("Ingrese el importe basico:");
            Double importe=in.nextDouble();
            System.out.println("Ingrese si es una embarcaciones/automotores");
            String vehic=in.next();
            if(vehic.equals("embarcaciones")){
                System.out.println("Ingrese el REY:");
                int rey=in.nextInt();
                System.out.println("Ingrese el nombre de la embarcacion:");
                String nombreb=in.next();
                System.out.println("tipo de embarcación (lancha, crucero, velero, etc.)");
                String tipo=in.next();
                System.out.println("Ingrese el eslora:");
                Double eslora=in.nextDouble();
                System.out.println("Ingrese el peso:");
                Double peso=in.nextDouble();
                System.out.println("Ingrese el valor de la embarcacion:");
                Double valor=in.nextDouble();
                barcos=new embarcaciones(rey,nombreb,tipo,eslora,peso,valor,prop,importe,año);
                Vecvehiculos[f]=barcos;
            }
            else
                if(vehic.equals("automotores")){
                    System.out.println("Ingrese la patente:");
                    String patente=in.next();
                    System.out.println("Ingrese la IA:");
                    Double IA=in.nextDouble();
                    System.out.println("Ingrese la descripcion:");
                    String descripcion=in.next();
                    System.out.println("Ingrese la adicional por año:");
                    Double adicionalaño=in.nextDouble();
                    autos=new automotores(patente,IA,descripcion,adicionalaño,prop,importe,año);
                    Vecvehiculos[f]=autos;
            }
        }
        in.close();
    }
    
    public void imprimir() {
        for(int f=0;f<Dimf;f++) {
            System.out.println(Vecvehiculos[f].mostrar());
        }
    }
    

    public static void main(String[] args) {
        //creo vector de automotores y cargo
        ProgramaArba pa=new ProgramaArba();
        pa.cargar();
        pa.imprimir();  
    }
}
