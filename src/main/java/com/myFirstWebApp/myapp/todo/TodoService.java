package com.myFirstWebApp.myapp.todo;

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
}
