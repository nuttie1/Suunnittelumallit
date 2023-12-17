package Assignments.State;

class Charmeleon extends State {
    public Charmeleon() {
        super("Charmeleon", new Charizard());
    }

    void attack() {
        System.out.println(name + " käyttää Dragon Breath!");
    }

    void defend() {
        System.out.println(name + " puolustaa!");
    }

    void evolve() {
        System.out.println(name + " kehittyy " + nextState.name + "!");
    }
}
