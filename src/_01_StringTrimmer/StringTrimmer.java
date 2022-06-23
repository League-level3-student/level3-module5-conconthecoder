package _01_StringTrimmer;

public class StringTrimmer {

    /*
     * This method removes the specified number of characters from the right
     * side of the specified string and returns the trimmed string. 
     */
    static public String trimString(String str, int removesLeft) {
        // 1. If there are no removes left
            if (removesLeft ==0) {
            	return str;
            }
            // 2. Return the string
            char[] dog = str.toCharArray();
            char[] doggie = new char[dog.length-1];
            for (int i = 0; i < doggie.length; i++) {
            	doggie[i] = dog[i];
            }
            str = String.valueOf(doggie);
            return trimString(str, removesLeft-1);
        // 3. Else you need to remove the last letter from the string,
        //    reduce removesLeft by 1, and then call trimString() 

        //return null;
    }
}
