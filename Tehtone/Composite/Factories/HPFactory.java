package Assignments.Composite.Factories;

import Assignments.Composite.Components.*;

public class HPFactory implements Factory {

    @Override
    public Component createCase() {
        return new Case(10.0);
    }

    @Override
    public Component createMotherboard() {
        return new Motherboard(270.0);
    }

    @Override
    public Component createCPU() {
        return new CPU(123.00);
    }

    @Override
    public Component createGPU() {
        return new GPU(100.00);
    }

    @Override
    public Component createRAM() {
        return new RAM(120.00);
    }

    @Override
    public Component createNetwork() {
        return new Network(12.00);
    }
}
