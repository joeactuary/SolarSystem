package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here

        SolarSystem andromeda =new SolarSystem();
        andromeda.Sun=1;
        andromeda.planet=2;
        andromeda.moon=4;

        FeatureSun mikesun = new FeatureSun();
        mikesun.color="Red";
        mikesun.heat="888881111111111111kj";
        mikesun.temp="60000545454454545kelvin";
        mikesun.radius="9000000km";
        mikesun.maritalStatus="in love with asghar";

        FeaturePlanet melkor = new FeaturePlanet();
        melkor.mass = "56758787KG";
        melkor.color="Red";
        melkor.radius = "654654M";
        melkor.temp = "85F";

        FeaturePlanet jupiter = new FeaturePlanet();
        melkor.mass = "56758787KG";
        melkor.color="Red";
        melkor.radius = "654654M";
        melkor.temp = "85F";

        FeaturePlanet planet1 = new FeaturePlanet();
        planet1.mass = "56758787KG";
        planet1.color="Red";
        planet1.radius = "654654M";
        planet1.temp = "85F";
    }
}
