/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package proyecto2docorte;

/**
 *
 * @author admin
 */
public class Barco 
{
    private String empresaNaviera;
    private int numeroCubierta;
    private double velocidad;
    private boolean tienePiscina;
    
      //CONSTRUCTORES

    public Barco() 
    {
        super();
        this.empresaNaviera = "Sin empresa";
        this.numeroCubierta = 0;
        this.velocidad = 0.0;
        this.tienePiscina = false;
    }

    public Barco(String empresaNaviera, int numeroCubierta, String destino, double precio) 
    {
        super(destino, precio);
        this.empresaNaviera = empresaNaviera;
        this.numeroCubierta = numeroCubierta;
    }

    public Barco(String empresaNaviera, int numeroCubierta, double velocidad, boolean tienePiscina, String destino, int capacidad, double precio, boolean disponible) 
    {
        super(destino, capacidad, precio, disponible);
        this.empresaNaviera = empresaNaviera;
        this.numeroCubierta = numeroCubierta;
        this.velocidad = velocidad;
        this.tienePiscina = tienePiscina;
    }
    
}
