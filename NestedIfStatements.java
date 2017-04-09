public class NestedIfStatements{
	public static void main(String[] args){
		String gender = "Male";
		int age = 29;

		if(gender.equalsIgnoreCase("male")){
			if(age > 30){
				System.out.println("You are a male over the age of thrity");
			} else {
				System.out.println("You are a male under the age of thirty");
			} 
		}else {
			if(age > 30) {
				System.out.println("you are a female over the age of thirty");
			}else {
				System.out.println("you are a male over the age of thirty");
			}
		}
	}
}