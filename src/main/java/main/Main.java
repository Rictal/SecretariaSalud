/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;

import dominio.Habitante;
import persistencia.HabitanteAPIRest;
import persistencia.IHabitantesAPIRest;

/**
 *
 * @author bryan
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        IHabitantesAPIRest habitantesApi = habitantesApi = new HabitanteAPIRest(); 
        Habitante hb = new Habitante();
        
        hb = habitantesApi.consultarPorId(2L);
        System.out.println(hb);
    }
    
}
