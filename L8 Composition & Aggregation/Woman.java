public class Woman {
    private String name;
    private boolean housekeep;

    public Woman(String name,boolean housekeep){
        setName(name);
        setHouse(housekeep);
    }
    public void setName(String name){this.name = name;}
    public String getName(){return name;}
    public void setHouse(boolean housekeep){this.housekeep = housekeep;}
    public boolean getHouse(){return housekeep;}
    public String toString(){return getName();}
}
