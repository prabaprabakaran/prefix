import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;


public class prefix {

	
	public static void main(String[] args) {

		String[] string1 = {"praba","prabakar","kumar","Bala"};
		
		Arrays.sort(string1);
		ArrayList num = new ArrayList();

		for(int i=1;i<string1.length;i++)
		{
			int counter = 0;
			String str1 = string1[i-1];
			String str2 = string1[i];
			for(int j=0;(j<str1.length())&&(j<str2.length());j++)
			{
				if(str1.charAt(j)==str2.charAt(j))
				{
					counter++;
				}
				
			}

	}
int[] arrayInt = new int[num.size()];
		
		for(int i=0;i<num.size();i++)
		{
			arrayInt[i]=((Integer) num.get(i)).intValue();
		}
		
		int maxCountIndex = num.indexOf(Collections.max(num));
		
		System.out.println("Maximum prefix value = "+string1[maxCountIndex].substring(0, arrayInt[maxCountIndex]));


	}}
