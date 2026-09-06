
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


         Scanner leer = new Scanner (System.in);
        int opcion = 0;
        
        do { 
            
            System.out.println("====BIENVENIDO ELIGE TU TRANSPORTE====");
            System.out.println("1. Mostrar transportes");
            System.out.println("2. Mostrar aviones");
            System.out.println("3. Mostrar barcos");
            System.out.println("4. Mostrar trenes");
            System.out.println("5. Salir");
            System.out.print("Seleccione una opcion: ");
            
            try {
                
                opcion = leer.nextInt();
                
                switch (opcion) {
                    case 1:
                        System.out.println("\n Transporte");
                        System.out.println(transporte1);
                        System.out.println(transporte2);
                        break;
                    case 2:
                        System.out.println("\n Aviones");
                        System.out.println(avion1);
                        System.out.println(avion2);
                        break;
                    case 3:
                        System.out.println("\n Barcos");
                        System.out.println(barco1);
                        System.out.println(barco2);
                        break;
                    case 4:
                        System.out.println("\n Trenes");
                        System.out.println(tren1);
                        System.out.println(tren2);
                        break;
                    case 5:
                        System.out.println("Saliendo del programa de transportes");
                        break;
                    default:
                        System.out.println("Opcion no valida");
                        throw new AssertionError();
                }
                
            } catch (Exception e) 
            {
                System.out.println("ERROR: Opcion no valida ingrese el numero correspondiente a la opcion que desea elegir");
                leer.nextLine();
            }
            
        } while (opcion != 5);
        
    
    }
    
}
