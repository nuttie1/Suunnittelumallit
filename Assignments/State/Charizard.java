package Assignments.State;

class Charizard extends State {
    public Charizard() {
        super("Charizard", null);
    }

    void attack() {
        System.out.println(name + " käyttää Fire Blast!");
    }

    void defend() {
        System.out.println(name + " puolustaa!");
    }

    void evolve() {
        if (nextState != null) {
            System.out.println(name + " kehittyy " + nextState.name + "!");
        }
    }
}
