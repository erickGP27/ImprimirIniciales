package imprimiriniciales;
import java.util.Scanner;

/**
 *
 * @author maryse
 *
 * Scanner Este programa imprime las iniciales del nombre introducido por el
 * usuario.
 *
 */
public class ImprimirIniciales {
    Scanner stdIn = new Scanner(System.in);
    static String nombre = "" ; // nombre
    static String apellido = "" ; 
    public void Ine(String nombre, String apellido){
        System.out.print("Introduzca su nombre y primer apellido separados por un espacio: ");
        nombre = stdIn.next();
        apellido = stdIn.next();
        System.out.println("Sus iniciales son " + nombre.charAt(0) + apellido.charAt(0) + ".");

    }
    
    
    public static void main(String[] args) {
        // apellido
        ImprimirIniciales Ine = new ImprimirIniciales();
        Ine.Ine (nombre, apellido);
        
        
        
    }

}
