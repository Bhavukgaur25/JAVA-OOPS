package bhavuk.properties.abstractt;

public class SON extends PARENT{
    public SON(String name, int age) {
        this.name = name;
        this.age = age;
    }

    String name;
    int age;
    @Override
    void career(String name){
        System.out.println("Engineering");
    }
    @Override
    void partner(String name , int age){
        System.out.println("radhe radhe");
    }
}
