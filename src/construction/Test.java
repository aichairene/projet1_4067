package construction;
 public class Test {
 public static void main(String[] args) {
     int som = Arithmetique.getInstance().somme(2, 5, 6);
     System.out.printf("la somme est %d", som);
     Arithmetique s1 = Arithmetique.getInstance(8, 3, 7);
     s1.affiche();
     Arithmetique s2 = Arithmetique.getInstance(7, 4, 1);
     s2.affiche();
     Arithmetique s3 = Arithmetique.getInstance(9, 2, 3);
     s3.affiche();
 }
 }