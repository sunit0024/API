package com.myFirstWebApp.myapp.todo;

import org.springframework.cglib.core.Local;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

@Service
public class TodoService {

    private static List<Todo> todos;
    private static int id;
    static{
        id = 1;
        todos = new ArrayList<>();
        todos.add(new Todo(id++,"gfg","dsa", LocalDate.now(),"No"));
        todos.add(new Todo(id++,"javatpoint","oops", LocalDate.now(),"No"));
        todos.add(new Todo(id++,"yt","os", LocalDate.now(),"No"));
        todos.add(new Todo(id++,"ud","db", LocalDate.now(),"No"));
    }

    public List<Todo> findByUserName(String userName){
        return todos;
    }

    public void addTodo(String username,String description,LocalDate localDate,String work){
        Todo newTodo = new Todo(id++,username,description,localDate,work);
        todos.add(newTodo);
    }

    public void deleteTodo(long id){
        for(Todo todo : todos){
            if(todo.getId() == id){
                todos.remove(todo);
                break;
            }
        }
    }

    public Todo getById(long id){
        for(Todo todo : todos)
            if(todo.getId() == id)
                return todo;
        return new Todo(id++,"default","default", LocalDate.now(),"Nah");
    }

    public void updateTodo(long id,String username,String description,LocalDate localDate,String work){
        Todo toBeUpdatedTodo = new Todo(0,"default","default", LocalDate.now(),"Nah");
        for(Todo todo : todos)
            if(todo.getId() == id){
                todo.setDescription(description);
                todo.setTargetDate(localDate);
                todo.setWork(work);
            }
    }
}
