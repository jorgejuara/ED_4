/**
 * Paquete Cuentas.
 */
package Cuentas;

/**
 * 
 * 
 * @author Jorge Jiménez Juara
 * @version 1.0
 * @since 20/02/2022 
 *
 *
 *<p>Clase principal. Contiene el método main, y el método operativa cuenta.</p>
 *
 */

public class Main {
	
	/**
	 * Método main del programa.
	 * @param args X
	 */

    public static void main(String[] args) {
        operativa_cuenta(0);
    }
    
    /**
     * <p>Método operativa_cuenta</p>
     * @param cantidad Devuelve cantidad. Parametro deprecated (no usado).
     */

	public static void operativa_cuenta(float cantidad) {
		CCuenta cuenta1;
        double saldoActual;

        cuenta1 = new CCuenta("Antonio López","1000-2365-85-1230456789",2500,0);
        saldoActual = cuenta1.estado();
        System.out.println("El saldo actual es"+ saldoActual );

        try {
            cuenta1.retirar(2300);
        } catch (Exception e) {
            System.out.print("Fallo al retirar");
        }
        try {
            System.out.println("Ingreso en cuenta");
            cuenta1.ingresar(695);
        } catch (Exception e) {
            System.out.print("Fallo al ingresar");
        }
	}
}
