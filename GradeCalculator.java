import java.util.ArrayList;
import java.util.Scanner;


class GradeCalculator{
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        ArrayList<Float> marks = new ArrayList<>();
        float sum=0;
        float average=0.0f;
        String grade;

        System.out.println("Enter the Total Number of Subjects : ");
        int Total_Subjects = sc.nextInt();

        for(int i=0;i<Total_Subjects;i++){
            System.out.println("Enter the mark of Subject"+(i+1));
            float a = sc.nextFloat();
            marks.add(a);
        }

        for(float x:marks){
            sum+=x;

        }

        System.out.println("Total Marks: "+sum);

        average=sum/Total_Subjects;
        String roundedValue = String.format("%.2f", average);

        System.out.println("Average :"+roundedValue);

        if(average>90){
            grade="O";
        }
        else if (average>80 && average<90) {
            grade="A+";
        }
        else if (average>70 && average<80) {
            grade="A";
        }
        else if (average>60 && average<70) {
            grade="B";
        }
        else if (average>50 && average<60) {
            grade="C";
        }
        else if (average>40 && average<50) {
            grade="D";
        }
        else{
            grade="Fail";
        }

        System.out.println("Grade :"+grade);



    }
}