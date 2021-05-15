class PremiumSugarSmashPlayer extends SugarSmashPlayer
{
   protected int[] scores = new int[50];
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
   int getScore(int level)
   {
      if (level >= scores.length)
      {
         System.out.println("Invalid game level");
         return -1;
      }
      else{
         return scores[level];
          
      }

   }
}