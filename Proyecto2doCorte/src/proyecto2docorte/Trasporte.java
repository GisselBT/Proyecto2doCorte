
package proyecto2docorte;


public class Trasporte 
{
  private String destino;
  private int capacidad;
  private double precio;
  private boolean disponible;

   //El this. funciona para llamar a un constructor de la misma clase 
    public Trasporte() 
    {
        this.destino = "Sin destino";
        this.capacidad = 0;
        this.precio = 0.0;
        this.disponible = false;
    }

    public Trasporte(String destino, double precio) 
    {
        this.destino = destino;
        this.precio = precio;
    }

    public Trasporte(String destino, int capacidad, double precio, boolean disponible) 
    {
        this.destino = destino;
        this.capacidad = capacidad;
        this.precio = precio;
        this.disponible = disponible;
    } 
    
}
