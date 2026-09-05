
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
        /* Este this(); significs llamar al constructo que no recibe 
        parametros y con el 
        this.destino hacemos referencia al atributo 
        destino, capacidad,... del objeto para a
        asignarle valores que recibimos como parametros*/
        this();
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

     // GETTERS Y SETTERS

    public String getDestino() 
    {
        return destino;
    }
    public void setDestino(String destino) 
    {
        this.destino = destino;
    }
    
    public int getCapacidad() 
    {
        return capacidad;
    }
    public void setCapacidad(int capacidad) 
    {
        this.capacidad = capacidad;
    }
    
    public double getPrecio() 
    {
        return precio;
    }
    public void setPrecio(double precio) 
    {
        this.precio = precio;
    }

    public boolean isDisponible() 
    {
        return disponible;
    }
    public void setDisponible(boolean disponible) 
    {
        this.disponible = disponible;
    }
    
}
