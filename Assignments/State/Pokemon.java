package Assignments.State;

class Pokemon {
    State state;

    public Pokemon() {
        this.state = new Charmander();
    }

    void attack() {
        state.attack();
    }

    void defend() {
        state.defend();
    }

    void evolve() {
        if (state.nextState != null) {
            state = state.nextState;
            state.evolve();
        }
    }
}
