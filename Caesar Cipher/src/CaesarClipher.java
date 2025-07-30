public class CaesarClipher {


    public CaesarClipher(){} // default const
    public char[] encripte(String message){
        // we take the message str convert it to array
        // and then we call the encriptLogic that in each char in the array it added to it 13 and convert it to char
        // and store the result in a new array
        // and finally convert the new array to String and return it
        int len = message.length();
        char[] arr = new char[len];
        for(int i = 0; i<len; i++){
            char newChar = (char)(message.charAt(i) + 1 );
            arr[i] = newChar;
        }
        return arr;

    }
//    public String coco(String name){
//        return "coco "+ name;
//    }
}
