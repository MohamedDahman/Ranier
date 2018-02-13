package four;


import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class Dictionary {

    private String englishWord;
    private String germanWord;
    private List dicList;

    public static void main(String[] args) {
        Object dictionary = new Dictionary();
    }


    public Dictionary() {

        // in this Constructor i Want to Load The four.Dictionary in List Stream

        BufferedReader buffer = null;
        try {
            buffer = new BufferedReader(new FileReader("//dev//sd1//Prep//dict.txt"));
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }

        dicList = new ArrayList();
        String line = null;
        try {
            line = buffer.readLine();
        } catch (IOException e) {
            e.printStackTrace();
        }

        while (line != null) {

            try {
                line = buffer.readLine();
                dicList.add(line);
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

    }

    public String lookup(String englishWord) {

        Boolean found = false;
        int dicListCount = dicList.size();
        int index = 0;
        String currentStr ;
        while (index != dicListCount)
        {
           currentStr = (String) dicList.get(index);

           if (currentStr.contains(englishWord))
           {
               int  x = currentStr.indexOf("|");
               String result=currentStr.substring(x,currentStr.length()-1);
              return  result;
           }
        }
        return "not found";
    }


}
