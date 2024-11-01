public class TablaSah {
    private static final int NR_LNII=8;
    private static final int NR_COL=8;
    private String[][] mat=new String[NR_LNII][NR_COL];

    public TablaSah() {
        for(int i=0;i<NR_LNII;i++){
            for(int j=0;j<NR_COL;j++){
                this.mat[i][j]=" ";
            }
        }
    }
    public String[][] getTablaSah(){return this.mat;}

    public String getElement(int i,int j){return this.mat[i][j];}
    public void setElement(int i,int j,String el){this.mat[i][j]=el;}
    //public String[][] getMat(){return mat;}

    public void afisare(){
        for(int i=0;i<NR_LNII;i++) {
            if (i == 0) System.out.print("   ");
            else System.out.print(i + " ");
        }
        for(int i=0;i<NR_LNII;i++){
            if(i>0) System.out.print(i);
            for(int j=0;j<NR_COL;j++){
                System.out.print(mat[i][j]+" ");
            }
            System.out.println();
        }
    }
}
