package com.myFirstWebApp.myapp.todo;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.SessionAttributes;

import java.time.LocalDate;
import java.util.List;

@Controller
@SessionAttributes("name")
public class TodoConttroller {

    private TodoService todoService;

    public TodoConttroller(TodoService todoService) {
        this.todoService = todoService;
    }

    @RequestMapping(value="/list-todos",method = RequestMethod.GET)
    public String listAllTodos(ModelMap map){
        List<Todo> ret = todoService.findByUserName("gfg");
        map.put("todos",ret);
        return "zz";
    }

    @RequestMapping(value="/add-todo",method = RequestMethod.GET)
    public String showNewTodo(){
//  public String showNewTodo(ModelMap map){
//        String username = (String) map.get("name");
//        Todo todo = new Todo(0,username,"",LocalDate.now(),"Nah");
//        map.put("todo",todo);
        return "todo";
    }

    @RequestMapping(value="/add-todo",method = RequestMethod.POST)
    public String AddTodo(@RequestParam String description,ModelMap map){
//  public String AddTodo(ModelMap map,Todo todo){
//        todoService.addTodo((String) map.get("name"),todo.getDescription(),LocalDate.now(),"Nah");
        todoService.addTodo((String) map.get("name"),description,LocalDate.now(),"Nah");
        return "redirect:list-todos";
    }
}
