    /*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package uabc.emamass.analisismeta3;
import java.util.Random;
/**
 *
 * @author Emanuel Seiji Massuda Cuevas (poppe)
 */
public class SensorProxy {
    int ciclos;
    Random rmd;
    public SensorProxy(){
        this.ciclos = 5;
        this.rmd = new Random();
    }
    
    public int updateData(){
        int avg = 0;
        while(ciclos > 0){
            ciclos--;
            avg = avg + read();
        }
        avg = avg/5;
        return avg;
    }
    
    private int read(){
        return rmd.nextInt(50);
    }
}
