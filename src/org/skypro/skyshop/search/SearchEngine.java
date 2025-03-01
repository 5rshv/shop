package org.skypro.skyshop.search;

import org.skypro.skyshop.comparator.*;
import org.skypro.skyshop.exception.BestResultNotFound;

import java.util.*;


public class SearchEngine {
    Set<Searchable> searchables;

    public SearchEngine() {
        searchables = new HashSet<>();
    }

    public Set<Searchable> search(String searchTerm) {
        Set<Searchable> result = new TreeSet<>(new ComparatorLongestWord());
        for (Searchable searchable : searchables) {
            if (searchable.getSearchTerm().contains(searchTerm)) {
                result.add(searchable);
            }
        }
        return result;
    }

    public Searchable searchableEngine(String search) throws BestResultNotFound {
        Searchable bestSearch = null;
        int maxCount = 0;

        for (Searchable searchable : searchables) {
            int index = 0;
            int count = 0;
            int subIndex = searchable.getSearchTerm().indexOf(search, index);

            while (subIndex != -1) {
                count++;
                index = index + search.length();
                subIndex = searchable.getSearchTerm().indexOf(search, index);
            }

            if (count > maxCount) {
                maxCount = count;
                bestSearch = searchable;
            }
        }
        if (bestSearch == null) throw new BestResultNotFound("По слову: " + search + " ничего не найдено");
        return bestSearch;
    }


    public void add(Searchable searchable) {
        searchables.add(searchable);
    }
}