public class BaseballGame {
	private String team1;
	private String team2;
	private static int totalGamesPlayed = 0;

	public BaseballGame(String teamOne, String teamTwo) {
		team1 = teamOne;
		team2 = teamTwo;
		totalGamesPlayed ++;
	}
	public static void main(String[] args) {
		BaseballGame game1 = new BaseballGame("Static team", "hacking hustlers");
		BaseballGame game2 = new BaseballGame("Fish fryers", "hamping monkeys");

		System.out.println(game1.getTeams());
		System.out.println(game2.getTeams());

		System.out.println(getTotalGamesPlayed());
	}

	public String getTeams(){
		return "playing today are: " + team1 + "vs the" + team2;
	}

	public static int getTotalGamesPlayed(){
		return totalGamesPlayed;
	}
}