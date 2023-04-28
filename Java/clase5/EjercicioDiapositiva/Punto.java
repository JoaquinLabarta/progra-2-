public class Punto
{
    // instance variables - replace the example below with your own
    private int x , y;

    /**
     * Constructor for objects of class Punto
     */
    public Punto(int Valorx,int Valory)
    {
        x=Valorx;
        y=Valory;
    }
    
    public Punto()
    {
        x=0;
        y=0;
    }
    
    public int getX(){
        return x;
    }
    public int getY(){
        return y;
    }
        
    public void cambiarPosicion(int ValorX,int ValorY){
        x=ValorY;
        y=ValorX;
    }
    
    public void tranladar(int dx,int dy){
        x=x+dx;
        y=y+dy;
    }

    @Override
    public String toString(){
        return("Punto ("+x+","+y+")");
    }
}
