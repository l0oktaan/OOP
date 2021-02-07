package StudentScore;
import StudentScore.*;
import java.util.ArrayList;
import java.util.Scanner;
public class StudentScore {
    public static void main(String[] args) {
        StudentInfo info = new StudentInfo();
        
        info.inputData();
        ArrayList s_name = info.getStudentName();
        ArrayList score = info.getScore();
        CalculateScore cal = new CalculateScore(score);
        
        System.out.println("Name : " + s_name.get(0));
        System.out.println("Max :" + cal.getMax());
        System.out.println("Min :" + cal.getMin());
        System.out.println("Mean :" + cal.getMean());
        System.out.println("SD :" + cal.getSD());
        
    }
}

