public class StringOps {
    ////////////////////////////////////////////////////////////
    //////                                               ///////
    //////              Reminder:                        ///////
    //////        allowed methods                        ///////
    //////                                               ///////
    //////        1.charAt(int index)                    ///////
    //////        2.length()                             ///////
    //////        3.substring(int start)                 ///////
    //////        4.substring(int start,int ends)        ///////
    //////        5.indexOf(String str)                  ///////
    //////                                               ///////
    //////        The rest are not allowed !             ///////
    //////        if you want to use a different         ///////
    //////        method, and you can implement          ///////
    //////        it using material from the course      ///////
    //////        you need to implement a version of     ///////
    //////        the function by yourself.              ///////
    //////                                               ///////
    //////        see example for substring              ///////
    //////        in Recitation 3 question 5             ///////
    //////                                               ///////
    ////////////////////////////////////////////////////////////
    public static void main(String[] args) {
        
    }

    public static String capVowelsLowRest (String string) {
        String new_String = "";
        for (int i = 0; i < string.length(); i++) {
            if("aeiouAEIOU".indexOf(string.charAt(i)) != -1 ){
                new_String += (char)(string.charAt(i) - 32);
            } else {
                new_String += (string.charAt(i));
            }
        }
        return new_String;
    }

    public static String camelCase (String string) {
        String result = "";
        boolean capitalizeNext = false;

        for (int i = 0; i < string.length(); i++) {
            char ch = string.charAt(i);

            if (ch == ' '){
                capitalizeNext = true;
            } else {
                if (capitalizeNext){
                    if(ch >= 'a' && ch <= 'z'){
                        result += (char)(ch - 'a' + 'A');
                    } else {
                        result += ch;
                    }
                capitalizeNext = false;
                } else {
                    if ( ch >= 'A' && ch <= 'Z'){
                        result += (char)(ch - 'A' + 'a');
                    } else {
                        result += ch;
                    }
                }
            } 
        }
        return result;
    }

    public static int[] allIndexOf (String string, char chr) {
        int count = 0;
        for (int i = 0; i < string.length(); i++) {
            if(chr == string.charAt(i)){
               count++;
            }
        }
        int [] index_Arr = new int [count];
        int index = 0;
        for (int i = 0; i < string.length(); i++) {
            if (string.charAt(i) == chr) {
                index_Arr[index] = i;
                index++;
            }
        }
        return index_Arr;
    }
}
