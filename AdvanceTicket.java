//Charlie Cohen
//Programming Review 2 - Objects (File 4/5)

public class AdvanceTicket extends Ticket {

    public AdvanceTicket(int n, int days) {
        super(n, 40);
        if (days >= 10) {
            super.setPrice(30);
        }
    }


}
