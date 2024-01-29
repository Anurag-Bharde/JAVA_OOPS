public class UseStatic {
    static int t=5;
//    UseStatic(int r){
//        System.out.println("hmm");
//    }
    static{
        System.out.println("This is static");
    }

static class hero{
static void print(){
System.out.println("ha bhai");
 }
    }
    class anti{
        void prtin(){
            System.out.println("non static bhai");
        }
    }

    public static void main(String[] args) {
//        UseStatic r=new UseStatic();
//        System.out.println(r);

//        UseStatic.hero all=new UseStatic.hero();
//        all.print();
        hero are=new hero();
        are.print();

        UseStatic.anti ta =new UseStatic().new anti();
        ta.prtin();

    }

}
class atease{
    public static void main(String[] args) {
        UseStatic.hero ans=new UseStatic.hero();
        ans.print();
        
    }
}
