package This;

public class Pen {
    private String color;
    private boolean erasable;
    
    public Pen(String c, boolean e) {
        this.color = c;
        this.erasable = e;
    }

    public String getColor() {
        return color;
    }

    public boolean isErasable() {
        return erasable;
    }

       public void setColor(String c) {
            this.color = c;
       }
       
       public void setErasable(boolean e) {
           this.erasable = e;
       }
   
    public String toString() {
        if (erasable) {
            return "Pen is " + color + " and can be erased.";
        } 
        return "Pen is " + color + " and cannot be erased.";
    }
}
