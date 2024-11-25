package hust.soict.hedspi.aims.cart.Cart;

import hust.soict.hedspi.aims.disc.DigitalVideoDisc.DigitalVideoDisc;

public class Cart {
     public static final int MAX_NUMBERS_ORDERED=20;
    private  DigitalVideoDisc itemsOrdered[]=
            new DigitalVideoDisc[MAX_NUMBERS_ORDERED];
    private int qtyOrdered;  
    
    // Function add disc to cart
    public int addDigitalVideoDisc(DigitalVideoDisc disc){
        if(qtyOrdered==MAX_NUMBERS_ORDERED){
            System.out.println("The cart is full. Can't add more disc");
            return 0;
        }
        else{
            itemsOrdered[qtyOrdered]=disc;
            ++qtyOrdered;
            System.out.println("The dvd" + " "  +disc.getTitle() + " " + " has been added.");
            return 0;
        }
    }
    
    // Function thêm đĩa dvd vào giỏ hàng với tham số là 1 mảng
    
    public int addDigitalVideoDisc(DigitalVideoDisc [] dvdList){
        int addcount = 0 ;
        for (DigitalVideoDisc disc : dvdList){
            if(qtyOrdered==MAX_NUMBERS_ORDERED){
                System.out.println("The cart is full. Can't add more disc");
                break;
            }
            else{
                itemsOrdered[qtyOrdered]=disc;
                ++qtyOrdered;
                System.out.println("The disc has been added.");
                addcount++;
            }
        }
        return addcount;
    } 
    
   // function thêm đĩa dvd vào giỏ hàng với số lượng tùy ý (không chạy chung được với hàm 
     /*public int addDigitalVideoDisc(DigitalVideoDisc... dvds){
        int addcount = 0 ;
        for (DigitalVideoDisc disc : dvds){
            if(qtyOrdered==MAX_NUMBERS_ORDERED){
                System.out.println("The cart is full. Can't add more disc");
                break;
            }
            else{
                itemsOrdered[qtyOrdered]=disc;
                ++qtyOrdered;
                System.out.println("The dvd" + " " +disc.getTitle() + " " + " have been added.");
                addcount++;
            }
        }
        return addcount;
    }
    */
    
    //2.2 Qua tai bang cach thay doi tham so
    // Function với đầu vào 2 tham số
     public int addDigitalVideoDisc(DigitalVideoDisc dvd1, DigitalVideoDisc dvd2) {
        if (qtyOrdered + 2 <= MAX_NUMBERS_ORDERED) { // Nếu có đủ chỗ cho 2 DVD
            itemsOrdered[qtyOrdered] = dvd1; // Thêm DVD đầu tiên
            qtyOrdered++;
            itemsOrdered[qtyOrdered] = dvd2; // Thêm DVD thứ hai
            qtyOrdered++;
            System.out.println("Both dvds have been added.");
        } else if (qtyOrdered + 1 <= MAX_NUMBERS_ORDERED) { // Nếu chỉ có đủ chỗ cho 1 DVD
            itemsOrdered[qtyOrdered] = dvd1; // Thêm DVD đầu tiên
            qtyOrdered++;
            System.out.println("Only dvd1" + " " + dvd1.getTitle() + " " + " has been added.");
        } else {
            System.out.println("The cart is full. Can't add more discs.");
            return 0; // Giỏ hàng đầy
        }
        return 1; // Thêm thành công
    }
    // Function xóa đĩa 
    public int removeDigitalVideoDisc(DigitalVideoDisc disc) {
        for (int i = 0; i < qtyOrdered; i++) {
            if (itemsOrdered[i] == disc) { 
                for (int j = i; j < qtyOrdered - 1; j++) {
                    itemsOrdered[j] = itemsOrdered[j + 1];
                }
                itemsOrdered[qtyOrdered - 1] = null; 
                qtyOrdered--; 
                System.out.println("The disc has been removed.");
                return 1; 
            }
        }
        System.out.println("The disc is not found in the cart.");
        return 0; 
    }
    
    // Function sum cost
    public float totalCost(){
        float sum=0.00f;
        for(int i=0;i<qtyOrdered;i++){
            sum+=itemsOrdered[i].getCost();
        }
        return sum;
    }
