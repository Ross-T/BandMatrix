public class BandMatrix {

    public static void main(String[] args) {

        int n = Integer.parseInt(args[0]);
        int width = Integer.parseInt(args[1]);

        int i;
        int j;

        for (j = 1; j <= n; j++) {
            for (i = 1; i <= n; i++) {
                if (i <= j + width && i >= j - width) {
                System.out.print("*  "); 
                }
                else {
                    System.out.print("0  ");
                }
            
            }
            System.out.println();
        }  
    }

}