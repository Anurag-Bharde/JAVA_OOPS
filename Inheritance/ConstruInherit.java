package Inheritance;

public class ConstruInherit {
   static  class tr{
        tr(){
            System.out.println("yaaho");
        }
    }
   static class mk extends tr{
        mk(){
            System.out.println("choko");
        }
    }

    public static void main(String[] args) {
        mk g=new mk();

    }
}
