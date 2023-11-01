package Assignments.Proxy;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(final String[] arguments) {
        List<Image> photoAlbum = new ArrayList<>();
        photoAlbum.add(new ProxyImage("HiRes_10MB_Photo1", "Kissa kuva"));
        photoAlbum.add(new ProxyImage("HiRes_10MB_Photo2", "Koira kuva"));

        // Print photo album contents
        for (Image img : photoAlbum) {
            img.showData();
        }

        // Browse the photo album
        for (Image img : photoAlbum) {
            img.displayImage();
        }
        for (Image img : photoAlbum) {
            img.showData();
        }
        // Browse the photo album again
        for (Image img : photoAlbum) {
            img.displayImage();
        }
    }
}
