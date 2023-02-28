
package vehiculo;

/**
 *
 * @author IES Aguadulce
 */
public class Main {
    
      public static void main(String[] args) {
        VehiculoCabelloSantacruzJoseAntonio2223 miVehiculoCabelloSantacruzJoseAntonio2223;
        int stockActual;
        
        miVehiculoCabelloSantacruzJoseAntonio2223 = new VehiculoCabelloSantacruzJoseAntonio2223("Seat",18000,100);
        
        operativaVehiculoCabelloSantacruzJoseAntonio2223(miVehiculoCabelloSantacruzJoseAntonio2223, 50);
        
        stockActual = miVehiculoCabelloSantacruzJoseAntonio2223.obtenerStock();
        System.out.println("El stock actual es"+ stockActual );
    }

    private static void operativaVehiculoCabelloSantacruzJoseAntonio2223
        (VehiculoCabelloSantacruzJoseAntonio2223 miVehiculoCabelloSantacruzJoseAntonio2223, int cantidad) {
        try {
            System.out.println("Venta de Vehiculos");
            miVehiculoCabelloSantacruzJoseAntonio2223.vender(20);
        } 
        catch (Exception e) {
            System.out.print("Fallo al vender");
        }
        
        try {
            System.out.println("Compra de Vehiculos");
            miVehiculoCabelloSantacruzJoseAntonio2223.comprar(100);
        } 
        catch (Exception e) {
            System.out.print("Fallo al comprar");
        }
    }

}
    
