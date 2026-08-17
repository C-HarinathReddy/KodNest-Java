
class Conductor {

    void collect(Money m) {
        System.out.println("Money Collected by conductor");
    }

    Ticket give() {
        Ticket t = new Ticket();
        System.out.println("Ticket Issued");
        return t;
    }
}
