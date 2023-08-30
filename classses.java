

abstract class car{
    protected void asdo(){
        System.out.println("all is well");
    }

    static void car(){
        System.out.println("System2.0");
    }

    abstract void go();
    abstract void man();
}
 class red extends car {
    void go() {
        System.out.println("go classes");
    }

    void man(){
        System.out.println("mann class");
    }
}
class anna extends red{
    void all(){
        System.out.println("all");
        super.asdo();
        super.go();
    }
}
class getst{
    private int num;
    public int get(){
        return num;
    }
    public void set(int num){
        this.num=num;
    }
}
abstract class toing{
    public toing(){
        System.out.println("toing");
    }
}
class herona extends toing{
    void toing(){
        System.out.println("herona toing");
    }
}
class classses implements Cloneable {

        int r=1;

        public Object clone() throws CloneNotSupportedException{
            return super.clone();
        }
    public static void main(String[] args) throws CloneNotSupportedException {
//        System.out.println("system");
//         anna we=new anna();
//         we.all();
//         we.man();
//     getst tr=new getst();
//     tr.set(34);
//        System.out.println(tr.get());

        classses hlm=new classses();
        classses ht=(classses) hlm.clone();
    }

}


