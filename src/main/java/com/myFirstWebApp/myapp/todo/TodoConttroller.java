package com.myFirstWebApp.myapp.todo;

import jakarta.validation.Valid;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
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
        String username = (String)map.get("name");
        System.out.println("-------- : "+username);
        List<Todo> ret = todoService.findByUserName(username);
        map.addAttribute("todos",ret);
        return "zz";
    }

    @RequestMapping(value="/add-todo",method = RequestMethod.GET)
    public String showNewTodo(ModelMap map){
        String username = (String) map.get("name");
        System.out.println("-------- : "+username);
        Todo todo = new Todo(0,username,"",LocalDate.now(),"");
        map.put("todo",todo);
        return "todo";
    }

    @RequestMapping(value="/add-todo",method = RequestMethod.POST)
    public String AddTodo(ModelMap map, @Valid Todo todo, BindingResult result){
        if(result.hasErrors())
            return "todo";
        todoService.addTodo((String) map.get("name"),todo.getDescription(),todo.getTargetDate(),todo.getWork());
        return "redirect:list-todos";
    }

    @RequestMapping(value="/delete-todo",method = RequestMethod.GET)
    public String deleteTodo(@RequestParam long id){
        todoService.deleteTodo(id);
        return "redirect:list-todos";
    }

    @RequestMapping(value="/update-todo",method = RequestMethod.GET)
    public String showUpdateTodo(ModelMap map,@RequestParam long id){
        Todo todo = todoService.getById(id);
        map.put("todo",todo);
        return "todo";
    }

    @RequestMapping(value="/update-todo",method = RequestMethod.POST)
    public String UpdateTodo(ModelMap map, @Valid Todo todo, BindingResult result){
        if(result.hasErrors())
            return "todo";
        todoService.updateTodo(todo.getId(),(String) map.get("name"),todo.getDescription(),todo.getTargetDate(),todo.getWork());
        return "redirect:list-todos";
    }
}
