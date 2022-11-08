import java.util.Scanner;

/* Welcome to project
    @author: tienb
    Date: 11/5/2022
    Time: 2:34 PM
    
    ProjectName: Bai2
*/public class Document {
    protected String id;
    protected String nxb;
    protected int number;

    public Document() {
    }

    public Document(String id, String nxb, int number) {
        this.id = id;
        this.nxb = nxb;
        this.number = number;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getNxb() {
        return nxb;
    }

    public void setNxb(String nxb) {
        this.nxb = nxb;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }
    // insert document
    public void insertDocument(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter id: ");
        this.id = scanner.nextLine();
        System.out.println("Enter nxb");
        this.nxb = scanner.nextLine();
        System.out.println("Enter number");
        this.number= scanner.nextInt();
        scanner.nextLine();
    }
}
