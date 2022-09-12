package singleton;
/**
 * Implementa el método main para la ejecución del programa.
 * @author Ricardo Presilla.
 * @version 1.0.
 */
public class Main {

    public static void main(String[] args) {
	    ConexionBD conexion = ConexionBD.getConexion();
        ConexionBD conexion2 = ConexionBD.getConexion();

        conexion.setHost("localhost");
        conexion.setPuerto("3600");

	    System.out.println("Ejemplo del patron creacional Singleton: ");
	    System.out.printf("La conexion 1 tiene el hash#: %d\n", conexion.hashCode());
        System.out.printf("La conexion 2 tiene el hash#: %d\n", conexion2.hashCode());

        System.out.println("Otra demostración es: ");
        System.out.printf("El host de la conexion 1 es: %s\n", conexion.getHost());
        System.out.printf("El host de la conexion 2 es: %s\n", conexion2.getHost());
    }
}
