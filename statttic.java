public class statttic {
    static int r=23;
    public void func(){
     r+=12;
        System.out.println(r);
    }
    public void func2(){

        System.out.println(r);
    }
    public static void main(String[] args) {
        statttic fun1=new statttic();
        fun1.func();
        fun1.func2();
    }
}
