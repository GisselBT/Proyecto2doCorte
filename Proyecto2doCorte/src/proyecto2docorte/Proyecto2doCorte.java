
package proyecto2docorte;


public class Proyecto2doCorte {

   
    public static void main(String[] args) 
    {

         //TRASPORTE OBJETOS
        Trasporte trasporte1 = new Trasporte();
        Trasporte transporte = new Trasporte("El Amazonas", 2.000);
        
        //AVION OBJETOS
        Avion avion1 = new Avion();
        Avion avion2 = new Avion("Avianca", 3, 2.00, false, "La Guajira", 50, 1.000200, true);
        
        //BARCO OBJETOS
        Barco barco1 = new Barco();
        Barco barco2 = new Barco("Barcomar", 2, 40, true, "España", 7600, 200.000, false);
        
        //TREN OBJETOS
        Tren tren1 = new Tren();
        Tren tren2 = new Tren("Metropolitano", 8, 45.0, false, "Tokio", 500, 4.000, true);



    }
    
}
