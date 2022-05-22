public class Man{
    private String name;
    private int income;

    public Man(String name, int income){
        setName(name);
        setIncome(income);
    }
    public void setName(String name){this.name = name;}
    public String getName(){return name;}
    public void setIncome(int income){this.income = income;}
    public int getIncome(){return income;}
    public String toString(){return getName();}
}