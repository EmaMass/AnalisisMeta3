/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package uabc.emamass.analisismeta3;

/**
 *
 * @author Emanuel Seiji Massuda Cuevas (poppe)
 */
public class Dashboard {

    public static void main(String[] args) {
        Dashboard dash = new Dashboard();
        dash.despliegaSensores();
        Formato formatoDeInscripcion = new Formato();    
        formatoDeInscripcion.eligeCurso();
    }
    
    private void despliegaSensores(){
        SensorProxy Sensores = new SensorProxy();
        updateDisplay(Sensores.updateData());
    }
    
    private void updateDisplay(String valores){
        System.out.println(valores);
    }
}
