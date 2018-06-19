package com.drools.example;


import javax.swing.*;

public class Komunikator {


    public static String Zapytaj(String pytanie){
        Object [] opcje = {"Yes","No"};
        int odp = JOptionPane.showOptionDialog(null,pytanie,"Question",JOptionPane.YES_NO_OPTION,JOptionPane.QUESTION_MESSAGE,null,opcje,opcje[0]);
        System.out.println(pytanie+"   "+opcje[odp].toString());
        return opcje[odp].toString();
    }

    public static String ZapytajTrzy(String pytanie){
        Object [] opcje = {"Yes","No","Maybe"};
        int odp = JOptionPane.showOptionDialog(null,pytanie,"Question",JOptionPane.YES_NO_OPTION,JOptionPane.QUESTION_MESSAGE,null,opcje,opcje[0]);
        System.out.println(pytanie+"   "+opcje[odp].toString());
        return opcje[odp].toString();
    }

    public static void Zakoncz(String wybor){
        JOptionPane.showMessageDialog(null,wybor);
    }
}
