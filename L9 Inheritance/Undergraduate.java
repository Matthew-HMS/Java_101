public class Undergraduate extends Student {
    private boolean honor = false;

    public Undergraduate(String name, String major) {
        super(name, major);
    }
    public void setHonor(boolean honor){this.honor = honor;}
    public boolean getHonor(){return honor;}
    
    public int tuition(){
        return (honor ? 500 : 1000) * getCredits();
    }
    
}
