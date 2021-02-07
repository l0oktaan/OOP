package StudentScore;
import java.util.ArrayList;
import java.util.Scanner;
import java.text.DecimalFormat;
public class StudentInfo {
    // private String [] studentID = new String[50];
    // private String [] studentName = new String[50];
    // private float [] score = new float[50];
    ArrayList studentID = new ArrayList();
    ArrayList studentName = new ArrayList();
    ArrayList score = new ArrayList();
    public void inputData(){       
        
        int i = 0;
        String tmpID, tmpName;
        float tmpScore;
        Scanner readID = new Scanner(System.in);
        Scanner readName = new Scanner(System.in);
        Scanner readScore = new Scanner(System.in);
        while (i < 50) {
            System.out.print("\033[H\033[2J");
            System.out.println("บันทึกข้อมูลลำดับที่ [" + (i+1) + "] กด Q หรือ q เพื่อหยุดการทำงาน");
            System.out.print("ID : ");
            tmpID = readID.nextLine();
            if (tmpID.toUpperCase().equals("Q")){
                break;
            }
            studentID.add(tmpID);
            System.out.print("Name : ");
            tmpName = readName.nextLine();
            studentName.add(tmpName);
            System.out.print("Score : ");
            tmpScore = readScore.nextFloat();
            score.add(tmpScore);
            i++;
        }
        
    }
    public ArrayList getStudentID(){
        return studentID;
    }
    public ArrayList getStudentName(){
        return studentName;
    }
    public ArrayList getScore(){
        return score;
    }
}
