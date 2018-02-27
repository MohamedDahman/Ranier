package Dictionary;

public class Word {

    private String englishWord;

    public String getGermanWord() {
        return germanWord;
    }

    public void setGermanWord(String germanWord) {
        this.germanWord = germanWord;
    }

    private String germanWord;

    public Word(String englishWord, String germanWord) {
        this.englishWord = englishWord;
        this.germanWord = germanWord;
    }

    public String getEnglishWord() {
        return englishWord;
    }

    public void setEnglishWord(String englishWord) {
        this.englishWord = englishWord;
    }
}
