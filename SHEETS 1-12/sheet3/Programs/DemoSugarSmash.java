public class DemoSugarSmash
{
   public static void main(String[] args)
   {
      SugarSmashPlayer ss = new SugarSmashPlayer();
      PremiumSugarSmashPlayer ps = new PremiumSugarSmashPlayer();
      ss.setName("Jhon");
      ss.setId(1519);
      int a= 100;
      for(int i = 0;i<10;i++){
            ss.setScore(a,i);
            a=a+100;
      }
      String name = ss.getName();
      int n = ss.getId();
      System.out.print(name + " of player Id " + n + " Scores are ");
      int o;
      for(int j=0;j<10;j++){
          o=ss.getScore(j);
      System.out.print(o + " ");
          
      }
      System.out.println();
      ps.setId(9562);
      ps.setName("Vicky");
      int b= 100;
      for(int k = 0;k<50;k++){
            ps.setScore(b,k);
            b=b+100;
      }
      name = ps.getName();
      n=ps.getId();
      System.out.print(name + " of player Id " + n + " Score at 17th level is  ");
      System.out.print(ps.getScore(16));


   }
}