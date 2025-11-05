/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tp2_convertisseurobjet_nallet;

/**
 *
 * @author Elna
 */
public class Convertisseur {
    int nbConversions;
    
    public Convertisseur(){
        nbConversion =0;
    }
    public float CelciusVersKelvin (float tCelcius){
        float tKelvin;
        nbConversions++;
        tKelvin = tCelcius+273;
        return tKelvin;
    }
    public float KelvinVersCelcius (float tKelvin){
        float tCelcius;
        nbConversions++;
        tKelvin = tKelvin-273;
        return tCelcius;
    }
    public float FarenheitVersCelcius (float tFarenheit){
        float tCelcius;
        nbConversions++;
        tCelcius = tFarenheit+17;
        return tCelcius;
    }
    public float CelciusVersFarenheit (float tCelcius){
        float tFarenheit;
        nbConversions++;
        tCelcius = tCelcius-17;
        return tFarenheit;
    }
    public float KelvinVersFarenheit (float tCelcius){
        float tFarenheit;
        nbConversions++;
        tCelcius = tKelvin-255;
        return tFarenheit;
    }
    public float FarenheitVersKelvin (float tFarenheit){
        float tKelvin;
        nbConversions++;
        tKelvin = tFarenhiet-255;
        return tKelvin;
    }
    @Override public String toString () { 
        return "nb de conversions"+ nbConversions; 
    }
    }