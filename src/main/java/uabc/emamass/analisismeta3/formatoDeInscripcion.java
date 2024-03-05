/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package uabc.emamass.analisismeta3;
import java.util.Scanner;
/**
 *
 * @author Emanuel Seiji Massuda Cuevas (poppe)
 */
public class formatoDeInscripcion {
    tiraDeMaterias ListaDeCursos = new tiraDeMaterias();
    Scanner sc = new Scanner(System.in);
    public formatoDeInscripcion(){
    }
    
    private void actualizaFormato(String mensaje){
        System.out.println(mensaje);
    }
    
    public void inscribir(String estudiante, String curso){
        actualizaFormato(ListaDeCursos.UPDATE(estudiante,curso));   
    }
    
    public void eligeCurso(){
        inscribir("Emanuel Seiji",sc.nextLine());
    }
}
