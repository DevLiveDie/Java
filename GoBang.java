import java.io.*;


public class GoBang
{
	private static int BORD_SIZE = 15;

	private String[][] bord;

	public void initBord()
	{
		bord = new String[BORD_SIZE][BORD_SIZE];
		for (int i = 0; i < BORD_SIZE; i++) 
		{
			for (int j = 0; j < BORD_SIZE; j++) 
			{
				bord[i][j] = "＋";		
			}	
		}
	}

	public void printBord()
	{
		for (int i = 0; i < BORD_SIZE; i++) 
		{
			for (int j = 0; j < BORD_SIZE; j++) 
			{
				System.out.print(bord[i][j]);		
			}
			System.out.print("\n");
		}
	}


	public static void main(String[] args) {
		GoBang gb = new GoBang();
		gb.initBord();
		gb.printBord();

		BufferedReader br = new BufferedReader(new 	InputStreamReader(System.in));
		String inputStr = null;
		try
		{
			while((inputStr = br.readLine()) != null)
			{
				String[] posArr = inputStr.split(",");
				int xPos = Integer.parseInt(posArr[0]);
				int yPos = Integer.parseInt(posArr[1]);
				gb.bord[xPos-1][yPos-1] = "○";
				gb.printBord();
				System.out.println("Put your Go with pattern x,y ");
			}
		}
		catch(IOException e)
		{
			e.printStackTrace();
		}
	}
}