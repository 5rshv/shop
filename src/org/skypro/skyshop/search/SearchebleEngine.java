package org.skypro.skyshop.search;

import org.skypro.skyshop.exception.BestResultNotFound;

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


    public Searchable searchableEngine(String search) throws BestResultNotFound {
        Searchable bestSearch = null;
        int maxCount = 0;

        for (Searchable  searchable: searchables){
            int index = 0;
            int count = 0;
            int subIndex = searchable.getSearchTerm().indexOf(search, index);

            while (subIndex != -1){
                count++;
                index = index + search.length();
                    subIndex = searchable.getSearchTerm().indexOf(search, index);
            }

            if (count > maxCount){
                maxCount = count;
                bestSearch = searchable;
            }
        }
        if (bestSearch == null) throw new BestResultNotFound("По слову: " + search + " ничего не найдено");
        return bestSearch;
    }


    public void add(Searchable searchable) {
        searchables[count++] = searchable;
    }
}