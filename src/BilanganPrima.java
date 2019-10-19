import java.util.ArrayList;
import java.util.List;

public class BilanganPrima {

    public static List<Integer> getBilanganPrima(int limited){

        List<Integer> list = new ArrayList<Integer>();
        boolean isPrima;

            for (int i =2 ; i<limited; i++){
                isPrima = true;
                for (int j=2; j<i; j++){
                    if ( i%j==0){
                        isPrima=false;
                        break;
                    }
                }

                if (isPrima){
                    list.add(i);
                }

            }

        return list;

    }
    public static void main(String a[]){

        List<Integer> listPrime=BilanganPrima.getBilanganPrima(50);

        for(Integer i:listPrime){
            System.out.print(i+", ");
        }
    }
}
