public class Runner {
    public static void main(String[] args) {
        useRecursion(10);
    }
    public static void useRecursion(int n){
        System.out.println(n);
        if (n == 0) {
            System.out.println("Done");
        } else {
            n--;
            useRecursion(n);
        }
    }
}
