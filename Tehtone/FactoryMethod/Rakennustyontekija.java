package Assignments.FactoryMethod;

public class Rakennustyontekija extends AterioivaOtus {
    @Override
    public Juoma createJuoma() {
        return new Ohrapirtelo();
    }
}
