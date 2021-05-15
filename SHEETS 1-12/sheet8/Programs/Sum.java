import java.lang.*;
import java.util.*;
public class Sum extends Thread{
		public static int n=5;
		public static  int sum;
		public static int[][]a=new int[n][n];
		public static int[]s=new int[n];
    static class ColSum extends Thread{
        int i;
        int sum=0;
        ColSum(int i){
            this.i=i;
        }
        public void run(){
            for(int q=0;q<n;q++){
                sum=sum+a[q][i];
            }
            s[i]=sum;
        }
    }
    static class Tsum extends Thread{
        public void run(){
				int sum1=0;
				for(int m=0;m<n;m++){
					sum1=sum1+s[m];
		}
		sum=sum1;
        }
    }
	public static void main(String[] args) {
	    Random r= new Random();
	    for(int i=0;i<n;i++) {
			for (int j=0;j<n;j++) {
				a[i][j]=r.nextInt(100);
				System.out.print(a[i][j] + " ");
			}
			System.out.println();
		}
		Sum.ColSum [] c=new Sum.ColSum[n];	
		for(int k=0;k<n;k++){
		    c[k]=new Sum.ColSum(k);
		}
		Sum.Tsum t2=new Sum.Tsum();
		
	for(int y=0;y<n;y++){
	    c[y].start();
	}
	t2.start();
	Thread t = Thread.currentThread();
			try{
		    t.sleep(1500);
		}
		catch(Exception e){
		    System.out.println(e);
		}
	System.out.println(sum);
}
}