package hust.soict.hedspi.aims.Aims;

import hust.soict.hedspi.aims.cart.Cart.Cart;
import hust.soict.hedspi.aims.disc.DigitalVideoDisc.DigitalVideoDisc;
import hust.soict.hedspi.aims.store.Store.Store;
/**
 *
 * @author S o r e n t o
 */
public class Aims {
    public static void main(String[] args) {
        // Create a new cart
        Cart anOrder=new Cart();
        
        // Create new dvd objects and add them to the cart
        DigitalVideoDisc dvd1=new DigitalVideoDisc("The Lion King","Animation", "Roger Allers", 87, 19.95f);
        anOrder.addDigitalVideoDisc(dvd1);
        
        DigitalVideoDisc dvd2=new DigitalVideoDisc("Star Wars","Science Fiction", "George Lucas", 87, 24.95f);
        anOrder.addDigitalVideoDisc(dvd2);
        
        DigitalVideoDisc dvd3=new DigitalVideoDisc("Aladin","Animation", 18.99f);
        anOrder.addDigitalVideoDisc(dvd3);
        
        // print total cost of the items in the cart
        System.out.println("Total cost is: ");
        System.out.println(anOrder.totalCost());
        
       
        anOrder.removeDigitalVideoDisc(dvd1);
        System.out.println("Total cost is: ");
        System.out.println(anOrder.totalCost());
    }
}
