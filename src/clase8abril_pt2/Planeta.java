package clase8abril_pt2;

/**
 * ENUM COMPLEJA.
 * Recuerde que pueden contener campos, constructores y metodos.
 * @author Angonoa, Franco
 */
public enum Planeta {
    //Cada enum llama al constructor: (masa, radio)
    MERCURIO(3.303e+23, 2.4397e6),
    VENUS(4.869e+24, 6.0518e6),
    TIERRA(5.976e+24, 6.37814e6),
    MARTE(6.421e+23, 3.3972e6),
    JUPITER(1.9e+27, 7.1492e7),
    SATURNO(5.688e+26, 6.0268e7),
    URANO(8.686e+25, 2.5559e7),
    NEPTUNO(1.024e+26, 2.4746e7),
    PLUTON(1.27e+22, 1.137e6);

    /*
        CAMPOS
    */
    private final double masa;   // en kilogramos
    private final double radio; // en metros

    /*
        CONSTRUCTOR
    */
    private Planeta(double masa, double radio) {
        this.masa = masa;
        this.radio = radio;
    }

    /*
        METODOS
    */
    public double getMasa() {
        return masa;
    }

    public double getRadio() {
        return radio;
    }

    /*
        G: Constante de gravitacion universal 
        Unidad: [m3 * kg^-1 * s^-2]
    */
    public static final double G = 6.67300E-11; //El E expresa la potencia.

    /**
     * Calcula la gravedad en un planeta.
     * 
     * @return valor double que representa la gravedad del planeta.
     */
    public double gravedadSuperficie() {
        return G * masa / (radio * radio);
    }

    /**
     * Calcula el peso en otro planeta.
     * Para calcular el peso se tiene que que multiplicar
     * la masa del cuerpo por la gravedad del planeta en
     * que se encuentra.
     * @param otraMasa Valor en kg que representa la masa.
     * @return Valor double que representa el peso en el planeta.
     */
    public double pesoSuperficie(double otraMasa) {
        return otraMasa * gravedadSuperficie();
    }
}
