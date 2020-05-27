package game;

public class Overseer {
	
	String numQues = "";
	boolean berror = false;
	boolean bexit = false;
	int numQuest = 0;
	int maxv, minv;
	int nWrong = 0;
	int nCorrect = 0;
	Window w = new Window();
	
	public Overseer()
    {
        w.msg("Hello welcome to your quick maths game!");
        
        do 
        {
        	numQues = w.input("How many questions would you like to answer?");
        	berror = false;
        	try
        	{
        		numQuest = getUserInput();
        		if (bexit) System.exit(0);
        	}
        	catch(NumberFormatException e)
        	{
        		berror = true;
        	}
        }
        while(berror);
        
        for ( int i = 1; i <= numQuest; i++)
        {
        	maxv = (int)(Math.random() * 10);
        	minv = (int)(Math.random() * 10);
        	
        	if (minv > maxv)
        		swap();
        	
        	String sHeader = "Question " + i + " of " + numQuest +"\n";
        	
        	String sQuestion = "";
        	if ( i % 2 == 0 )
        	{
        		sQuestion = "How much is " + maxv + " + " + minv;
        	}
        	else
        	{
        		sQuestion = "How much is " + maxv + " - " + minv;
        	}
        	
        	int nResult = 0;
        	do 
            {
        		numQues = w.input(sHeader + sQuestion);
            	berror = false;
            	try
            	{
            		nResult = getUserInput();
            		if (bexit) System.exit(0);
            	}
            	catch(NumberFormatException e)
            	{
            		berror = true;
            	}
            }
            while(berror);
        	
        	if ( i % 2 == 0 )
        		if ( nResult == maxv + minv )
        			Result(true, nResult);
        		else
        			Result(false, (maxv + minv));
        	else
        		if ( nResult == maxv - minv )
        			Result(true, (maxv - minv));
        		else
        			Result(false, (maxv - minv));
        }
        w.msg("You got " + nCorrect + " correct and " + nWrong
        		+ " wrong out of " + numQuest 
        		+ "\nWith a precent average of: " + nCorrect * 100 / numQuest
        		+ "%");
        
    }
	
	private void Result(boolean bcorrect, int answer)
	{
		if ( bcorrect )
		{
			nCorrect++;
			w.msg("Your answer was corret!");
		}
		else
		{
			nWrong++;
			w.msg("Your answer was wrong! The correct answer is: " 
					+ answer);
		}
	}
	
	private void swap()
	{
		int temp = maxv;
		maxv = minv;
		minv = temp;
		
	}
	
	public int getUserInput () {
		if(numQues.equals("exit")) {
			bexit = true;
			return 0;
		}
		else
		{
			return Integer.parseInt(numQues);
		}
	}
	
	

}
