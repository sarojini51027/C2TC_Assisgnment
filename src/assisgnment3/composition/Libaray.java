package assisgnment3.composition;



import java.util.ArrayList;
import java.util.ArrayList;
import java.util.List;

public class Libaray {
	
	private List<Base> items;

    public Libaray() {
        items = new ArrayList<>();
    }

    public void showAllItems() {
        System.out.print("Library contains: [");

        for (int i = 0; i < items.size(); i++) {
            Base item = items.get(i);

            if (items instanceof Book) {
                Book book = (Book) items;
                System.out.print(book.getTitle() + " by " + book.getAuthor());
            } else if (item instanceof Magazine) {
                Magazine mag = (Magazine) item;
                System.out.print(mag.getTitle() + " Issue " + mag.getIssueNumber());
            } else {
                System.out.print(item.getTitle());
            }

            if (i < items.size() - 1) {
                System.out.print(" - ");
            }
        }

        System.out.println(" ]");
    }

	public void addBaseclass(Base book) {
		
		items.add(book);
	
	}

	public void addMagazine(Magazine magazine) {
		
		items.add(magazine);
		
	}

}