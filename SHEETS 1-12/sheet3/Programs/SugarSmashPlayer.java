class SugarSmashPlayer
{
   int ID;
   String screenName;
    protected int[] scores = new int[10];
   void setId(int num)
   {
      ID = num;
   }
   void setName(String player)
   {
      screenName = player;
   }
   void setScore(int score, int level)
   {

      if (level == 0)
        { scores[level] = score;}
      else
      {
         if (scores[level - 1] >= 100 && level < scores.length)
            {scores[level] = score;}
         else
         {
            System.out.println("Invalid score");
         }
      }
   }
   int getId()
   {
      return ID;
   }
   String getName(){
      return screenName;
   }
   int getScore(int level)
   {
      if (level >= scores.length)
      {
         System.out.println("Invalid game level");
         return 0;
      }
      else{
         return scores[level];
          
      }

   }
}