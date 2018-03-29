package fierro;

import java.util.ArrayList;
/**
 *
 * @author Nicolaás Vasquez
 */
public class UsoUsuarios {

    private static ArrayList<Usuario> listaUsuarios = new ArrayList<>();

    public UsoUsuarios() {
        if (listaUsuarios.isEmpty()) {
            listaUsuarios.add(new Usuario("a", "a", "Admin@fierro.com.ar", "Admin", "123456", 1, 1, 1900));
            listaUsuarios.trimToSize();
        }
    }

    public UsoUsuarios(Usuario usuario1) {
        this();
        listaUsuarios.add(usuario1);
        listaUsuarios.trimToSize();
    }
 
    public Usuario getUsuario(int i) {
        return listaUsuarios.get(i);
    }

    public int getTamano() {
        return listaUsuarios.size();
    }

    public String getNombre(int i) {
        return listaUsuarios.get(i).getNombre();
    }

    public String getApellido(int i) {
        return listaUsuarios.get(i).getApellido();
    }

    public String getEmail(int i) {
        return listaUsuarios.get(i).getEmail();
    }

    public String getNombreUsuario(int i) {
        return listaUsuarios.get(i).getNombreUsuario();
    }

    public String getClave(int i) {
        return listaUsuarios.get(i).getClave();
    }

    public String getCClave(int i) {
        return listaUsuarios.get(i).getCClave();
    }

    public int getDiaNacimiento(int i) {
        return listaUsuarios.get(i).getDiaNacimiento();
    }

    public int getMesNacimento(int i) {
        return listaUsuarios.get(i).getMesNacimento();
    }

    public int getAnioNacimiento(int i) {
        return listaUsuarios.get(i).getAnioNacimiento();
    }
}
