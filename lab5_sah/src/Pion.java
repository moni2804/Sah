public class Pion {
    private int pozX;
    private int pozY;
    private TablaSah my_tabla;

    public Pion(int pozX, int pozY, TablaSah my_tabla) {
        this.pozX = pozX;
        this.pozY = pozY;
        this.my_tabla = my_tabla;
    }

    public void mutare(int i,int j) {
        if(i>=0 && i<8 && j>=0 && j<8) {
            if (this.my_tabla.getElement(i, j).equals(" ")) { //liber
                if (i - this.pozX == 1 && j == this.pozY) { //inainteaza un rand si ramane pe aceeasi col
                    this.my_tabla.setElement(i, j, "P");
                    this.my_tabla.setElement(this.pozX, this.pozY, " "); //eliberam un a fost pionul
                    this.pozX = i;
                    this.pozY = j; //acctualizam pozitia pionului
                } else {
                    System.out.println("Mutare invalida pentru un pion");
                }
            } else {
                System.out.println("Pozitie ocupata");
            }
        }
        else {
            System.out.println("Mutare in afara tablei");
        }
    }
}
