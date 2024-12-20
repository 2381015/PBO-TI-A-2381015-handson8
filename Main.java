import config.Database;
import repositories.TodoListRepository;
import repositories.TodoListRepositoryDblmpl;
import repositories.TodoListRepositoryImpl;
import service.TodoListService;
import service.TodoListServiceImpl;
import views.TodoListTerminalView;
import views.TodoListView;

public class Main {
    public static void main(String[] args) {
        Database database = new Database("my_database", "root", "", "localhost", "3306");
        database.setup();

        TodoListRepository todoListRepository = new TodoListRepositoryDblmpl(database);
        TodoListService todoListService = new TodoListServiceImpl(todoListRepository);
        TodoListView todoListView = new TodoListTerminalView(todoListService);
        todoListView.run();
    }
}

