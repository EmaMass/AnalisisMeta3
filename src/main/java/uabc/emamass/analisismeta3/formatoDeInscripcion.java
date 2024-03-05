/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package uabc.emamass.analisismeta3;

/**
 *
 * @author Emanuel Seiji Massuda Cuevas (poppe)
 */
public class formatoDeInscripcion {
    tiraDeMaterias ListaDeCursos = new tiraDeMaterias();
    public formatoDeInscripcion(){

    }
    
    private void actualizaFormato(String mensaje){
        System.out.println(mensaje);
    }
    
    public void inscribir(String estudiante){
        actualizaFormato(ListaDeCursos.UPDATE(estudiante));   
    }
}
