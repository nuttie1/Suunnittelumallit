package factorymethod;

public class Main {

    public static void main(String[] args) {
        AterioivaOtus opettaja = new Opettaja();
        AterioivaOtus ohjelmoija = new Ohjelmoija();
        AterioivaOtus rakennustyontekija = new Rakennustyontekija();

        opettaja.aterioi();
        ohjelmoija.aterioi();
        rakennustyontekija.aterioi();
    }
}
