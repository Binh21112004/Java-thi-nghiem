package hust.soict.hedspi.test;

import java.util.*;

import hust.soict.hedspi.aims.media.*;

public class polymorphism {
    
    public static void main(String[] args) {
        List<Media> mediae = new ArrayList<Media>();

        DigitalVideoDisc dvd = new DigitalVideoDisc("The Lion King", "Animation", "Roger Allers", 87, 19.95f);
        Book book = new Book("Tam Quoc Dien Nghia", "Novel", 20.00f);


        CompactDisc cd = new CompactDisc("Hay trao cho anh", "Music","Son Tung MTP", 1600.91f);
        Track track1 = new Track("We don't talk anymore", 161);
        Track track2 = new Track("Despacito", 403);
        Track track3 = new Track("Shape of you", 300);

        cd.addTrack(track1);
        cd.addTrack(track2);
        cd.addTrack(track3);

        mediae.add(cd);
        mediae.add(book);
        mediae.add(dvd);    

        for (Media media : mediae) {
            System.out.println(media.toString());
        }
    }
    
}
