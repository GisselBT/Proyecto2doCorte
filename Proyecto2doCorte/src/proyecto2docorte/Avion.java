/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package proyecto2docorte;

/**
 *
 * @author admin
 */
public class Avion 
{
    private String aerolinea;
    private int numeroVuelo;
    private double horasVuelo;
    private boolean escala;

    public Avion() 
    {
        /*A qui el super(); llama al constructor vacio de Transporte
        y despues inicializa los 4 atributos de Avion*/
        super ();
        this.aerolinea = "Sin aerolinea";
        this.numeroVuelo = 0;
        this.horasVuelo = 0.0;
        this.escala = false;
    }

    public Avion(String aerolinea, int numeroVuelo, String destino, double precio) 
    {
        //Aca llama a este constructor de Transporte 
        super(destino, precio);
        this.aerolinea = aerolinea;
        this.numeroVuelo = numeroVuelo;
    }

    public Avion(String aerolinea, int numeroVuelo, double horasVuelo, boolean escala, String destino, int capacidad, double precio, boolean disponible) 
    {
        //Aca llama el constructor completo de la super clase
        super(destino, capacidad, precio, disponible);
        this.aerolinea = aerolinea;
        this.numeroVuelo = numeroVuelo;
        this.horasVuelo = horasVuelo;
        this.escala = escala;
    }   
}
