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
        todos.add(new Todo(id++,"user1","dsa", LocalDate.now(),"No"));
        todos.add(new Todo(id++,"user1","oops", LocalDate.now(),"No"));
        todos.add(new Todo(id++,"user2","os", LocalDate.now(),"No"));
        todos.add(new Todo(id++,"user2","db", LocalDate.now(),"No"));
    }

    public List<Todo> findByUserName(String userName){
        List<Todo> ret = new ArrayList<>();
        System.out.println("-------- : "+userName);
        for(Todo todo : todos)
            if(todo.getUsername().equals(userName))
                ret.add(todo);
        return ret;
    }

    public void addTodo(String username,String description,LocalDate localDate,String work){
        System.out.println("-------- : "+username);
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
        System.out.println("-------- : "+username);
        for(Todo todo : todos)
            if(todo.getId() == id){
                todo.setDescription(description);
                todo.setTargetDate(localDate);
                todo.setWork(work);
            }
    }
}
