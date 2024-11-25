package hust.soict.hedspi.aims.store.Store;

import hust.soict.hedspi.aims.disc.DigitalVideoDisc.DigitalVideoDisc;
import java.util.LinkedList;

public class Store {
    private final LinkedList<DigitalVideoDisc> itemsInStore = new LinkedList<>();


    private boolean checkDVD(DigitalVideoDisc disc) {
        for (DigitalVideoDisc digitalVideoDisc : itemsInStore) {
            if (digitalVideoDisc.equals(disc)) {
                return true;
            }
        }
        return false;
    }

    public void removeDVD(DigitalVideoDisc disc) {
        if(checkDVD(disc)) {
            itemsInStore.remove(disc);
            System.out.println( disc.getTitle() + " has been deleted from the store !");
        } else {
            System.out.println("There is no "+ disc.getTitle() + " in the store !");
        }
    }

    public void addDVD(DigitalVideoDisc disc) {
        if(!checkDVD(disc)) {
            itemsInStore.add(disc);
            System.out.println( disc.getTitle() + " has been added to the store !");
        } else {
            System.out.println( disc.getTitle() + " 'already exists in the store !");
        }

    }
}
