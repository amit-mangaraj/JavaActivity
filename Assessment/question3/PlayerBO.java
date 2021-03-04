package question3;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.lang.*;

public class PlayerBO {
	String a;
	String b;
	List<Player> playerList = new ArrayList<Player>();
	public void findPlayer(List<Player> playerList,String nationality)
	{
		for(Player p:playerList)
		{
			if(p.getNationality().equals(p))
			{
				 a = p.getName();
				 System.out.println(a);
			}
	
		}
	}
	
	public  void findPlayer(List<Player>playerList,Date dateOfBirth)
	{
		for(Player p1:playerList)
		{
			if(p1.getDate1().equals(p1))
			{
				 b = p1.getName();
				 System.out.println(p1);
			}
		}
	}
	
}
