package fierro;

public class Usuario {

    private static String nombre, apellid, email, nomusuario, clave, cclave;
    private String mensaje;

    public String getMensaje() {
        return mensaje;
    }
    private int dian, mesn, anion;
    static String users[][] = new String[10][2];

    public Usuario() {
        users[0][0] = "Admin";
        users[0][1] = "123456";
    }

    public String getNombre() {
        return nombre;
    }

    public String getApellid() {
        return apellid;
    }

    public String getEmail() {
        return email;
    }

    public String getNomusuario() {
        return nomusuario;
    }

    public String getClave() {
        return clave;
    }

    public String getCclave() {
        return cclave;
    }

    public int getDian() {
        return dian;
    }

    public int getMesn() {
        return mesn;
    }

    public int getAnion() {
        return anion;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setApellid(String apellid) {
        this.apellid = apellid;
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

    public void setUsuario() {
        int ui = 0;
        for (int i = 0; i < 10; i++) {
            if (ui < 10 && users[i][0] != null) {
                ui++;
            }
        }
        System.out.println("Numero de usuarios: " + ui);
        if (ui == 10) {
            mensaje = "No hay mas cupos. Lo sentimos\npero no puede registrarse";
        } else {
            System.out.println("Registro :" + ui);
            users[ui][0] = nomusuario;
            users[ui][1] = clave;
            mensaje = "Usted se a registrado correctamente";
        }
    }
}
