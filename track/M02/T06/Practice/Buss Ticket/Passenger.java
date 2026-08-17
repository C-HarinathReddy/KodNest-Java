
class Passenger {

    public static void main(String[] args) {
        Conductor c = new Conductor();

        Money m = new Money();

        c.collect(m);

        Ticket t = c.give();

        System.out.println(t);

        if (t != null) {
            System.out.println("Ticket collected");
        }
    }
}
