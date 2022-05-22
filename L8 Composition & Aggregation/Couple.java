public class Couple {
    private Man m;
    private Woman w;

    public Couple(Man m, Woman w){
        setMan(m);
        setWoman(w);
    }
    public void setMan(Man m){this.m = m;}
    public Man getMan(){return m;}
    public void setWoman(Woman w){this.w = w;}
    public Woman getWoman(){return w;}

    public void changeMan(Man m){
        setMan(m);
    }
    public String toString(){
        return getWoman() + " and " + getMan() + " are now in love";
    }
}
