package Inheritance;


import org.w3c.dom.ls.LSOutput;

class anuj{
    int num=5;
    void dispay(){
        System.out.println("this is parent class");
    }
}
public class superrr extends anuj{
    int num=1011;
    void display(){
        System.out.println("this is child");
    }

    void hanji(){
        superrr r = new superrr();
        r.display();
        super.dispay();
        System.out.println(super.num);
        System.out.println(r.num);
    }

    public static void main(String[] args) {
         superrr x=new superrr();
         x.hanji();
    }

}
