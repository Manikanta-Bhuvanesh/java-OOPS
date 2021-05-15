public class BruteForceCeaserCipher extends Thread 
{ 
	public static String m = "gdhrzfnncanx";
	public static String a = "abcdefghijklmnopqrstuvwxyz";	 
	static class Decrypt extends Thread 
	{ 
		int key;
		  Decrypt(int key)
		  {
			  this.key=key;
		   }
		   String l = m.toLowerCase();
           String p = "";
           public synchronized void decrypt(){
               for (int i = 0; i < l.length(); i++)
				{
					int cp = a.indexOf(l.charAt(i));
					int kv = (cp - key) % 26;
					if (kv < 0)
					{
						kv = a.length() + kv;
					}
					char r = a.charAt(kv);
					p += r;
				}
				System.out.println("Message for key "+key+ " is " + p);
           }
		      public void run(){
				   decrypt();
		    }		 
}
	public static void main(String[] args) 
	{ 
		BruteForceCeaserCipher.Decrypt [] c=new BruteForceCeaserCipher.Decrypt[26];	
		for(int k=0;k<26;k++){
		    c[k]=new BruteForceCeaserCipher.Decrypt(k);
		}
		for(int y=0;y<26;y++){
	    c[y].start();
	}
}
		
}