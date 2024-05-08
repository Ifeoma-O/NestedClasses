import java.util.Scanner;

class Applicant{
    String applicantID;
    String education;
    int age;

    Applicant(String id, String edu, int a){
        applicantID = id;
        education = edu;
        age = a;
    }

    void printStatus(){
        Candidate cd = new Candidate();
        cd.displayStatus();
    }

    class Candidate{
        String candidateStatus = "null";
        void setStatus(){
            if (age>25){
                candidateStatus = "Not accepted";
            }
            else{
                candidateStatus =  "Accepted";
            }
        }
        void displayStatus(){
            setStatus();
            System.out.println("Applicant ID: " + applicantID);
            System.out.println("Applicant's qualification: " + education);
            System.out.println("Applicant's application status: " + candidateStatus);
        }
    } 
}


public class App {
    public static void main(String[] args)  {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the applicant's ID");
        String id = input.nextLine();
        System.out.println("Enter the applicant's qualification");
        String edu = input.nextLine();
        System.out.println("Enter the applicant's age");
        int age = input.nextInt();
        
        Applicant ap = new Applicant(id, edu, age);
        ap.printStatus();
    }
}
