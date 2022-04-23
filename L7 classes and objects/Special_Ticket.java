public class Special_Ticket {
    private int price;
    private int soldTicket = 0;
    private double discount;

    public Special_Ticket(int p, int sold, double d) {
        setPrice(p);
        setSold(sold);
        setDiscount(d);
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
    public void setDiscount(double d) {
        discount = d;
    }
    public double getDiscount() {
        return discount;
    }

    public void sales(int s) {
        soldTicket += s;
    }

    public String toString() {
        return "Special Ticket " + "Sell total amount is " + (getPrice()*getSold()*getDiscount()) + " dollars.";
    }

}
