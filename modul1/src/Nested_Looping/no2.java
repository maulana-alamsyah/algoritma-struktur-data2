package Nested_Looping; //deklarasi package
public class no2 { //bagian class
    public static void main(String[] args){ //method main
        int x,y;
        
        for(x=0; x<=4;x++){
            for(y=0;y<x;y++){
                System.out.print(y);
            }
            System.out.println();
        }
    }
}



//Penjelasan\\
/*
x=0; 0<=4; T; lanjut ke perulangan dalam
y=0; 0<0; F; keluar dari perulangan dalam
println()
x++; x=0+1=1; 1<=4; T; lanjut ke perulangan dalam
y=0; 0<1; T; print 0 ===========================================================> 0
y++; y=0+1=1; 1<1; F keluar dari perulangan dalam
println()
x++; x=1+1=2; 2<=4; T; lanjut ke perulangan dalam
y=0; 0<2; T; print 0 ===========================================================>0
y++; y=0+1=1; 1<2; T; print 1 ==================================================>01
y++; y=1+1=2; 2<2; F; keluar dari perulangan dalam
println()
x++; x=2+1=3; 3<=4; T; lanjut ke perulangan dalam
y=0; 0<3; T; print 0 ===========================================================>0
y++; y=0+1=1; 1<3; T; print 1 ==================================================>01
y++; y=1+1=2; 2<3; T; print 2 ==================================================>012
y++; y=2+1=3; 3<3; F; keluar dari perulangan dalam
println()
x++; x=3+1=4; 4<=4; T; lanjut ke perulangan dalam
y=0; 0<4; T; print 0 ===========================================================>0
y++; y=0+1=1; 1<4; T; print 1 ==================================================>01
y++; y=1+1=2; 2<4; T; print 2 ==================================================>012
y++; y=2+1=3; 3<4; T; print 3 ==================================================>0123
y++; y=3+1=4; 4<4; F; keluar dari perulangan dalam
println()
*/