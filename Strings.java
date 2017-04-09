public class Strings {
	public static void main(String[] args) {
		System.out.println("The scruffy dog said");

		String surprise = "surprise";
		System.out.println(surprise.toUpperCase());
		System.out.println(surprise.toLowerCase());

		String trimThis = "   Trim This   ";
		System.out.println("String " + trimThis.trim());

		String phrase = "I love to program";
		String subString = phrase.substring(0, 6);
		String newPhrase = phrase.replace("program", "built shit");
		System.out.println(subString);
		System.out.println(newPhrase);

		if(subString.equals("I love")){
			System.out.println("love is in the air");
		}else if (subString.equalsIgnoreCase("I LOVE")){
			System.out.println("non case sensitive love is in the air");
		}
	}
}