import java.util.Scanner;

/* Welcome to project
    @author: tienb
    Date: 11/5/2022
    Time: 2:35 PM
    
    ProjectName: Bai2
*/public class Journal extends Document{
    private int issueNumber;
    private int monthIssue;
    public Journal(){
        super();
    }

    public Journal(String id, String nxb, int number, int issueNumber, int monthIssue) {
        super(id, nxb, number);
        this.issueNumber = issueNumber;
        this.monthIssue = monthIssue;
    }

    public int getIssueNumber() {
        return issueNumber;
    }

    public void setIssueNumber(int issueNumber) {
        this.issueNumber = issueNumber;
    }

    public int getMonthIssue() {
        return monthIssue;
    }

    public void setMonthIssue(int monthIssue) {
        this.monthIssue = monthIssue;
    }

    @Override
    public void insertDocument() {
        Scanner scanner = new Scanner(System.in);
        super.insertDocument();
        System.out.println("Enter issue number: ");
        this.issueNumber = scanner.nextInt();
        System.out.println("Enter issue month: ");
        this.monthIssue = scanner.nextInt();
        scanner.nextLine();

    }

    @Override
    public String toString() {
        return "Journal{" +
                "issueNumber=" + issueNumber +
                ", monthIssue=" + monthIssue +
                ", id='" + id + '\'' +
                ", nxb='" + nxb + '\'' +
                ", number=" + number +
                '}';
    }
}
