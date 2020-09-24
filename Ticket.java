//Charlie Cohen
//Programming Review 2 - Objects (File 2/5)

public abstract class Ticket {

    private int number;
    private int price;

    public Ticket(int number, int price) {
        this.number = number;
        this.price = price;
    }

    public int getPrice() {
        return this.price;
    }

    public int getNumber() { return this.number; }

    public void setPrice(int p) {
        this.price = p;
    }


    public String toString() {
        return ("Number: " + this.number + ", Price: " + this.price);
    }

}