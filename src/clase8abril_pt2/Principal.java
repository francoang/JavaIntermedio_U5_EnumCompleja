package clase8abril_pt2;

import static clase8abril_pt2.Planeta.*;

/**
 * ENUM COMPLEJA visto en clases.
 * Ejemplo que se encuentra en la filmina.
 * @author Angonoa, Franco
 * @version 1.0
 * @since 8 de ABRIL del 2020
 */
public class Principal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        System.out.println("Ingrese su peso (en kgf): ");
        double pesoTierra = Consola.readDouble();
        
        //Calculamos la masa en el planeta Tierra.
        double masa = pesoTierra / TIERRA.gravedadSuperficie();
        
        //Recorro el vector de enum
        Planeta[] planetas = Planeta.values(); //Metodo values() devuelve un arreglo de Planeta
        for (Planeta p : planetas) {
            System.out.println("Tu peso en " + p + " es de: "
                    + p.pesoSuperficie(masa) + " kgf");
        }

    } //Fin del metodo main

} //Fin de la clase
