
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
            System.out.println("The disc has been added.");
            return 0;
        }
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
}