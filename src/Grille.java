
import java.util.Random;

public class Grille 
{
	public static int tab [][] = new int [4][4];
	private static int score = 0; 
	
	public static int getScore()
	{
		return score ;
	}
	
	 public static int generateRandom()
	 {
		 Random rd = new Random(); // Fonction aléatoire 
		 int result = (rd.nextInt(2)+1)*2;// ?
		 return result; 		 
	 }
	 
	 public static int generateIndices()
	 {
		 Random rd = new Random();
		 int indices =rd.nextInt(4); // C'est un nb entre 0 et 4.
		return indices;
	 }
	 
	 public String toString()
	 {
		 int i, j; 
		 String affiche = "Votre score est de : " + score;
		 
		 for (i=0; i<4; i++)
		 {
			 for(int j=0; j<4; j++)
			 {
				 //? 
			 }
		 }
		return affiche; 
		
		public void aleatoire()
		{
	    	int x, y ;  
			int x = generateIndices();
	    	int y = generateIndices();
	    	
	    	if(tab[x][y] == 0)
	    	{
	    		tab[x][y] = generateRandom();
	    	 }
	    	 else
	    	 {
	    		   x = generateIndices();
	    		   y = generateIndices();
	    		   
	    		   if(tab[x][y] == 0)
	    		   {
	        		   tab[x][y] = generateRandom();
	    		   }
	    		   
	    		   else  x = generateIndices();
	    		   y = generateIndices();
	    		   
	    		   if(tab[x][y] == 0)
	    		   {
	        		   tab[x][y] = generateRandom();
	        	   }
	    		   
	    	   }
	    	
	       }
		
		 
	 }
	 
	 
}