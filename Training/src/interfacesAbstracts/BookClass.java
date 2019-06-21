package interfacesAbstracts;

abstract class Book
{
    String title;
    abstract void setTitle(String s);
    String getTitle()
    {
        return title;
    }
}
class MyBook extends Book
{
	void setTitle(String s)
	{
		title=s;
	}
}

class BookClass {
	public static void main(String args[])
	{
		MyBook book=new MyBook();
		book.setTitle("Bhanu is a good girl");
		String str=book.getTitle();
		System.out.println("The title is:"+str);
			}

}
