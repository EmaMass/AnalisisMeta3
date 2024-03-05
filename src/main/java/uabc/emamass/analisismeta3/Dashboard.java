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
        dash.despliegaSensores(args);
        formatoDeInscripcion Formato = new formatoDeInscripcion();
        Formato.inscribir("Emanuel Seiji");
    }
    
    private void despliegaSensores(String[] args){
        SensorProxy LightSensor = new SensorProxy();
        SensorProxy TemperatureSensor = new SensorProxy();
        updateDisplay(TemperatureSensor.updateData());
        updateDisplay(LightSensor.updateData());
    }
    
    private void updateDisplay(int valores){
        System.out.println(valores);
    }
}
