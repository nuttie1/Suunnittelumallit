package factorymethod;

public class Rakennustyontekija extends AterioivaOtus {
    @Override
    public Juoma createJuoma() {
        return new Ohrapirtelo();
    }
}
