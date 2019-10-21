public class NestedForExample {
    public static void main(String[] args) {
        int n = 6;
        for (int a = 2; a<=n;a++){

            for (int b=2 ; b<a; b++){
                System.out.print("nilai a : "+a+ ", ");
                System.out.println("nilai b : " +b+ " ");
            }

        }
    }
}
