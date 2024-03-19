public class FibonacciSeries {
    public static void main(String[] args) {
        int n = 5;
        System.out.println("Fibonacci Series up to " + n + " Terms:");
        int firstTerm = 0, secondTerm = 1;
        for (int i = 0; i < n; ++i) {
            System.out.print(firstTerm + " ");
            int nextTerm = firstTerm + secondTerm;
            firstTerm = secondTerm;
            secondTerm = nextTerm;
        }
    }
}


