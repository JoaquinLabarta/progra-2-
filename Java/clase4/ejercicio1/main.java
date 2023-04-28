import java.util.Scanner;
public class main
{          
   public static void main(String[]args)
   {
       triangulo t= new triangulo(2.3,3.0,4.0,"rojo","verde");
       System.out.println("el area del triangulo es : "+t.getArea());
       System.out.println("el perimetro del triangulo es : "+t.getPerimetro());
       System.out.println(t.toString());
       //PUNTO B
       Scanner in = new Scanner(System.in);
       triangulo t2= new triangulo();
       System.out.println("ingrese el lado 1");
       t2.setLado1(in.nextDouble());
       System.out.println("ingrese el lado 2");
       t2.setLado2(in.nextDouble());
       System.out.println("ingrese el lado 3");
       t2.setLado3(in.nextDouble());
       System.out.println("ingrese el color de relleno");
       t2.setColorR(in.next());
       System.out.println("ingrese el color de linea");
       t2.setColorL(in.next());
       in.close();
       System.out.println(t2.toString());
       
    }   
}
