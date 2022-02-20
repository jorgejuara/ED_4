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
 *Uso de atributos, getters y setters para obtener información sobre una cuenta bancaria.
 *
 */


public class CCuenta {

	/**
	 * <p>Los atributos son bastante descriptivos:</p>
	 * <p>Atributo nombre, permite identificar el nombre de la cuenta.</p>
	 * <p>Atributo cuenta, permite conocer la cuenta.</p>
	 * <p>Atributo saldo, contiene el saldo de cuenta.</p>
	 * <p>Atributo tipoInteres, contiene información sobre tipo de interés.</p>
	 */
    private String nombre;
    private String cuenta;
    private double saldo;
    private double tipoInterés;
    
    /**
     * <p>Constructores</p>
     * <p>Creamos constructores para CCuenta</p>
     */

    public CCuenta()
    {
    }
    /**
     * Constructor
     * @param nom Nombre de cuenta
     * @param cue Número de cuenta
     * @param sal Saldo de la cuenta.
     * @param tipo Tipo de interés de la cuenta.
     */
    public CCuenta(String nom, String cue, double sal, double tipo)
    {
        setNombre(nom);
        setCuenta(cue);
        setSaldo(sal);
    }

    /**
     * <p>Métoo estado</p>
     * @return Devulve la cantidad de saldo.
     */
    
    public double estado()
    {
        return getSaldo();
    }
    
    /**
     * <p>Método ingresar</p>
     * @param cantidad
     * <p>Settea la cantidad a ingresar en caso de ser positiva.</p>
     * @throws Exception
     * <p>Añadimos excepciones en caso de cantidad negativa ó 0.</p>
     */
    
    public void ingresar(double cantidad) throws Exception
    {
        if (cantidad<0)
            throw new Exception("No se puede ingresar una cantidad negativa");
        setSaldo(getSaldo() + cantidad);
    }
    
    /**
     *
     * <p>Método retirar</p>
     * @param cantidad
     * <p>Settea la cantidad a ingresar en caso de ser positiva.</p>
     * @throws Exception
     * <p>Añadimos excepciones en caso de cantidad negativa, 0, o cantidad insuficiente de saldo..</p>
     */

    public void retirar(double cantidad) throws Exception
    {
        if (cantidad <= 0)
            throw new Exception ("No se puede retirar una cantidad negativa");
        if (estado()< cantidad)
            throw new Exception ("No se hay suficiente saldo");
        setSaldo(getSaldo() - cantidad);
    }
    
    
    /**
     * <p>Método getNombre</p>
     * <p>SDevuelve el nombre de la cuenta.</p>
     * @return nombre
     */

	private String getNombre() {
		return nombre;
	}

	 /**
     * <p>Método setNombre</p>
     * <p>Inserta el nombre de la cuenta.</p>
     */

	private void setNombre(String nombre) {
		this.nombre = nombre;
	}

	 /**
     * <p>Método getCuenta</p>
     * <p>Devuelve el número de la cuenta.</p>
     * @return cuenta
     */
	private String getCuenta() {
		return cuenta;
	}
	 /**
     * <p>Método setCuenta</p>
     * <p>Inserta el número de la cuenta.</p>
     */
	private void setCuenta(String cuenta) {
		this.cuenta = cuenta;
	}
	 /**
     * <p>Método getSaldo</p>
     * <p>Devuelve el saldo de la cuenta.</p>
     * @return saldo
     */
	private double getSaldo() {
		return saldo;
	}
	 /**
     * <p>Método setSaldo</p>
     * <p>Inserta el saldo de la cuenta.</p>
     */
	private void setSaldo(double saldo) {
		this.saldo = saldo;
	}
	 /**
     * <p>Método getTipoInterés</p>
     * <p>Devuelve el tipo de interés de la cuenta.</p>
     * @return tipoInterés
     */
	private double getTipoInterés() {
		return tipoInterés;
	}
	 /**
     * <p>Método setTipoInterés</p>
     * <p>Devuelve el tipo de interés de la cuenta.</p>
     */
	private void setTipoInterés(double tipoInterés) {
		this.tipoInterés = tipoInterés;
	}
}
