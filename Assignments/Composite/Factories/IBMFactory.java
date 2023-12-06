package Assignments.Composite.Factories;

import Assignments.Composite.Components.*;

public class IBMFactory implements Factory {

    @Override
    public Component createCase() {
        return new Case(39.0);
    }

    @Override
    public Component createMotherboard() {
        return new Motherboard(299.29);
    }

    @Override
    public Component createCPU() {
        return new CPU(159.00);
    }

    @Override
    public Component createGPU() {
        return new GPU(1299.00);
    }

    @Override
    public Component createRAM() {
        return new RAM(159.00);
    }

    @Override
    public Component createNetwork() {
        return new Network(49.00);
    }
}
