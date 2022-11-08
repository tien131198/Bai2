import javax.lang.model.util.SimpleAnnotationValueVisitor6;
import java.util.Scanner;

/* Welcome to project
    @author: tienb
    Date: 11/5/2022
    Time: 2:33 PM
    
    ProjectName: Bai2
*/public class Book extends Document{
    private String author;
    private int numberPage;

    public Book() {
        super();
    }

    public Book(String id, String nxb, int number, String author, int numberPage) {
        super(id, nxb, number);
        this.author = author;
        this.numberPage = numberPage;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public int getNumberPage() {
        return numberPage;
    }

    public void setNumberPage(int numberPage) {
        this.numberPage = numberPage;
    }

    @Override
    public void insertDocument() {
        Scanner scanner = new Scanner(System.in);
        super.insertDocument();
        System.out.println("Enter author");
        this.author = scanner.nextLine();
        System.out.println("Enter page number");
        this.numberPage = scanner.nextInt();
        scanner.nextLine();
    }

    @Override
    public String toString() {
        return "Book{" +
                "author='" + author + '\'' +
                ", numberPage='" + numberPage + '\'' +
                ", id='" + id + '\'' +
                ", nxb='" + nxb + '\'' +
                ", number=" + number +
                '}';
    }
}
