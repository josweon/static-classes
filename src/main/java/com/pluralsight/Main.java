package com.pluralsight;

public class Main{

    public static void main(String[] args) {
        //Test basic
        System.out.println(NameFormatter.format("Mojo", "Jojo"));

        //Test all fields
        System.out.println(NameFormatter.format(null, "Lebron", "Raymone", "James", "Sr"));

        //Test different fullnames
        //Prefix and Suffix
        System.out.println(NameFormatter.format("Dr. Mel B Johnson, PhD"));
        //Suffix only
        System.out.println(NameFormatter.format("Mel B Johnson, PhD"));
        //Regular name
        System.out.println(NameFormatter.format("Mel Johnson"));
    }
}
