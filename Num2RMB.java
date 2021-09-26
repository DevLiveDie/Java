import java.util.Arrays;


public class Num2RMB
{
	private String[] zhCurrArr = {"零", "壹", "贰", "叁", "肆", "伍", "陆", "柒", "捌", "玖"};

	private String[] unitArr = {"分", "角", "元", "十", "百", "千", "万", "十", "百", "千", "亿"};

	
	/**
	*@return 
	*/
	private String[] devide(double num)
	{
		long zheng = (long)num;
		long xiao = Math.round((num - zheng) * 100) ;

		return new String[]{zheng + "", xiao == 0 ? "00" : xiao + ""};
	}


	private String toZhStr(double num)
	{
		String numStr = "";
		for (String str : this.devide(num))
		{
			numStr += str;
		}

		int numLen = numStr.length();
		String result = "";
		int unitLen = unitArr.length;

		for (int i = 0; i < numLen; i++) 
		{
			int numTrans = numStr.charAt(i) - 48;
			result += zhCurrArr[numTrans] + unitArr[numLen - i - 1];
		}
		return result;
	}

	public static void main(String[] args) {
		Num2RMB n2r = new Num2RMB();
		System.out.println(Arrays.toString(n2r.devide(778)));
		System.out.println(n2r.toZhStr(1));
	}
}