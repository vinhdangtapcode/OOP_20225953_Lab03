package hust.soict.dsai.aims.store;

import hust.soict.dsai.aims.media.Media;
import java.util.ArrayList;

public class Store {
    private ArrayList<Media> itemsInStore ; 
    private int numberOfItems;

    public Store(int capacity) {
        itemsInStore = new ArrayList<>(capacity);  
        numberOfItems = 0;
    }
    
    public ArrayList<Media> getItemsInStore() {
        return itemsInStore;
    }
    
    public void addMedia(Media media) {
        itemsInStore.add(media); 
        numberOfItems++;
        System.out.println("Added media: " + media.getTitle());
    }

    public void removeMedia(Media media) {
        boolean found = false;
        if (itemsInStore.contains(media)) {
            itemsInStore.remove(media);  
            numberOfItems--;
            found = true;
            System.out.println("Removed media: " + media.getTitle());
        }
        if (!found) {
            System.out.println("Cannot find media");
        }
    }

    public void print() {
        System.out.println("List of media in store: ");
        for (int i = 0; i < numberOfItems; i++) {
            System.out.println((i + 1) + ". " + itemsInStore.get(i).toString());
        }
    }
}
