package tugasPraktikum2;
public class no3 {
    public static void main(String[] args){
        int[][] a = {
            {3,3,7},
            {2,8,1}
        };
        int[][] b = {
            {3,8},
            {4,2},
            {5,8}
        };
        int jumlah =0;
        
        if(a[0].length == b.length){
            int[][] c = new int[a.length][b[0].length];
            for(int i=0; i <a.length; i++){
                for(int j=0; j<b[0].length;j++){
                    for(int k=0; k<b.length;k++){
                        jumlah = jumlah + a[i][k] * b[k][j];
                    }
                    c[i][j] = jumlah;
                    jumlah =0;
                }
            }
            for(int i = 0; i < c.length ; i++){
                for(int j =0; j < c[0].length; j++){
                    System.out.print(c[i][j] + "\t");
                }
                System.out.println();
            }
        }
        System.out.println("Maulana Alamsyah");
    }
}
