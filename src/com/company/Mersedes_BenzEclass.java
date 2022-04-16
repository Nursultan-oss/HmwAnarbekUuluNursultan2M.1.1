package com.company;

public final class Mersedes_BenzEclass extends Mersedes_Benz_Sclass{
    private Model model;
    private ColorOfAutos enumColor;

    public Model getModel() {
        return model;
    }

    public ColorOfAutos getEnumColor() {
        return enumColor;
    }

    @Override
    public void makeVoice() {
        System.out.println("БРУМММ БРУМММ");
    }

    }

