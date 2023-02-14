import java.util.Scanner;

class Q1{

    public static void main(String[] args) {
        
        Scanner sc= new Scanner(System.in);

        String Firstname= sc.next();
        String Lastname= sc.next();

        int rollNumber=sc.nextInt();

        String interest=sc.nextLine();

      //  sc.close();

        System.out.println("Name: "+Firstname+" "+Lastname+'\n'+"Roll Number: "+rollNumber+'\n'+"Field of Interest: "+interest);
    }
}

