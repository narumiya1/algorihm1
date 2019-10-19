public class Main {
    public static void main(String[] args){
        int i;
        int fibn[] = new int[11];

        //deklarasi nilai awal
        fibn[0]=0;
        fibn[1]=1;

        for(i = 2 ; i<fibn.length;i++){
            fibn[i] = fibn[i-1]+fibn[i-2];
        }

        for(i=0 ; i< fibn.length; i++){
            System.out.print(  fibn[i]+ " ");
        }
    }
}
