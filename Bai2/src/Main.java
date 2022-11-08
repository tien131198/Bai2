import java.util.Scanner;

/* Welcome to project
    @author: tienb
    Date: 11/5/2022
    Time: 2:34 PM
    
    ProjectName: Bai2
*/public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ManagerDocument managerDocument = new ManagerDocument();
        while(true){
            System.out.println("Application Manager Document");
            System.out.println("Enter 1: To insert document");
            System.out.println("Enter 2: To search document by category");
            System.out.println("Enter 3: To show information documents");
            System.out.println("Enter 4: To remove by id");
            System.out.println("Enter 5: To exit");
            String line = scanner.nextLine();
            switch(line){
                case "1":{
                    managerDocument.insertData();
                    break;
                }
                case "2":{
                    managerDocument.searchByCategory();
                    break;
                }
                case "3":{
                    managerDocument.show();
                    break;
                }
                case "4":{
                    System.out.println("Enter id to remove");
                    String id = scanner.nextLine();
                    System.out.println(managerDocument.deleteDocument(id) ? "Success" : "Fail");
                    break;
                }
                case "5":{
                    System.out.println("Exit");
                    System.exit(0);
                }
                default:{
                    break;
                }
            }
        }
    }
}
