package stringbased;

public class CharArrayToString {
	public static void main(String args[])
	{
		char[] chars = {'T', 'e', 'c', 'h', 'i', 'e', ' ',
				'D', 'e', 'l', 'i', 'g', 'h', 't'};

StringBuilder sb = new StringBuilder();
for (char ch: chars) {
	sb.append(ch);
}

String string = sb.toString();
System.out.println(string);

	}

}
