//Charlie Cohen
//Programming Review 2 - Objects (File 1/5)

public class Main {

    public static void main(String[] args) {
    	System.out.println("Welcome to the ticket reserve system for the upcoming event");
    	System.out.println("Here are the prices for the different ticket options:");

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

        System.out.println("Walkup ticket price: $" + ticket1.getPrice());
        System.out.println("Advance ticket price: $" + ticket2.getPrice());
        System.out.println("Student advance ticket price: $" + ticket5.getPrice());
    }

}
