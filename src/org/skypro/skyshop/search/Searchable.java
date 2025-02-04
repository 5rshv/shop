package org.skypro.skyshop.search;

public interface Searchable {
    String getTypeContent();

    String getSearchTerm();

    default String getStringRepresentation() {
        return getSearchTerm();
    }
}
