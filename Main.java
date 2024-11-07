import repositories.TodoListRepository;
import repositories.TodoListRepositoryImpl;
import service.TodoListService;
import service.TodoListServiceImpl;
import views.TodoListTerminalView;
import views.TodoListView;

public class Main {
    public static void main(String[] args) {
        TodoListRepository todoListRepository = new TodoListRepositoryImpl();
        TodoListService todoListService = new TodoListServiceImpl(todoListRepository);
        TodoListView todoListView = new TodoListTerminalView(todoListService);
        todoListView.run();
    }
}
