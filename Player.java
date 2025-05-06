public class Player
{
	public static int totalPlayers=0;
	String playerName;

	public static void main(String args[])
	{
		
		Player p1=new Player();
		p1.playerName="Bindu";
		totalPlayers++;
		Player p2=new Player();
		p2.playerName="Chandu";
		totalPlayers++;
		System.out.println("Total Players:"+Player.totalPlayers);
		
	}
}
		