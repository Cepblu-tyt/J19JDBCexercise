import controllers.Students;
import controllers.menu.Menu;

public class Main {
    public static void main(String[] args) {

        Students.createStudentsTable();


        Menu.mainMenu();
    }
}
