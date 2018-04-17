/*
 * Cálculo de interés simple = capital * redito * tiempo/100.
 * El capital y el tiempo son >0.
 * El redito puede ser negativo o cero.
 * autor: profesor
 */
package proyecto_interes;

/**
 *
 * @author Ruben Lopez
 */
public class Interes {

    /**
     * Declaracion de las variables de la clase
     */
    public int x=2;
    private float capital;
    private float redito;
    private int tiempo;

    /**
     *
     * @param capital 
     * @param redito
     * @param tiempo
     * 
     */
    
     /**
     * Método constructor de la clase
     * 
     */
    public Interes(float capital, float redito, int tiempo) {        
        this.capital=capital;
        this.redito=redito;
        this.tiempo=tiempo;
    }

    /**
     *
     * Método que se utiliza para calcular el interés
     * 
     * @return devuelve el interés calculado a partir del capital, tiempo y
     * redito
     * @throws Exception si el capital o el tiempo son menores que 0 se lanza
     * una excepcion avisando de este error.
     */
    public double CalcularInteres()throws Exception{
        if (capital<=0)
            throw (new Exception ("Error. El capital tiene que ser >=0"));
        if (tiempo<=0)
            throw (new Exception ("Error. El interés tiene que ser >=0"));
        x=25;
        return (double)capital*redito*tiempo/100;
    }
}
