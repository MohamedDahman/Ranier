package Dictionary;

import java.util.List;
import java.util.stream.Collectors;

public class Dictionary {

    public List<Word> getDicList() {
        return dicList;
    }

    public void setDicList(List<Word> dicList) {
        this.dicList = dicList;
    }

    private List<Word> dicList;

    public static void main(String[] args) {
        Object dictionary = new Dictionary();
    }

    public String FindWord(String wordtoSearch)
    {
        List<String> result = dicList.stream()
                        .filter(e-> e.getEnglishWord().equals(wordtoSearch))
                        .map(e -> e.getGermanWord())
                        .collect(Collectors.toList());

        if (result.size()==0)
        {
            return  "Not Found";
        }
        else{
            return  result.get(0);
        }
    }

}
