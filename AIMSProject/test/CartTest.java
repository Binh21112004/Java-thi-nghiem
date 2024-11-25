package hust.soict.hedspi.test.cart.CartTest;

import hust.soict.hedspi.aims.cart.Cart.Cart;
import hust.soict.hedspi.aims.disc.DigitalVideoDisc.DigitalVideoDisc;

/**
 *
 * @author S o r e n t o
 */
public class CartTest {
     public static void main(String[] args) {
        Cart cart = new Cart();
        DigitalVideoDisc dvd1 = new DigitalVideoDisc("The Lion King","Animation",
                "Roger Allers",87,19.95f);
        cart.addDigitalVideoDisc(dvd1);
        DigitalVideoDisc dvd2 = new DigitalVideoDisc("Star wars","Science Fiction",
                "Geogre Lucas",87,24.95f);
        cart.addDigitalVideoDisc(dvd2);
        DigitalVideoDisc dvd3 = new DigitalVideoDisc("Aladin","Animation",18.99f);
        cart.addDigitalVideoDisc(dvd3);



        //Test search by ID method
        cart.searchById(3);
        cart.searchById(4);

        //Test search by Title method
        cart.searchByTitle("The Lion King");
        cart.searchByTitle("Ronaldo");
    }
}
