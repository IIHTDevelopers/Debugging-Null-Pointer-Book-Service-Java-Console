
package com.genspark.task1;

import java.util.HashMap;
import java.util.Map;

public class Main {

    private Map<Integer, Book> cache = new HashMap<>();

    public Book getBookById(int id) {
        // BUG: cache may be null on first call -> NullPointerException
    	init();
        return cache.get(id);
    }

    public void init() {
        cache = new HashMap<>();
        cache.put(1, new Book(1, "Clean Code"));
        cache.put(2, new Book(2, "Effective Java"));
    }

    static class Book {
        int id;
        String title;
        public Book(int id, String title) {
            this.id = id;
            this.title = title;
        }
    }
}
