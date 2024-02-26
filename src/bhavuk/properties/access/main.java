package bhavuk.properties.access;

public class main {

    public static void main(String[] args) {
        System.out.println();
        A obj = new A(1,"BHAVUK");
        String NAME =  obj.name;
        int no = obj.getNo();
        System.out.println(no);
    }
}
