package Assignments.Composite;

import Assignments.Composite.Factories.HPFactory;
import Assignments.Composite.Factories.IBMFactory;

public class Main {
    public static void main(String[] args) {
        IBMFactory ibm = new IBMFactory();
        Assemblyline assemblyline = new Assemblyline(ibm);
        assemblyline.assembly();
        System.out.println(assemblyline.getPrice());

        HPFactory hp = new HPFactory();
        assemblyline.setFactory(hp);
        assemblyline.assembly();
        System.out.println(assemblyline.getPrice());
    }
}