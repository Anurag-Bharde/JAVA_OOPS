package ThisKeyword;

public class exampleone {
    int twos;
    String str;

    exampleone(int x){
        this.twos=x;
    }

    public int gettr(){
        return twos;
    }
    public void settr(int twos){
        this.twos=twos;
    }
    public static void main(String[] args) {
        int r=9;
        exampleone tr=new exampleone(r);
        System.out.println(tr.twos);

     tr.settr(56);
        System.out.println(tr.twos);
    }
}
