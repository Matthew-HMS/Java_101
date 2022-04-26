public class Test2019_9 {
    public static void main(String [] args){
        EXE2019_9 student = new EXE2019_9("John", "123 Main St.");
        int [] grades = {70,85,885};
        student.setGrades(grades);
        student.printAvg();
    }
}
