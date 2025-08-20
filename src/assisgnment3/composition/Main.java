package assisgnment3.composition;

public class Main {
    public static void main(String[] args) {
        // Create objects of subclasses
        Book book1 = new Book();
        Magazine mag1 = new Magazine(0, null, 0);

        // Demonstrate inheritance
        book1.displayInfo();
        mag1.displayInfo();
    }
}