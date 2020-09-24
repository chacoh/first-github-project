//Charlie Cohen
//Programming Review 2 - Objects (File 1/5)

public class Main {

    public static void main(String[] args) {
        WalkupTicket ticket1 = new WalkupTicket(1);
        System.out.println(ticket1);

        AdvanceTicket ticket2 = new AdvanceTicket(2, 13);
        System.out.println(ticket2);

        AdvanceTicket ticket3 = new AdvanceTicket(3, 10);
        System.out.println(ticket3);

        AdvanceTicket ticket4 = new AdvanceTicket(4, 9);
        System.out.println(ticket4);

        StudentAdvanceTicket ticket5 = new StudentAdvanceTicket(5, 10);
        System.out.println(ticket5);

        StudentAdvanceTicket ticket6 = new StudentAdvanceTicket(6, 4);
        System.out.println(ticket6);

        System.out.println();

        System.out.println("Ticket 1 price: $" + ticket1.getPrice());
        System.out.println("Ticket 2 price: $" + ticket2.getPrice());
        System.out.println("Ticket 5 price: $" + ticket5.getPrice());
    }

}
