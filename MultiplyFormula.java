public class MultiplyFormula
{
	private int FORMULA_SIZE = 9;

	public void createFormula()
	{
		for (int i = 0; i < FORMULA_SIZE; i++) 
		{
			String printStr = "";
			for (int j = 0; j < FORMULA_SIZE; j++) 
			{
				if( i > j)
				{
					printStr += createExpr(j+1, i+1) + ", ";
				}
				else if (i == j) 
				{
					printStr += createExpr(i+1, j+1);
				}
			}
			System.out.println(printStr);
		}
	}

	public String createExpr(int i, int j)
	{
		return i + " x " + j + " = " + i * j;
	}

	public static void main(String[] args) 
	{
		MultiplyFormula mf = new MultiplyFormula();
		mf.createFormula();
	}
}