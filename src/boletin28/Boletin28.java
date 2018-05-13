
package boletin28;

/**
 *
 * @author Juan Borrajo Rodriguez
 */
public class Boletin28 {

    
    public static void main(String[] args) {
        Alumno alumnoNuevo=new Alumno("Juan",10,"Vigo",254);
        System.out.println(alumnoNuevo.amosar());
        alumnoNuevo.cambiarNota();
        System.out.println(alumnoNuevo.amosar());
        
        
    }

}
