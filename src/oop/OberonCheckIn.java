package oop;

public class OberonCheckIn {
    public static void main(String[] args) {

        Oberon casey = new Oberon("WebDev", "San Antonio", 25, false, "Oberon", 6);
        Oberon josh = new Oberon("WebDev", "San Antonio", 25, true, "Oberon", 6);
        Oberon laura = new Oberon("WebDev", "San Antonio", 25, false, "Oberon", 6);


        System.out.println(casey.isEnrolled());
        System.out.println(josh.isEnrolled());
        System.out.println(laura.getLocation());


        System.out.println(casey.displayInfo());
    }
}
