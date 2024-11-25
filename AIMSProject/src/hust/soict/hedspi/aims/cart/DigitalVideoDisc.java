package hust.soict.hedspi.aims.disc.DigitalVideoDisc;

public class DigitalVideoDisc {
    // khai báo thuộc tính
    private String title;
    private String category;
    private String director;
    private int length;
    private float cost;
    private int id; // Instance attribute ID
    private static int nbDigitalVideoDiscs = 0; //  khai bao Class attribute 
    
     // constructor by title
    public DigitalVideoDisc(String title) {
          super();
        this.title = title;
        this.id = ++nbDigitalVideoDiscs; // Update class variable and assign id
    }
     // constructor by title,category,cost
    public DigitalVideoDisc(String title, String category, float cost) {
        this.title = title;
        this.category = category;
        this.cost = cost;
        this.id = ++nbDigitalVideoDiscs;
    }
    // constructor by title, category,director,cost
    public DigitalVideoDisc(String title, String category, String director, float cost) {
        this.title = title;
        this.category = category;
        this.director = director;
        this.cost = cost;
        this.id = ++nbDigitalVideoDiscs;
    }
     
    // constructor by all attributes

    public DigitalVideoDisc(String title, String category, String director, int length, float cost) {
        this.title = title;
        this.category = category;
        this.director = director;
        this.length = length;
        this.cost = cost;
        this.id = ++nbDigitalVideoDiscs;
    }
    
    
     
     // getter and setter

    
    public String getTitle() {
        return title;
    }

  
    public String getCategory() {
        return category;
    }

    public String getDirector() {
        return director;
    }

    public int getLength() {
        return length;
    }

    public float getCost() {
        return cost;
    }
    
    public int getId() { 
        return id; 
    } // Ham lay id
    
    
    // 
     public void setTitle(String titleSet){ title = titleSet; }
    public void setCategory(String categorySet){ category = categorySet; }
    public void setDirector(String directorSet){ director = directorSet; }
    public void setLength(int lengthSet){ length = lengthSet; }
    public void setCost(float costSet){ cost = costSet; }
}

