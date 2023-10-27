package ThisKeyword;

public class exap2 {
    int ans;
    int tns;
    exap2(){
        this(5,6);
    }
    exap2(int r,int z){
        this.ans=r;
        this.tns=z;
    }

    public static void main(String[] args) {
        exap2 tr=new exap2();
        System.out.println(tr.ans+tr.tns);
    }
}
