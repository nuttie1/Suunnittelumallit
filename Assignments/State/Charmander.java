package Assignments.State;

class Charmander extends State {
    public Charmander() {
        super("Charmander", new Charmeleon());
    }

    void attack() {
        System.out.println(name + " käyttää Flamethrower!");
    }

    void defend() {
        System.out.println(name + " puolustaa!");
    }

    void evolve() {
        System.out.println(name + " kehittyy " + nextState.name + "!");
    }
}
