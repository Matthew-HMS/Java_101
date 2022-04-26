public class EXE2019_9 {

    private String name;
    private String address;
    private int [] grades;
    public EXE2019_9(String name, String address){
        setName(name);
        setAddress(address);
    }

    public void setName(String name){
        this.name = name;
    }

    public void setAddress(String address){
        this.address = address;
    }

    public void setGrades(int [] grades){
        int counter = 0;
        for(int value : grades){
            if(value < 0 || value > 100){
                counter++;
            }
        }
        if(counter != 0){
            System.out.println("Invalid grade");
            System.exit(0);
        }
        else{
            this.grades = grades;
        }
        
    }

    public String getName(){
        return name;
    }

    public String getAddress(){
        return address;
    }

    public int [] getGrades(){
        return grades;
    }

    public void printAvg(){
        int sum = 0;
        for(int i = 0; i < grades.length; i++){
            sum += grades[i];
        }
        System.out.println("Student name : " + getName() + "\nThe average grade is " + (double)sum/grades.length);
    }
}
