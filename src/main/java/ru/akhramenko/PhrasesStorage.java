package ru.akhramenko;

import java.util.HashMap;

public class PhrasesStorage {
    private static final HashMap<Integer, String> phrasesStorage = new HashMap<>();

    public PhrasesStorage() {
        phrasesStorage.put(1, "Все ок");
        phrasesStorage.put(2, "Могло быть хуже");
    }

    public String getPhrase() {
        return phrasesStorage.get((int) (Math.random()*phrasesStorage.size()+1));
    }

    public synchronized  void addPhrase(String phrase) {
        phrasesStorage.put(phrasesStorage.size()+1, phrase);
    }
}
