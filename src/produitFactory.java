public class produitFactory {
    public static final int TYPE_PRODUITA1=1;
    public static final int TYPE_PRODUITA2=2;
    public static final int TYPE_PRODUITA3=3;


    public  ProduitA getProduitA(int typeProduit){
        ProduitA produitA=null;
        switch (typeProduit){
            case TYPE_PRODUITA1:
                produitA = new ProduitA1();
                break;
            case TYPE_PRODUITA2:
                produitA = new ProduitA2();
                break;
            case TYPE_PRODUITA3:TYPE:
              produitA = new ProduitA3();
                break;
            default:
                throw new IllegalArgumentException("type de produit inconnu ");
        }
        return produitA;
    }
}
