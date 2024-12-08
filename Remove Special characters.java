public class RemoveSpecialCharacters{

     public static void main(String []args){
        String s= "*&^%$12gh67kj34cu(*& _";
		//Using regular expression replace all methods
        s= s.replaceAll("[^a-zA-Z0-9]", "");
        System.out.println(s);
     }
}