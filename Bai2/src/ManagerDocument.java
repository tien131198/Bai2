import javax.print.Doc;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/* Welcome to project
    @author: tienb
    Date: 11/5/2022
    Time: 2:34 PM
    
    ProjectName: Bai2
*/public class ManagerDocument {
    List<Document> documents;

    public ManagerDocument() {
        this.documents = new ArrayList<>();
    }
    // add document
    public void addDocument(Document document){
        this.documents.add(document);
    }
    // delete document
    public boolean deleteDocument(String id){
        Document document = this.documents.stream()
                .filter(o-> o.getId().equals(id))
                .findFirst().orElse(null);
        if (document == null){
            return false;
        }else{
            this.documents.remove(document);
            return true;
        }
    }
    // show information
    public void show(){
        this.documents.forEach(o-> System.out.println(o.toString()));
    }
    // search by category
    public void searchByCategory(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a to search by book");
        System.out.println("Enter b to search by newspaper");
        System.out.println("Enter c to search by journal");
        String choice = scanner.nextLine();
        switch(choice){
            case "a": {
                searchByBook();
                break;
            }
            case "b":{
                searchByNewspaper();
                break;
            }
            case "c":{
                searchByJournal();
                break;
            }
            default:{
                System.out.println("Invalid");
                break;
            }
        }

    }
    // insert data
        public void insertData(){
            System.out.println("Enter a: insert book");
            System.out.println("Enter b: insert newspaper");
            System.out.println("Enter c: insert journal");
            Scanner scanner = new Scanner(System.in);
            String type = scanner.nextLine();
            switch(type){
                case "a":{
                    Document document = new Book();
                    document.insertDocument();
                    this.documents.add(document);
                    break;
                }
                case "b":{
                    Document document = new Newspaper();
                    document.insertDocument();
                    this.documents.add(document);
                    break;
                }
                case "c":{
                    Document document = new Journal();
                    document.insertDocument();
                    this.documents.add(document);
                    break;
                }
                default:
                    break;
            }
        }
    // search by book
    public void searchByBook(){
        this.documents.stream()
                .filter(o->o instanceof Book)
                .forEach(o-> System.out.println(o.toString()));
    }
    // search by newspaper
    public void searchByNewspaper(){
        this.documents.stream()
                .filter(o->o instanceof Newspaper)
                .forEach(o-> System.out.println(o.toString()));
    }// search by journal
    public void searchByJournal(){
        this.documents.stream()
                .filter(o->o instanceof Journal)
                .forEach(o-> System.out.println(o.toString()));
    }
}
