import java.util.Scanner;

/* Welcome to project
    @author: tienb
    Date: 11/5/2022
    Time: 2:34 PM
    
    ProjectName: Bai2
*/public class Newspaper extends Document{
    private int dayIssue;

    public Newspaper(){
        super();
    }
    public Newspaper(String id, String nxb, int number, int dayIssue) {
        super(id, nxb, number);
        this.dayIssue = dayIssue;
    }

    public int getDayIssue() {
        return dayIssue;
    }

    public void setDayIssue(int dayIssue) {
        this.dayIssue = dayIssue;
    }

    @Override
    public void insertDocument() {
        Scanner scanner = new Scanner(System.in);
        super.insertDocument();
        System.out.println("Enter Day issue: ");
        this.dayIssue = scanner.nextInt();
        scanner.nextLine();
    }

    @Override
    public String toString() {
        return "Newspaper{" +
                "dayIssue=" + dayIssue +
                ", id='" + id + '\'' +
                ", nxb='" + nxb + '\'' +
                ", number=" + number +
                '}';
    }
}
