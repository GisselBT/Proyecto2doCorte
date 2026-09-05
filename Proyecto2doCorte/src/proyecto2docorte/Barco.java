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

    //GETTERS Y SETTERS
    public String getEmpresaNaviera() 
    {
        return empresaNaviera;
    }
    public void setEmpresaNaviera(String empresaNaviera) 
    {
        this.empresaNaviera = empresaNaviera;
    }
    
    public int getNumeroCubierta() 
    {
        return numeroCubierta;
    }
    public void setNumeroCubierta(int numeroCubierta) 
    {
        this.numeroCubierta = numeroCubierta;
    }

    public double getVelocidad() 
    {
        return velocidad;
    }
    public void setVelocidad(double velocidad) 
    {
        this.velocidad = velocidad;
    }

    public boolean isTienePiscina() 
    {
        return tienePiscina;
    }
    public void setTienePiscina(boolean tienePiscina) 
    {
        this.tienePiscina = tienePiscina;
    }

    @Override
    public String toString() {
        return "-----Barco-----" 
                + "\nEmpresa Naviera = " + empresaNaviera 
                + "\nNumero de Cubierta = " + numeroCubierta 
                + "\nVelocidad maxima = " + velocidad 
                + "\nTiene Piscina = " + tienePiscina;
    }
      
}
