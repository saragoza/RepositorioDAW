/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package dam_ed04_actividad;

 
/**comentarios para parte JAVADOC de la tarea
    *clase pública CCuenta
    * 
    * @author Entornos de Desarrollo
    * @version  06/02/2015
    * 
    */
public class CCuenta {

    /**comentarios para parte JAVADOC de la tarea
    *variables miembro de la clase CCuenta,
    * encapsuladas mediante refactorización
    */
    private String nombre;
    private String cuenta;
    private double saldo;
    private double tipoInterés;

    /**comentarios para parte JAVADOC de la tarea
     * constructor por defecto de CCuenta
     * sin parámetros
     */
    public CCuenta()
    {
    }
    /**comentarios para parte JAVADOC de la tarea
     * constructor con parámetros de CCuenta
     * 
     * crea un objeto y asigna un valor a las variables
     * miembro nombre, cuenta y saldo
     * 
     * @param nom nombre del cliente
     * @param cue número de cuenta
     * @param sal saldo de la cuenta
     * @param tipo tipo de interés
     */
    public CCuenta(String nom, String cue, double sal, double tipo)
    {
        nombre =nom;
        cuenta=cue;
        saldo=sal;
    }
    /**comentarios para parte JAVADOC de la tarea
     * 
     * método que invoca al setter para la variable nombre
     * 
     * @param nom nombre del cliente
     */
    public void asignarNombre(String nom)
    {
        setNombre(nom);
    }
    /**comentarios para parte JAVADOC de la tarea
     * 
     * método que invoca el getter de la variable nombre
     * para devolver el resultado de su invocación
     * 
     * @return getNombre() getter de la variable nombre
     */
    public String obtenerNombre()
    {
        return getNombre();
    }

    /**comentarios para parte JAVADOC de la tarea
     * 
     * método que invoca el getter de la variable saldo
     * para devolver el resultado de su invocación
     * 
     * @return getSaldo() getter de la variable saldo
     */
    public double estado()
    {
        return getSaldo();
    }

    /**comentarios para parte JAVADOC de la tarea
     * 
     * método para modificar la variable saldo,
     * sumándole el valor del parámetro cantidad
     * 
     * @param cantidad cantidad a ingresar
     * 
     * @throws Exception se generará si el valor de cantidad es negativo
     */
    public void ingresar(double cantidad) throws Exception
    {
        if (cantidad<0)
            throw new Exception("No se puede ingresar una cantidad negativa");
        setSaldo(getSaldo() + cantidad);
    }
    /**comentarios para parte JAVADOC de la tarea
     * 
     * método para modificar la variable saldo,
     * restándole el valor del parámetro cantidad
     * 
     * @param cantidad cantidad a retirar
     * @throws Exception se generarán si el valor de cantidad es negativo
     * o si el valor de cantidad es mayor que el valor de la variable saldo
     */
    public void retirar(double cantidad) throws Exception
    {
        if (cantidad <= 0)
            throw new Exception ("No se puede retirar una cantidad negativa");
        if (estado()< cantidad)
            throw new Exception ("No se hay suficiente saldo");
        setSaldo(getSaldo() - cantidad);
    }

     /**comentarios para parte JAVADOC de la tarea
     * 
     * método que invoca el getter de la variable cuenta
     * para devolver el resultado de su invocación
     * 
     * @return getCuenta() getter de la variable cuenta
     */
    public String obtenerCuenta()
    {
        return getCuenta();
    }

    /**comentarios para parte JAVADOC de la tarea
     * 
     * método getter de la variable nombre
     * 
     * @return nombre
     */
    public String getNombre() {
        return nombre;
    }

    /**comentarios para parte JAVADOC de la tarea
     * 
     * método setter de la variable nombre
     * 
     * @param nombre
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**comentarios para parte JAVADOC de la tarea
     * 
     * método getter de la variable tipoInteres
     * 
     * @return tipoInteres
     */
    public double getTipoInterés() {
        return tipoInterés;
    }

    /**comentarios para parte JAVADOC de la tarea
     * 
     * método setter de la variable tipoInteres
     * 
     * @param tipoInterés 
     */
    public void setTipoInterés(double tipoInterés) {
        this.tipoInterés = tipoInterés;
    }

    /**comentarios para parte JAVADOC de la tarea
     * 
     * @return cuenta
     */
    public String getCuenta() {
        return cuenta;
    }

    /**comentarios para parte JAVADOC de la tarea
     * 
     * @param cuenta the cuenta to set
     */
    public void setCuenta(String cuenta) {
        this.cuenta = cuenta;
    }

    /**comentarios para parte JAVADOC de la tarea
     * @return the saldo
     */
    public double getSaldo() {
        return saldo;
    }

    /**comentarios para parte JAVADOC de la tarea
     * @param saldo the saldo to set
     */
    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }
}
