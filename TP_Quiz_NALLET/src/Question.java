/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Elna
 */
public class Question {

    private String intitule;
    private String prop1;
    private String prop2;
    private String prop3;
    private String prop4;
    private int iBR;

    public Question(String inti, String p1, String p2, String p3, String p4, int indBR) {
        this.intitule = inti;
        this.prop1 = p1;
        this.prop2 = p2;
        this.prop3 = p3;
        this.prop4 = p4;
        this.iBR = indBR;
    }

    public String getinti() {
        return intitule;
    }

    public String getp1() {
        return prop1;
    }

    public String getp2() {
        return prop2;
    }

    public String getp3() {
        return prop3;
    }

    public String getp4() {
        return prop4;
    }

    public int getindBR() {
        return iBR;
    }

}
