package com.example.Oop.chef.steak;

import com.example.Oop.chef.Utensil.Utensil;
import com.example.Oop.chef.Utensil.UtensilManager;

import java.util.Arrays;

abstract public class SteakPart {
    protected Utensil []utensilsForSteak;
    protected String butter;
    protected String steak_type;
    public void readyToCook(Utensil[] utensils,String butter){
        utensilsForSteak=utensils;
        this.butter=butter;
        System.out.println("Ready To Cook");
    }
    public void cook(){
        Arrays.stream(utensilsForSteak).forEach(
                System.out::println);
        System.out.println("과" +butter+" 으로 요리합니다");
    }
    public void resting(){
        System.out.println("Resting");
    }
}
