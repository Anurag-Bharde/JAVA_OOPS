package Inheritance;

 class pent {

    public void ok1(int x){

        System.out.println("parent 1"+x);
    }

}
 public class parent extends pent{
    public void  ok2(String c){
         System.out.println("child 1"+ c);
     }

     public static void main(String[] args) {
         parent gh=(parent)new pent();
         gh.ok2("hel");
         gh.ok1(5);
     }
}
