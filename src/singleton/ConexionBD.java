package singleton;
/**
 * ConexionBD.java: Patron de diseño Singleton.
 * @author Ricardo Presilla.
 * @version 1.0.
 */
public class ConexionBD {
    private static ConexionBD conexion;
    private String host;
    private String puerto;
    
    /** Constructor privado para el patron Singleton. */
    private ConexionBD(){
        
    }
    
    /**
     * @return Regresa un objeto tipo ConexionBD.
     * */
    public static ConexionBD getConexion() {
        if(conexion == null){
            conexion = new ConexionBD();
        }
        return conexion;
    }

    /**
     * Obtiene el host.
     * @return Regresa string con el host de la conexión.
     */
    public String getHost() {
        return host;
    }

    /**
     * Asigna el host.
     * @param host Tipo String.
     **/
    public void setHost(String host) {
        this.host = host;
    }

    /**
     * Obtiene el puerto.
     * @return Regresa string con el puerto de la conexión.
     */
    public String getPuerto() {
        return puerto;
    }

    /**
     * Asigna el puerto.
     * @param puerto Tipo String.
     **/
    public void setPuerto(String puerto) {
        this.puerto = puerto;
    }
}
