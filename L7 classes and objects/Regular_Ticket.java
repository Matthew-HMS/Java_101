public class Regular_Ticket {
    private int price;
    private int soldTicket = 0;

    public Regular_Ticket(int p, int sold) {
        setPrice(p);
        setSold(sold);
    }

    public void setPrice(int p) {
        price = p;
    }
    public int getPrice() {
        return price;
    }
    public void setSold(int sold) {
        soldTicket = sold;
    }
    public int getSold() {
        return soldTicket;
    }

    public void sales(int s) {
        soldTicket += s;
    }

    public String toString() {
        return "Regular Ticket " + "Sell total amount is " + getPrice()*getSold() + " dollars.";
    }

}
