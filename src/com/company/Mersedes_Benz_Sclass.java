package com.company;

public class Mersedes_Benz_Sclass extends Daimler {

    private int year;

    public int getYear() {
        return year;
    }

    public void makeVoice (){
        System.out.println("БРММ БРММ");
    }
    public final void makeVoice (String voice) {
        System.out.println(voice);
    }

    }

