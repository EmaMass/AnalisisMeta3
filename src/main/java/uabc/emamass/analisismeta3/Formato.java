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
public class Formato {
    ListaDeCursos tiraDeMaterias = new ListaDeCursos();
    Scanner sc = new Scanner(System.in);
    public Formato(){
    }
    
    private void actualizaFormato(String mensaje){
        System.out.println(mensaje);
    }
    
    public void inscribir(String estudiante, String curso){
        actualizaFormato(tiraDeMaterias.UPDATE(estudiante,curso));   
    }
    
    public void eligeCurso(){
        inscribir("Emanuel Seiji",sc.nextLine());
    }
}
