public class arrayPerulangan_3 { //bagian class
    public static void main(String args[]){ //method main
        String[] siswa = {"Reinan", "Odena", "Geanno"}; //panjang array 3
        for (int i=0; i < siswa.length; i++){
            System.out.println("Indeks ke " + i + " = " + siswa[i]);
        }
    }
}
//Penjelasan\\
/*
i=0; 0<3 -> T; print "Indeks ke " + 0 + " = " + siswa[0] ==================>Indeks ke 0 = Reinan
i++; i=0+1=1; 1<3 -> T; print "Indeks ke " + 1 + " = " + siswa[1] =========>Indeks ke 1 = Odena
i++; i=1+1=2; 2<3 -> T; print "Indeks ke " + 2 + " = " + siswa[2] =========>Indeks ke 2 = Geanno
i++; i=2+1=3; 3<3 -> F; keluar dari perulangan
*/