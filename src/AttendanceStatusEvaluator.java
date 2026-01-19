import java.uti.*;
class AttendanceStatusEvaluator{
  public static void main(String a[]){
    Scanner sc =new Scanner(System.in);
    int attendance=sc.nextInt();
    if(attendance>85){
      System.out.println("Excellent");
    }
    else if(attendance>=60 || attendance<=80){
       System.out.println("Satisfactory");
    }
    else if(attendance<60){
       System.out.println("Poor");
    }
  }
}
