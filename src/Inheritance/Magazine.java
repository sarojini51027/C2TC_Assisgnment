package Inheritance;

public class Magazine {
	private int issueNumber;

    public Magazine(int id, String title, int issueNumber) {
        super();
        this.issueNumber = issueNumber;
    }

    public void displayInfo() {
        String id = null;
		String title = null;
		System.out.println("Magazine: [ID: " + id + ", Title: " + title + ", Issue: " + issueNumber + "]");
    }

    public int getIssueNumber() {
        return issueNumber;
    }

}

