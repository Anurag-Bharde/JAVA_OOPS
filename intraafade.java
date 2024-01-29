import java.util.Scanner;
interface joke{
   void inp();
    void opp();
}
class material implements joke{
    String name;
    public void inp(){
        Scanner sc=new Scanner(System.in);
        name=sc.next();
    }
    public void opp(){
        System.out.println(name);
    }
}

public class intraafade {
    public static void main(String args[]){
        joke fk=new material();
        fk.inp();
        fk.opp();
    }
}
