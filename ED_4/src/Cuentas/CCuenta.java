/**
 * Paquete Cuentas.
 */

package Cuentas;


/**
 * 
 * 
 * @author Jorge Jim�nez Juara
 * @version 1.0
 * @since 20/02/2022 
 *Uso de atributos, getters y setters para obtener informaci�n sobre una cuenta bancaria.
 *
 */


public class CCuenta {

	/**
	 * <p>Los atributos son bastante descriptivos:</p>
	 * <p>Atributo nombre, permite identificar el nombre de la cuenta.</p>
	 * <p>Atributo cuenta, permite conocer la cuenta.</p>
	 * <p>Atributo saldo, contiene el saldo de cuenta.</p>
	 * <p>Atributo tipoInteres, contiene informaci�n sobre tipo de inter�s.</p>
	 */
    private String nombre;
    private String cuenta;
    private double saldo;
    private double tipoInter�s;
    
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
     * @param cue N�mero de cuenta
     * @param sal Saldo de la cuenta.
     * @param tipo Tipo de inter�s de la cuenta.
     */
    public CCuenta(String nom, String cue, double sal, double tipo)
    {
        setNombre(nom);
        setCuenta(cue);
        setSaldo(sal);
    }

    /**
     * <p>M�too estado</p>
     * @return Devulve la cantidad de saldo.
     */
    
    public double estado()
    {
        return getSaldo();
    }
    
    /**
     * <p>M�todo ingresar</p>
     * @param cantidad
     * <p>Settea la cantidad a ingresar en caso de ser positiva.</p>
     * @throws Exception
     * <p>A�adimos excepciones en caso de cantidad negativa � 0.</p>
     */
    
    public void ingresar(double cantidad) throws Exception
    {
        if (cantidad<0)
            throw new Exception("No se puede ingresar una cantidad negativa");
        setSaldo(getSaldo() + cantidad);
    }
    
    /**
     *
     * <p>M�todo retirar</p>
     * @param cantidad
     * <p>Settea la cantidad a ingresar en caso de ser positiva.</p>
     * @throws Exception
     * <p>A�adimos excepciones en caso de cantidad negativa, 0, o cantidad insuficiente de saldo..</p>
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
     * <p>M�todo getNombre</p>
     * <p>SDevuelve el nombre de la cuenta.</p>
     * @return nombre
     */

	private String getNombre() {
		return nombre;
	}

	 /**
     * <p>M�todo setNombre</p>
     * <p>Inserta el nombre de la cuenta.</p>
     */

	private void setNombre(String nombre) {
		this.nombre = nombre;
	}

	 /**
     * <p>M�todo getCuenta</p>
     * <p>Devuelve el n�mero de la cuenta.</p>
     * @return cuenta
     */
	private String getCuenta() {
		return cuenta;
	}
	 /**
     * <p>M�todo setCuenta</p>
     * <p>Inserta el n�mero de la cuenta.</p>
     */
	private void setCuenta(String cuenta) {
		this.cuenta = cuenta;
	}
	 /**
     * <p>M�todo getSaldo</p>
     * <p>Devuelve el saldo de la cuenta.</p>
     * @return saldo
     */
	private double getSaldo() {
		return saldo;
	}
	 /**
     * <p>M�todo setSaldo</p>
     * <p>Inserta el saldo de la cuenta.</p>
     */
	private void setSaldo(double saldo) {
		this.saldo = saldo;
	}
	 /**
     * <p>M�todo getTipoInter�s</p>
     * <p>Devuelve el tipo de inter�s de la cuenta.</p>
     * @return tipoInter�s
     */
	private double getTipoInter�s() {
		return tipoInter�s;
	}
	 /**
     * <p>M�todo setTipoInter�s</p>
     * <p>Devuelve el tipo de inter�s de la cuenta.</p>
     */
	private void setTipoInter�s(double tipoInter�s) {
		this.tipoInter�s = tipoInter�s;
	}
}
