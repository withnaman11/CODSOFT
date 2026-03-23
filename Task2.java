
import java.util.Scanner;

 class Task2 {
    

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the marks obtained(out of 100) of all subjects one by one ...");
        System.out.print("English :");
        double eng = sc.nextInt();
        System.out.print("Maths :");
         double math = sc.nextInt();
        System.out.print("Sanskrit :");
         double sans = sc.nextInt();
        System.out.print("Science :");
         double sci = sc.nextInt();
        System.out.print("Social studies :");
         double sst = sc.nextInt();

         double total = eng + math + sans+ sci + sst;

         double percentage = total/5;
        char grade =',';
        if(percentage <100 && percentage>90){
            grade = 'A';
        }
        else if(percentage <90 && percentage>75){
            grade='B';
        }
        else if(percentage < 75 && percentage > 60){
            grade = 'C';
        }
        else if(percentage<60 && percentage>45){
            grade ='D';
        }
        else if(percentage < 45 && percentage >33){
            grade = 'E';
        }
        else if(percentage<33 ){
            grade='F';
        }

        System.out.println("Total marks obtained : "+total+"\nAverage percentage : "+percentage+"\nGrade :"+grade);
    }
}
