package four;

public class Usedictionary {
    public static void main(String[] args) {

        UserInputReader getvalue = new UserInputReader();
        String searchvalue = getvalue.inputReader("Please Enter the String");
        Dictionary myDic = new Dictionary();
        myDic.lookup(searchvalue);

    }
}
