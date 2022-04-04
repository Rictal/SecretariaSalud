/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package autenticacion;

import dominio.Habitante;
import dominio.TrabajadorSalud;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author bryan
 */
public class AutenticacionUsuario implements IAutenticacionUsuario {

    private final List<Habitante> listaHabitantes;
    private final List<TrabajadorSalud> listaTrabajadoresSalud;
    private final byte[] datoBiometrico;

    public AutenticacionUsuario() {
        this.listaHabitantes = new ArrayList<>();
        this.listaHabitantes.add(new Habitante("198203"));
        this.listaHabitantes.add(new Habitante("159244"));
        this.listaHabitantes.add(new Habitante("129384"));

        this.listaTrabajadoresSalud = new ArrayList<>();
        this.listaTrabajadoresSalud.add(new TrabajadorSalud("Maria1032", "1234"));
        this.listaTrabajadoresSalud.add(new TrabajadorSalud("Eduardo5011", "4321"));
        this.listaTrabajadoresSalud.add(new TrabajadorSalud("Raul8888", "2314"));

        this.datoBiometrico = new byte[5];
    }

    @Override
    public boolean autenticarHabitante(String numSocial) {
        for (int i = 0; i < this.listaHabitantes.size(); i++) {
            if (this.listaHabitantes.get(i).getNumSeguroSocial().equalsIgnoreCase(numSocial));
            return true;
        }
        return false;
    }

    @Override
    public boolean autenticarTrabajadorSalud(String usuario, String contrasenia) {
        for (int i = 0; i < this.listaTrabajadoresSalud.size(); i++) {
            if (this.listaTrabajadoresSalud.get(i).getUsuario().equals(usuario)) {
                if (this.listaTrabajadoresSalud.get(i).getContrasenia().equals(contrasenia)) {
                    return true;
                }
            }
        }
        return false;
    }

    @Override
    public boolean validarDatoBiometrico(byte[] datoBiometrico) {
        if (datoBiometrico.length == this.datoBiometrico.length) {
            return true;
        }
        return false;
    }

}
