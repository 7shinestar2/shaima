import java.util.Scanner;

/**
 * Created by students on 13/01/22.
 */
public class Management {
    public static void main(String[] args) {
        Student []team =new Student[3];
       /*Student s1=new Student(1,"esraa");
        team[0]=s1;
        Student s2=new Student(1,"reem");
        team[1]=s2;
        Student s3=new Student(1,"somaia");
        team[3]=s3;*/
        Scanner in=new Scanner(System.in);
        System.out.println("enter id and name");
        for (int i = 0; i <team.length ; i++) {
            int id=in.nextInt();
            String name=in.next();
            Student s=new Student(id,name);
            team[i]=s;
        }
        for (int i = 0; i <team.length ; i++) {
            System.out.println(team[i].toString());

        }


    }
}
