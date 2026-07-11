public class TimeSpaceComplexity {

    public static void main(String[] args) {

        int n = 10;

        // O(1)
        int a = 10;
        System.out.println(a);

        // O(n)
        for(int i = 1; i <= n; i++){
            System.out.println(i);
        }

        // O(n²)
        for(int i = 1; i <= n; i++){
            for(int j = 1; j <= n; j++){
                System.out.println(i + " " + j);
            }
        }

        // O(log n)
        while(n > 1){
            n = n / 2;
        }

    }
}