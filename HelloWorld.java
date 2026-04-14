public class HelloWorld {
    public static void main(String[] args) {
        System.out.println("Hello World");
        int sum = add(5, 3);
        System.out.println("5 + 3 = " + sum);
    }

    public static int add(int a, int b) {
        return a + b;
    }
}