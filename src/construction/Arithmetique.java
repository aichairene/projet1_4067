package construction;
 public final class Arithmetique {
 private static Arithmetique instance = null;
 private int x;
private int y;
     private  int z;
private Arithmetique() {
        super();
         }
         private Arithmetique(int x, int y,int z)
{
         this.x=x;
         this.y=y;
         }
         public static Arithmetique getInstance(){
    if (instance == null)
    {
        instance = new Arithmetique();
    }
        return instance;
         }
         public static Arithmetique getInstance(int x, int y,int z){
    if (instance == null){
        instance = new Arithmetique(x, y, z);
    }
    return instance;
         }
         public int somme(int x, int y, int z){
    return x+y;
         }
         public float moyenne(int x, int y, int z){
    return somme(x,y,z)/3;
         }
         public void affiche(){
    System.out.println("\nje suis une instance mes valeurs sont :x =" + this.x + " et y =" + this.y +" et z ="+ this.z);
         }
         @Override
     public Object clone() throws CloneNotSupportedException{
    throw new CloneNotSupportedException();
         }
 }
