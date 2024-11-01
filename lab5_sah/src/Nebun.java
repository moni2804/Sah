public class Nebun {
    private int pozX;
    private int pozY;
    private TablaSah my_tabla;

    public Nebun(int pozX, int pozY, TablaSah my_tabla) {
        this.pozX = pozX;
        this.pozY = pozY;
        this.my_tabla = my_tabla;
    }

    public void mutare(int i,int j) {
        if(i>=0 && i<8 && j>=0 && j<8) {
            if (this.my_tabla.getElement(i, j).equals(" ")) { //liber
                if (Math.abs(i - this.pozX) == Math.abs(j - this.pozY)) {
                    this.my_tabla.setElement(i, j, "N");
                    this.my_tabla.setElement(this.pozX, this.pozY, " ");
                    this.pozX = i;
                    this.pozY = j;
                } else {
                    System.out.println("Mutare invalida pentru un nebun");
                }
            }
        }
        else {
            System.out.println("Mutare in afara tablei");
        }
    }

}
