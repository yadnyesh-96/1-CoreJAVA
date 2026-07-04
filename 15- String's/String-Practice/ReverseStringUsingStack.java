class ReverseStringUsingStack
{
	public static void main(String x[])
	{
		Stack<Character> st = new Stack<>();
		String s = "abcd";
		st.push('a');
		st.push('b');
		st.push('c');
		st.push('d');
		
		for(int i = 0 ; i < s.length() ; i++)
		{
			st.push(st.charAt(s));		
		}
	}
}