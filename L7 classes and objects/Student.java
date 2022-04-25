public class Student {

    private String name;
    private String major;

    public Student(String name, String major){
        setName(name);
        setMajor(major);
    }

    public Student(String name){
        setName(name);
    }

    public String getName(){
        return name;
    }

    public void setName(String name){
        this.name = name;
    }

    public String getMajor(){
        return major;
    }

    public void setMajor(String major){
        this.major = major;
    }

    public String toString(){
        return "Name: " + getName() + ((getMajor() != null) ? "  Major: " + getMajor() : "  No assign");
    }
}
