package CODSOFT;
import java.util.Scanner;
class RNG{
    public static void main(String []args){
        
        Scanner sc= new Scanner(System.in);
        int attempt=0;
        int randomNum = 1+(int)(Math.random()*100);//random number 

       while(true){

        if(attempt==5){
            System.out.println("Attempt limit exceeded --5 times...");
            break;
        }

        System.out.print("Enter your number :");
        int choice = sc.nextInt();
        
        if(randomNum == choice){
            System.out.println(" you guessed the correct number !");
            break;
        }
        else if(choice>randomNum){
            System.out.println("Guessed Number is to high ....");
        }
        else if(choice<randomNum){
            System.out.println("Guessed number is lesser than actual number ...");
        }

         attempt++;

       }
    }

}