public class StringManipulation {
    
    public static String trimAndConcat(String str1, String str2) { //Note how we have specify that it was a string for trimAndconcat method
        return(str1.trim() + str2.trim());
    }
    
    
    public static void main(String[] args) {
        System.out.println("MY CODE IS RUNNING WOOHOO");
        System.out.println(trimAndConcat("  Hello       ", "    World       ")); //calling the function and then printing
    }
}