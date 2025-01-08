package org.skypro.skyshop.search;

public class SearchebleEngine {
    Searchable[] searchables;
    int count = 0;

    public SearchebleEngine(int a) {
        searchables = new Searchable[a];
    }

    public Searchable[] search(String searchTerm) {
        Searchable [] results = new Searchable[5];
        int countResults = 0;
        for (int i = 0; i < count; i++) {
            if (searchables[i].getSearchTerm().contains(searchTerm)) {
                results[countResults++] = searchables[i];
            }
            if(countResults == 5) break;
        }
        return results;
    }

    public void add(Searchable searchable) {
        searchables[count++] = searchable;
    }
}
