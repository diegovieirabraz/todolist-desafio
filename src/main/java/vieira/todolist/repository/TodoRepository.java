package vieira.todolist.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import vieira.todolist.model.Todo;

public interface TodoRepository extends JpaRepository<Todo, Long> {
}
