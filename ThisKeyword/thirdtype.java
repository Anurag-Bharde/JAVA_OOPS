package ThisKeyword;

public class thirdtype {
    int value;
    thirdtype(int n){
        this.value=n;
    }
    void method(){
        int value=26;
        System.out.println(this.value);
        System.out.println(value);
    }

    public static void main(String[] args) {
        thirdtype tr=new thirdtype(5);
        tr.method();
    }
}
