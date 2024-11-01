
public class Main {
    public static void main(String[] args) {
        TablaSah my_tabla = new TablaSah();
        Pion my_pion=new Pion(4,7,my_tabla);
        my_tabla.setElement(4,7,"P");
        my_pion.mutare(5,7);
        my_tabla.afisare();
        System.out.println("------------------");
        my_pion.mutare(5,3);
        my_tabla.afisare();
        System.out.println("------------------");
        my_pion.mutare(1,2);
        my_tabla.afisare();
        System.out.println("------------------");
        my_pion.mutare(8,1);
        my_tabla.afisare();
        System.out.println("Nebun-----------------");

        Nebun my_nebun=new Nebun(4,7,my_tabla);
        my_tabla.setElement(4,7,"N");
        my_tabla.afisare();
        System.out.println("-------------------");
        my_nebun.mutare(5,6);
        my_tabla.afisare();
        System.out.println("-------------------");
        my_nebun.mutare(1,2);
        my_tabla.afisare();
        System.out.println("-------------------");
        my_nebun.mutare(3,2);
        my_tabla.afisare();
        System.out.println("-------------------");

    }
}