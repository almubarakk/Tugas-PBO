/* 13020220049, Mushab Al Mubarak, Jum'at/23-02-2024, 22.40 */

/* pemakaian beberapa operator terhadap RELATIONAL DAN bit */ 
public class Tugas13 { 
    public static void main(String[] args) { 
    // TODO Auto-generated method stub 
    /* KAMUS */ 
    char i, j; 
    /* ALGORITMA */ 
    i = 3;          /* 00000011 dalam biner */ 
    j = 4;          /* 00000100 dalam biner */ 
    System.out.println("i = "+ (int) i); 
    System.out.println("j = "+ j); 
    System.out.println("i & j = "+ (i & j));  
    /* 0: 00000000 dalam biner */ 
    System.out.println("i | j = "+ (i | j));  
    /* 7: 00000111 biner */ 
    System.out.println("i ^ j = "+ (i ^ j));  
    /* 7: 00000111 biner Ingat!!! operator "^" pada bahasa 
    java bukan sebagai pangkat*/ 
    System.out.println(Math.pow(i, j));  
    /* Class Math memiliki method pow(a,b) untuk 
    pemangkatan*/ 
    System.out.println("~i = "+ ~i);  
    /* -4: 11111100 biner */ 
    } 
    }