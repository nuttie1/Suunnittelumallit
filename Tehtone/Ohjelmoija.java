package factorymethod;

public class Ohjelmoija extends AterioivaOtus {

    @Override
    public Juoma createJuoma() {
        return new Kahvi();
    }
}
