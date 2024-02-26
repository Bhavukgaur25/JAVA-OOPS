package bhavuk.properties.polymorphism;

public class poly {
    int num;
    public poly(int num) {
        this.num = num;
    }
    @Override
    public String toString(){
        return "no is "+num;
    }

    public static void main(String[] args) {
        poly pol = new poly(33);
        System.out.println(pol);
    }

}
