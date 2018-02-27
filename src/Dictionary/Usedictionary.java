package Dictionary;

import parser.DictionaryParser;

public class Usedictionary {
    public static void main(String[] args) {

        UserInputReader getvalue = new UserInputReader();
        String searchvalue = getvalue.inputReader("Please Enter the String");
        Dictionary myDic = new Dictionary();
        myDic.setDicList(DictionaryParser.loadDictionary("src/data/dictionaryData")) ;
        System.out.println(myDic.FindWord(searchvalue));

    }
}
