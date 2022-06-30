
public class BookCricketGame {

	  public static int play1_score=0,play2_score=0;
	  public static int x=0,y=0;
	  public static int GenerateRandome()
	  {
	  	int number=(int)(Math.random()*50)+1;
	  	return number;
	  }
	  public static void Player1()
	  {
	   while(true)
	   {
	   int n=GenerateRandome(); 
	   n=n%7;
	   if(n!=0)
	   {
	   	if((n>=1 && n<=6))
	   	{
	   	System.out.println("Player1:"+n);
	    play1_score+=n;
	    x=n;
	    if(x==y)
	    {
	      break;
	    }
	    continue;
	     }
	     continue;
	   } 
	   Player2();
	  }
	 }
	  public static void Player2()
	  {
	   while(true)
	   {
	   int num=GenerateRandome(); 
	   num=num%7;
	   if(num!=0)
	   {
	   	if(num>=1 && num<=6)
	   	{
	   	System.out.println("Player2:"+num);
	    play2_score+=num;
	    y=num;
	    if(y==x)
	    {
	      break;
	    }
	    continue;
	   }
	    continue;
	   } 
	   Player2();
	  }
	 }
	  public static void main(String args[])
	  {
	    Player1();
	    System.out.println("Player1 Score="+play1_score+" Player2 Score="+play2_score);
	    if(play1_score==play2_score)
	    {
	      System.out.println("Game Draw");
	    }
	    if(play1_score>play2_score)
	    {
	    	System.out.println("Player1 is Winner!");
	    } else{
	    System.out.println("Player2 is Winner!");
	     }
	  }
}
