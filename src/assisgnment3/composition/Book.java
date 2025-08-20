package assisgnment3.composition;





public class Book {
	
	public static void main(String[] args) {
        Base book = new Base();
        Magazine magazine = new Magazine(201, "Tech Today", 45);
        Libaray lib = new Libaray();
       
        
        lib.addBaseclass(book);
        lib.addMagazine(magazine);

        lib.showAllItems();
    }

	public int getAuthor() {
		// TODO Auto-generated method stub
		return 0;
	}

	public void displayInfo() {
		// TODO Auto-generated method stub
		
	}

	public String getTitle() {
		// TODO Auto-generated method stub
		return null;
	}

}