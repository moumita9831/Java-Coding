public class Main {
    public static void main(String[] args){
        System.out.println("Hello MOUMITA");

        // Swaping given two variable

        int a = 10;
        int b = 9;

       a = a ^ b;
       b = a ^ b;
       a = a ^ b;

       System.out.println("a = " + a + " b = " + b);

       // given 3rd veriable
       int p = 4;
       int q = 10;

       int temp = p;
       p = q;
       q = temp;

       System.out.println("p = " + p + " q = " + q);

    }
}
