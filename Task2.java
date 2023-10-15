import java.util.Scanner;
class Grade{
    public String grade(int avg)
	{
       switch(avg/10)
	   {
        case 10:
        return "A+";
         case 9:
        return "A";
         case 8:
        return "B+";
         case 7:
        return "B";
         case 6:
        return "C";
         case 5:
        return "D";
        default:
         return "F";
      
       }
    }
}

public class Task2
{
public static void main(String ar[])
{
Grade gr=new Grade();
Scanner s=new Scanner(System.in );

System.out.println("Enter the amount of subject");
int sub=s.nextInt();
int marks=0;

for(int i=0;i<sub;i++)
{
System.out.println("Enter the marks obtained in subject" +(i+1));
int mark=s.nextInt();
marks+=mark;
}
  
int avg=marks/sub;
String Grade=gr.grade(avg);

System.out.println("Total marks obtained:"+ marks);
System.out.println("Average marks obtained.:"+avg+"%");
System.out.println("Grade obtained:"+Grade);

s.close();
  }   }
