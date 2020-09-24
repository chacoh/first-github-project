//Charlie Cohen
//Programming Review 2 - Objects (File 5/5)

public class StudentAdvanceTicket extends Ticket {

    public StudentAdvanceTicket(int n, int days) {
        super(n, 20);
        if (days >= 10) {
            super.setPrice(15);
        }
    }

    public String toString() {
        return ("Number: " + super.getNumber() + ", Price: " + super.getPrice() + " (Student ID required)");
    }

}
