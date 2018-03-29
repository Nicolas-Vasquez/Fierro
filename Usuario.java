package fierro;
/**
 *
 * @author Nicolaás Vasquez
 */
public class Usuario {

    private String nombre, apellido, email, nomusuario, clave, cclave;
    private int dian, mesn, anion;

    public Usuario() {
        
    }
    
    public Usuario(String nombre, String apellido, String email, String nomusuario, 
                   String clave, int dianacimiento, int mesnacimiento, int anionacimiento){
        this.nombre = nombre;
        this.apellido = apellido;
        this.email = email;
        this.nomusuario = nomusuario;
        this.clave = clave;
        this.dian = dianacimiento;
        this.mesn = mesnacimiento;
        this.anion = anionacimiento;
    }
    
    public String getNombre() {
        return nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public String getEmail() {
        return email;
    }

    public String getNombreUsuario() {
        return nomusuario;
    }

    public String getClave() {
        return clave;
    }

    public String getCClave() {
        return cclave;
    }

    public int getDiaNacimiento() {
        return dian;
    }

    public int getMesNacimento() {
        return mesn;
    }

    public int getAnioNacimiento() {
        return anion;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setApellid(String apellido) {
        this.apellido = apellido;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setNomusuario(String nomusuario) {
        this.nomusuario = nomusuario;
    }

    public void setClave(String clave) {
        this.clave = clave;
    }

    public void setCclave(String cclave) {
        this.cclave = cclave;
    }

    public void setDian(int dian) {
        this.dian = dian;
    }

    public void setMesn(int mesn) {
        this.mesn = mesn;
    }

    public void setAnion(int anion) {
        this.anion = anion;
    }
}
