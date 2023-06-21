package packag;

public class pack {
    int age;
    String name;
    static int population;

    public pack(String name, int age) {
        this.name=name;
        this.age=age;
        pack.population +=1;
    }
}
