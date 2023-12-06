package Assignments.Composite;

import Assignments.Composite.Components.Component;
import Assignments.Composite.Factories.Factory;

public class Assemblyline {
    private Factory assemblyFactory;
    private Component computerCase;
    private Component motherboard;
    private Component cpu;
    private Component gpu;
    private Component ram;
    private Component network;

    public Assemblyline(Factory factory) {
        this.assemblyFactory = factory;
    }
    public void setFactory(Factory factory){
        this.assemblyFactory = factory;
    }

    public void assembly(){
        computerCase = assemblyFactory.createCase();
        motherboard = assemblyFactory.createMotherboard();
        cpu = assemblyFactory.createCPU();
        gpu = assemblyFactory.createGPU();
        ram = assemblyFactory.createRAM();
        network = assemblyFactory.createNetwork();

        motherboard.add(cpu);
        motherboard.add(gpu);
        motherboard.add(ram);
        motherboard.add(network);

        computerCase.add(motherboard);
    }
    public double getPrice() {
        return computerCase.getPrice();
    }
}
