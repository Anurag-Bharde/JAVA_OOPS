public class Absss  {
    public static void main(String[] args) {
    make tum=new make();
        System.out.println(tum.mika(9,4));
    }
}

abstract class trod{
    void pinoco(int t){
        System.out.println("ok");
    }

    abstract void mika();
}

class make extends trod{
    void mika(){
        mika(4,5);
        System.out.println("helppp");
    }

    int mika(int a,int b){
        return a*b;
    }
}