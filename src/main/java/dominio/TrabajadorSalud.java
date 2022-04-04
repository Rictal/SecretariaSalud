package dominio;

import java.io.File;

public class TrabajadorSalud extends Persona{

    private String nombre;
    private String direccion;
    private Boolean cedula;
    private Hospital hospital;
    private File huellaDactilar;
    private String usuario;
    private String contrasenia;

    public TrabajadorSalud() {
    }

    public TrabajadorSalud(String usuario, String contrasenia) {
        this.usuario = usuario;
        this.contrasenia = contrasenia;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public Boolean getCedula() {
        return cedula;
    }

    public void setCedula(Boolean cedula) {
        this.cedula = cedula;
    }

    public Hospital getHospital() {
        return hospital;
    }

    public void setHospital(Hospital hospital) {
        this.hospital = hospital;
    }

    public File getHuellaDactilar() {
        return huellaDactilar;
    }

    public void setHuellaDactilar(File huellaDactilar) {
        this.huellaDactilar = huellaDactilar;
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public String getContrasenia() {
        return contrasenia;
    }

    public void setContrasenia(String contrasenia) {
        this.contrasenia = contrasenia;
    }
 
}
