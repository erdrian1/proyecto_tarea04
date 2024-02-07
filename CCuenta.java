package cuentas;


/**
 * @author FRANCISCO ADRIÁN ZÁJARA PONCE
 * La clase CCuenta representa una cuenta bancaria con funciones básicas como ingreso y retiro.
 * Esta clase proporciona métodos para acceder y manipular la información de la cuenta.
 */
public class CCuenta {

    /** El nombre del titular de la cuenta. */
    private String nombre;

    /** El número de cuenta. */
    private String cuenta;

    /** El saldo actual de la cuenta. */
    private double saldo;

    /** El tipo de interés de la cuenta. */
    private double tipoInteres;

    /**
     * Constructor predeterminado de la clase CCuenta.
     * Crea una cuenta con valores iniciales predeterminados.
     */
    public CCuenta() {
    }

    /**
     * Constructor de la clase CCuenta que permite establecer valores iniciales.
     * @param nom     El nombre del titular de la cuenta.
     * @param cue     El número de cuenta.
     * @param sal     El saldo inicial de la cuenta.
     * @param tipo    El tipo de interés de la cuenta.
     */
    public CCuenta(String nom, String cue, double sal, double tipo) {
        nombre = nom;
        cuenta = cue;
        saldo = sal;
        tipoInteres = tipo;
    }
}
