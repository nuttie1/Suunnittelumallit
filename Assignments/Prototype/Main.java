package Assignments.Prototype;

public class Main {
    public static void main(String[] args) throws CloneNotSupportedException {
        Kello alkuperainen = new Kello(10, 30, 20);

        Kello matalaKlooni = (Kello) alkuperainen.clone();

        Kello syvaKlooni = alkuperainen.syvaKopioi();

        System.out.println("Alkuperäinen kello: " + alkuperainen);
        System.out.println("Matalakopioitu kello: " + matalaKlooni);
        System.out.println("Syväkopioitu kello: " + syvaKlooni);

        alkuperainen.tunti.setArvo(12);
        alkuperainen.minuutti.setArvo(45);
        alkuperainen.sekunti.setArvo(59);

        System.out.println("Alkuperäinen kello muutoksen jälkeen: " + alkuperainen);
        System.out.println("Matalakopioitu kello muutoksen jälkeen: " + matalaKlooni);
        System.out.println("Syväkopioitu kello muutoksen jälkeen: " + syvaKlooni);
    }
}

