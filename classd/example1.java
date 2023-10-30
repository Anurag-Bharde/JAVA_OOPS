package classd;

class example2 {
   void car(){
       System.out.println("gore ghar ke");
   }
}
public class example1 extends example2{
example1(){
    super();
}
    void car(){
        System.out.println("tike");
    }

    public static void main(String[] args) {
//        static int car=5;
//        System.out.println(car);
       example1 fk=new example1();
       fk.car();
    }
}

