package Search;

public class LinearSearchWithString {
    public static void main(String[] args) {
        String s = "abcdef";
        System.out.println(linearSearchReturnBoolean(s, 'b'));
    }
    static boolean linearSearchReturnBoolean(String inputString, char searchChar){
        if(inputString.length() == 0)
            return false;
        for (int index = 0; index < inputString.length(); index++) {
            if(inputString.charAt(index) == searchChar)
                return true;
        }
        return false;
    }
}
