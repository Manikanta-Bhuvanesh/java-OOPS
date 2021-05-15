import java.lang.*;
import java.util.*;
public abstract class Sum1 implements Runnable{
		public static int n=5;
		public static  int sum;
		public static int[][]a=new int[n][n];
		public static int[]s=new int[n];
    static class ColSum1 implements Runnable{
        int i;
        int sum=0;
        ColSum1(int i){
            this.i=i;
        }
        public void run(){
            for(int q=0;q<n;q++){
                sum=sum+a[q][i];
            }
            s[i]=sum;
        }
    }
    static class Tsum implements Runnable{
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
		Thread [] t1=new Thread[n];	
		for(int k=0;k<n;k++){
		    t1[k]=new Thread(new Sum1.ColSum1(k));
		}
		Thread t2=new Thread (new Sum1.Tsum());
		
	for(int y=0;y<n;y++){
	    t1[y].start();
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