package Assignments.Proxy;

// On System B
class ProxyImage implements Image {
    private final String filename;
    private final String name;
    private RealImage image;

    /**
     * constructor
     * @param filename
     * @param name
     */
    public ProxyImage(String filename, String name) {
        this.filename = filename;
        this.name = name;
    }

    /**
     * Displays the image
     */
    public void displayImage() {
        if (image == null) {
            image = new RealImage(filename, name);
        }
        image.displayImage();
    }

    /**
     * Shows image's data
     */
    public void showData() {
        System.out.println("Image name: " + name);
    }
}
