package dominio;

import java.io.File;

public class Habitante extends Persona {

    private long id;
    private String nombre;
    private String direccion;
    private int edad;
    private byte[] datoBiometrico;
    private Tutor tutor;
    private Expediente expediente;
    private String numSeguroSocial;

    public Habitante() {
    }

    public Habitante(long id) {
        this.id = id;
    }

    public Habitante(String numSeguroSocial) {
        this.numSeguroSocial = numSeguroSocial;
    }

    public Habitante(String nombre, String direccion, int edad, byte[] datoBiometrico, Tutor tutor, Expediente expediente) {
        this.nombre = nombre;
        this.direccion = direccion;
        this.edad = edad;
        this.datoBiometrico = datoBiometrico;
        this.tutor = tutor;
        this.expediente = expediente;
    }

    public Habitante(long id, String nombre, String direccion, int edad, byte[] datoBiometrico, Tutor tutor, Expediente expediente) {
        this.id = id;
        this.nombre = nombre;
        this.direccion = direccion;
        this.edad = edad;
        this.datoBiometrico = datoBiometrico;
        this.tutor = tutor;
        this.expediente = expediente;
    }

    public Habitante(long id, String nombre, String direccion, int edad, byte[] datoBiometrico, Tutor tutor, Expediente expediente, String numSeguroSocial) {
        this.id = id;
        this.nombre = nombre;
        this.direccion = direccion;
        this.edad = edad;
        this.datoBiometrico = datoBiometrico;
        this.tutor = tutor;
        this.expediente = expediente;
        this.numSeguroSocial = numSeguroSocial;
    }

    public String getNumSeguroSocial() {
        return numSeguroSocial;
    }

    public void setNumSeguroSocial(String numSeguroSocial) {
        this.numSeguroSocial = numSeguroSocial;
    }

    
    
    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
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

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public byte[] getDatoBiometrico() {
        return datoBiometrico;
    }

    public void setDatoBiometrico(byte[] datoBiometrico) {
        this.datoBiometrico = datoBiometrico;
    }

    public Tutor getTutor() {
        return tutor;
    }

    public void setTutor(Tutor tutor) {
        this.tutor = tutor;
    }

    public Expediente getExpediente() {
        return expediente;
    }

    public void setExpediente(Expediente expediente) {
        this.expediente = expediente;
    }

}
