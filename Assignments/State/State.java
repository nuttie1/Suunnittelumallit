package Assignments.State;

abstract class State {
    String name;
    State nextState;

    public State(String name, State nextState) {
        this.name = name;
        this.nextState = nextState;
    }

    abstract void attack();

    abstract void defend();

    abstract void evolve();
}
