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

    //GETTERS Y SETTERS

    public String getTipoTren() 
    {
        return tipoTren;
    }
    public void setTipoTren(String tipoTren) 
    {
        this.tipoTren = tipoTren;
    }
    
    public int getNumeroVagones() 
    {
        return numeroVagones;
    }
    public void setNumeroVagones(int numeroVagones) 
    {
        this.numeroVagones = numeroVagones;
    }

    public double getVelocidadMaxima() 
    {
        return velocidadMaxima;
    }
    public void setVelocidadMaxima(double velocidadMaxima) 
    {
        this.velocidadMaxima = velocidadMaxima;
    }
    
    public boolean isDanComida() 
    {
        return danComida;
    }
    public void setDanComida(boolean danComida) 
    {
        this.danComida = danComida;
    }

    @Override
    public String toString() {
        return "----Tren-----"
                +"\nTipo de Tren = " + tipoTren 
                +"\nNumero de vagones = " + numeroVagones
                +"\nVelocidad maxima = "+velocidadMaxima 
                +"\nDan comida = "+ danComida;
    }
    
}
