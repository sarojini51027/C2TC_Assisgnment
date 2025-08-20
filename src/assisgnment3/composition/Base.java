package assisgnment3.composition;

public class Base {
	public Base(int id, String title) {
		// TODO Auto-generated constructor stub
	}

	public Base() {
		// TODO Auto-generated constructor stub
	}

	public class Baseclass {
		
	    protected int id;
	    protected String title;

	    public Baseclass(int id, String title) {
	        this.id = id;
	        this.title = title;
	    }

	    public void displayInfo() {
	        System.out.print("ID: " + id + ", Title: " + title);
	    }
	    
	    public String getTitle() {
			return title;
	    	
	    }

}

	public char[] getTitle() {
		// TODO Auto-generated method stub
		return null;
	}
}
