package interfacesAbstracts;



 class SuperClass {
	void func()
	{
		System.out.println("Hello I am a motorcycle, I am a cycle with an engine.");
	}

}
class SubClass extends SuperClass
{
    void func()
    {
    	super.func();
    	System.out.println("My ancestor is a cycle who is a vehicle with pedals.");
    }
}
class Vehicle
{
	public static void main(String args[])
	{
		SubClass s=new SubClass();
		s.func();
	}
}
