package ru.akhramenko;

public class HelpServiceController {

    private final PhrasesStorage phrasesStorage;

    public HelpServiceController() {
        this.phrasesStorage = new PhrasesStorage();
    }

    public String getPhrasesStorage() {
        return phrasesStorage.getPhrase();
    }

    public String addPhrasesStorage(String phrase) {
        phrasesStorage.addPhrase(phrase);
        return "Добавлено" + phrase;
    }
}
