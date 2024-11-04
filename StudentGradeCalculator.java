import java.util.*;
class StudentGradeCalculator {
    public static void main(){
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("Enter the out of 100 marks of English ");
            int a=sc.nextInt();
            System.out.println("Enter the out of 100 marks of Hindi ");
            int b=sc.nextInt();
            System.out.println("Enter the out of 100 marks of Maths ");
            int c=sc.nextInt();
            System.out.println("Enter the out of 100 marks of Science ");
            int d=sc.nextInt();
            System.out.println("Enter the out of 100 marks of Social Studies ");
            int e=sc.nextInt();
            int t=a+b+c+d+e;
            float avg=t/5;
            System.out.println("Total Marks = "+ t);
            System.out.println("Average percentage = "+ avg);
            System.out.print("Grade = ");
            if(avg>90&& avg<=100) 
            System.out.println("A+");
            else if(avg>80&& avg<=90) 
            System.out.println("A");
            else if(avg>70&& avg<=80) 
            System.out.println("B+");
            else if(avg>60&& avg<=70) 
            System.out.println("B");
            else if(avg>50&& avg<=60) 
            System.out.println("C");
            else if(avg>40&& avg<=50) 
            System.out.println("D");
            else if(avg<=40)
            System.out.println("F");
            else 
            System.out.println("Invalid ");
        }
    }
}
