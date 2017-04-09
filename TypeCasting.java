public class TypeCasting {
	public static void main(String[] args) {
		double dNum = 34.59;
		int iNum = (int) dNum;
		System.out.println(iNum);

		String sNum = "30";
		int newiNum = Integer.parseInt(sNum);
		System.out.println(newiNum);
	}
}