package Assignments.Facade;

class ComputerFacade {
    private CPU cpu;
    private Memory memory;
    private HardDrive hardDrive;
    private static final long kBootAddress = 0; // replace with actual boot address
    private static final long kBootSector = 0; // replace with actual boot sector
    private static final int kSectorSize = 512; // replace with actual sector size

    public ComputerFacade(CPU cpu, Memory memory, HardDrive hardDrive) {
        this.cpu = cpu;
        this.memory = memory;
        this.hardDrive = hardDrive;
    }

    public void Start() {
        cpu.Freeze();
        byte[] bootData = hardDrive.Read(kBootSector, kSectorSize);
        memory.Load(kBootAddress, bootData);
        cpu.Jump(kBootAddress);
        cpu.Execute();
        memory.printMemory();
    }
}
