/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package proyecto2docorte;

/**
 *
 * @author admin
 */
public class Tren 
{
    private String tipoTren;
    private int numeroVagones;
    private double velocidadMaxima;
    private boolean danComida;

    //CONSTRUCTORES

    public Tren() 
    {
        super();
        this.tipoTren = "Sin tren";
        this.numeroVagones = 0;
        this.velocidadMaxima = 0.0;
        this.danComida = false;
    }

    public Tren(String tipoTren, int numeroVagones, String destino, double precio) 
    {
        super(destino, precio);
        this.tipoTren = tipoTren;
        this.numeroVagones = numeroVagones;
    }

    public Tren(String tipoTren, int numeroVagones, double velocidadMaxima, boolean danComida, String destino, int capacidad, double precio, boolean disponible) 
    {
        super(destino, capacidad, precio, disponible);
        this.tipoTren = tipoTren;
        this.numeroVagones = numeroVagones;
        this.velocidadMaxima = velocidadMaxima;
        this.danComida = danComida;
    } 
    
}
