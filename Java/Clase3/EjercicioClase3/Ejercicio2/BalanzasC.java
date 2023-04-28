
/**
2- A – Definir una clase para representar balanzas comerciales (para ser utilizadas en verdulerías, carnicerías, etc). 
Una balanza comercial sólo mantiene el monto y la cantidad de items 
correspondientes a la compra actual (es decir, no almacena los ítems de la compra). 
La balanza debe responder a los siguientes mensajes: 
    • iniciarCompra(): inicializa el monto y cantidad de ítems de la compra actual. 
    • registrarProducto(pesoEnKg, precioPorKg): recibe el peso en kg del ítem comprado y su precio por kg, debiendo 
    realizar las actualizaciones en el estado de la balanza. 
    • devolverMontoAPagar(): retorna el monto de la compra actual. 
    • devolverResumenDeCompra(): retorna un String del siguiente estilo “Total a pagar X por la compra de Y productos” ,
    donde X es el monto e Y es la cantidad de ítems de la compra.
 */
public class BalanzasC
{
    // instance variables - replace the example below with your own
    private Double Monto;
    private int CantItem;
    

    public void iniciarCompra(){
      Monto=0.0;
      CantItem=0;
    }
    
    public void registrarProducto(Double unPesoEnKg,Double unPrecioPorKg){
        CantItem++;
        Monto+=unPesoEnKg*unPrecioPorKg;
    }
    
    public Double devolverMontoAPagar(){
        return Monto;
    }
    
    public String devolverResumenDeCompra(){
        String aux; 
        aux = "Total a pagar :"+ Monto+" por la compra de Y productos :"+ CantItem;
        return aux;
    }
}
