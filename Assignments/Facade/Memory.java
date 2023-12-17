package Assignments.Facade;

class Memory {
    byte[] memoryArray = new byte[1024]; // Consider the size of memory

    void Load(long position, byte[] data) {
        System.out.println("Memory Load to position: " + position);
        System.arraycopy(data, 0, memoryArray, (int) position, data.length);
    }

    void printMemory() {
        for (int i = 0; i < memoryArray.length; i++) {
            System.out.println("Memory address: " + i + ", data: " + memoryArray[i]);
        }
    }
}
