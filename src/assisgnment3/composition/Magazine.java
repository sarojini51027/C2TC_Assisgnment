package assisgnment3.composition;

public class Magazine extends Base {
	
	 private int issueNumber;

	    public Magazine(int id, String title, int issueNumber) {
	        super(id, title);
	        this.issueNumber = issueNumber;
	    }

	    public void displayInfo() {
	        String title = null;
			String id = null;
			System.out.println("Magazine: [ID: " + id + ", Title: " + title + ", Issue: " + issueNumber + "]");
	    }

	    public int getIssueNumber() {
	        return issueNumber;
	    }

		public char[] getTitle() {
			// TODO Auto-generated method stub
			return null;
		}

}

