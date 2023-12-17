package Assignments.Facade;

class HardDrive {
    byte[] Read(long lba, int size) {
        System.out.println("HardDrive Read from position: " + lba + ", size: " + size);
        byte[] data = new byte[size];
        for (int i = 0; i < size; i++) {
            data[i] = (byte) (i % 256); // example data
        }
        return data;
    }
}
