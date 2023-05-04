package Library_5;

import Library_5.Controllers.UserController;
import Library_5.Model.FileOperation;
import Library_5.Model.FileOperationImpl;
import Library_5.Model.Repository;
import Library_5.Model.RepositoryFile;
import Library_5.Views.ViewUser;

public class Main {
    public static void main(String[] args) {
        FileOperation fileOperation = new FileOperationImpl("users.txt");
        Repository repository = new RepositoryFile(fileOperation);
        UserController controller = new UserController(repository);
        ViewUser view = new ViewUser(controller);
        view.run();
    }
}
