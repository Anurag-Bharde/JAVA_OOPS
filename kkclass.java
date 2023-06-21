class kkclass {
    public static void main(String[] args) {
      Student stud=new Student();

//      stud.name="aaly";
//      stud.rno=21;
//        System.out.println(stud.name);
//        System.out.println(stud.rno);
        Student rnnn=new Student();
//        System.out.println();

        Student rando=new Student("laal",54);
//        System.out.println(rando.name);


        final A Anu=new A("ANurag");
            Anu.namve="aalu";

        Anu.namve="anda";
        System.out.println(Anu.namve);
  A obj=new A("hello");
        System.out.println(obj);
    }
}
class Student{
    String name;
    int rno;
//   Student() {
//        this.name = "Anurah";
//        this.rno = 777;
//    }
    Student(Student other){
       this.name=other.name;
       this.rno=other.rno;
    }
      Student(){
       this("abe ja n", 13);
      }
        Student(String naam,int roll){
            this.name=naam;
            this.rno=roll;
        }

}

class A{
    final int nam=25;
    String namve;

    public A(String namve) {
        this.namve = namve;
    }
}