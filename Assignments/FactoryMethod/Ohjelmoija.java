package Assignments.FactoryMethod;

public class Ohjelmoija extends AterioivaOtus {

    @Override
    public Juoma createJuoma() {
        return new Kahvi();
    }
}
