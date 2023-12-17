package Assignments.Facade;

public class Main {
    public static void main(String[] args) {
        CPU cpu = new CPU();
        Memory memory = new Memory();
        HardDrive hardDrive = new HardDrive();
        ComputerFacade computer = new ComputerFacade(cpu, memory, hardDrive);


        computer.Start();
    }
}


