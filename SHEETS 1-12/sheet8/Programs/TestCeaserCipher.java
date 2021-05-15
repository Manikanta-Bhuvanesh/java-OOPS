import java.util.Scanner;
class TestCeaserCipher 
{ 
	public static String a = "abcdefghijklmnopqrstuvwxyz";
	public static String mEncryption(String p, int key) 
	{ 
		p = p.toLowerCase();
        String c = "";
        for (int i = 0; i < p.length(); i++)
        {
            int cp = a.indexOf(p.charAt(i));
            int kv = (key + cp) % 26;
            char rv = a.charAt(kv);
            c += rv;
        }
        return c; 
	} 
	public static String mDecryption(String c, int key) 
	{ 
		c = c.toLowerCase();
        String p = "";
        for (int i = 0; i < c.length(); i++)
        {
            int cp = a.indexOf(c.charAt(i));
            int kv = (cp - key) % 26;
            if (kv < 0)
            {
                kv = a.length() + kv;
            }
            char rv = a.charAt(kv);
            p += rv;
        }
        return p; 
	} 	
	public static void main(String[] args) 
	{ 
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Message to encrypt");
		String m =sc.nextLine(); 
		System.out.println("Enter the Key for encryption");
		int key = sc.nextInt(); 
		String c=mEncryption(m, key);
		System.out.println("Encrypted message " + c); 
		System.out.println("Deprecated message " + mDecryption(c, key));
	} 
}