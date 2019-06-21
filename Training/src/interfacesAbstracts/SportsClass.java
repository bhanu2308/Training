package interfacesAbstracts;



class Sports
{
    String getName()
    {
        return "Generic Sports";
    }
    void getNumberOfTeamMembers()
    {
        System.out.println( "Each team has n players in " + getName() );
    }
}  
class Soccer extends Sports
{
  
    String getName()
    {
    	return "Soccer Class";
    }

   void getNumberOfTeamMembers()
   {
	
	System.out.println("Each team has 11 players in "+getName());	
   }
}
public class SportsClass 
	{ 
		public static void main(String args[])
		{
			Soccer c=new Soccer();
			String b=c.getName();
			System.out.println(b);
			c.getNumberOfTeamMembers();
			Sports p=new Sports();
			String a=p.getName();
			System.out.println(a);
			p.getNumberOfTeamMembers();
			
		}
		
	}
