public class Pyramid {
    public static void main(String[] args) {
        System.out.println("pyramid increment");
        int n = 6;
        for (int i = 0 ; i <= n; i++){
            for (int j = 0 ; j<=i; j++){
                System.out.print("*");
            }
            System.out.println();
        }
        System.out.println();

        System.out.println("pyramid decrement");
        int temp = 6;
        for (int a=1 ; a<temp; a++){
            for (int b=temp; b>=a ; b--){
                System.out.print("*");
            }

            System.out.println();
        }
    }
}
