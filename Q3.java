import java.util.Scanner;

public class Q3 {
    
    public static void main(String[] args) {
        
        Scanner sc= new Scanner(System.in);

        int sub1= sc.nextInt();
        int sub2= sc.nextInt();
        int sub3= sc.nextInt();

        int totalMarks= sub1+sub2+sub3;

        int percentage= (totalMarks/3);

        System.out.println("Total Marks = "+totalMarks);
        System.out.println("Percentage = "+percentage+"%");

    }
}
