package Assignments.Composite.Factories;

import Assignments.Composite.Components.Component;

public interface Factory {
    Component createCase();
    Component createMotherboard();
    Component createCPU();
    Component createGPU();
    Component createRAM();
    Component createNetwork();
}
