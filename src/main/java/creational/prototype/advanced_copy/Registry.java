package creational.prototype.advanced_copy;

import java.util.HashMap;
import java.util.Map;

public class Registry {

    private Map<String, Item> items = new HashMap<>();

    public Registry() {
        loadItems();
    }

    public Item createItem(String type) {
        Item item = null;

        try {
            item = (Item)(items.get(type)).clone();

        } catch (CloneNotSupportedException cnse) {
            cnse.printStackTrace();
        }

        return item;
    }

    private void loadItems() {
        Movie movie = new Movie();

        movie.setTitle("Design patterns for Dummies");
        movie.setPrice(20.00);
        movie.setRuntime("1,5 hour");
        items.put("Movie", movie);

        Book book = new Book();
        book.setNumberOfPages(382);
        book.setPrice(36.90);
        book.setTitle("Stroze");
        items.put("Book", book);
    }
}
