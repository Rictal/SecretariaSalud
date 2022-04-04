/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package autenticacion;

/**
 *
 * @author bryan
 */
public interface IAutenticacionUsuario {
    
    public boolean autenticarHabitante (String numSocial);
    public boolean autenticarTrabajadorSalud (String usuario, String contrasenia);
    public boolean validarDatoBiometrico (byte[] datoBiometrico);
      
}
