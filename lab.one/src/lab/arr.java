package lab;

public class arr {
   private  int[] arrg;
   private int summ;
   private int j = 0;
   public arr(int[] arrg){
       this.arrg=arrg;
   }
   public int pFor(){
      summ=0;
      for (int i =0; i<arrg.length;i++){
          summ=summ+arrg[i];
      }
      return summ;
   }
   public int pWhile(){
       j=0;
       summ=0;
       while (j<arrg.length){
           summ=summ+arrg[j];
           j++;
       }
       return summ;

    }
    public int pDoWhile(){
       j=0;
       summ=0;
       do{
           summ=summ+arrg[j];
           j++;
       }while (j<arrg.length);
       return summ;
    }

}