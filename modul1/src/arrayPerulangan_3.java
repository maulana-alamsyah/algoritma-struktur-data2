public class arrayPerulangan_3 { //bagian class
    public static void main(String args[]){ //method main
        String[] siswa = {"Reinan", "Odena", "Geanno"};//panjang array 3 (documentation section
        
        for(int i = 0; i<siswa.length;i++){
            System.out.println("Indeks ke " + i + " adalah " + siswa[i]);
        } 
    }
}
//Penjelasan\\
/*
i=0; 0<3 -> T; print "Indeks ke " + 0 + " adalah " + siswa[0] ==================>Indeks ke 0 adalah Reinan
i++; i=0+1=1; 1<3 -> T; print "Indeks ke " + 1 + " adalah " + siswa[1] =========>Indeks ke 1 adalah Odena
i++; i=1+1=2; 2<3 -> T; print "Indeks ke " + 2 + " adalah " + siswa[2] =========>Indeks ke 2 adalah Geanno
i++; i=2+1=3; 3<3 -> F; keluar dari perulangan
*/