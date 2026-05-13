package StringPractise;

//WAP in java using String builder to convert tomorrow to t@m@@rr@@@w

public class StringBuilderProgram {

	public static void main(String[] args) {
		
		String word = "tomorrow";
		
		StringBuilder sb = new StringBuilder();
		
		int count = 1;
		
		for(char ch : word.toCharArray())
		{
			if(ch == 'o')
			{
				for(int i=0; i<count; i++)//i=0,0<1//0<2//0<3
				{
					sb.append("@");
					//@//@@//@@@
				}
				count++;//1++=2//2++=3
			}
		
			else
			{
				sb.append(ch);
			}
			
		}
		
		System.out.println(sb.toString());

	}

}
