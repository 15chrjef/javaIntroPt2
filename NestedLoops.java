public class NestedLoops{
	public static void main(String[] args) {
		String[] birds = { "parrot", "eagle", "hawk" };
		String[] snakes = { "rattle", "cobra", "anaconda" };
		String[] largeCats = { "lion", "tiger", "leopard" };

		String[][] zoo = { birds, snakes, largeCats };

		for(int i = 0; i < zoo.length; i++){
			String[] animals = zoo[i];
			int aLength = animals.length;
			for(int j = 0; j < aLength; j++){
				System.out.println(zoo[i][j]);
			}
			System.out.println("---------");
		}	
	}
}