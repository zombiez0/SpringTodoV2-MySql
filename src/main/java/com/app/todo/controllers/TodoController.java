package com.app.todo.controllers;

import com.app.todo.models.Todo;
import com.app.todo.service.TodoServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

@Controller
public class TodoController {

    @Autowired
    private TodoServiceImpl todoService;

    public TodoController(){
        System.out.println("Initialized TodoController");
    }

    @GetMapping("/todos/getTodos")
    public String getAllTodos(@RequestParam String userName, Model model) {
        List<Todo> todoList = this.todoService.getAllTodos(userName);
        model.addAttribute("allTodos", todoList);
        return "list-todos";
    }

    @GetMapping("/todos/addNew")
    public String addNewTodo(Model model) {
        Todo todo = new Todo();
        model.addAttribute("todo", todo);
        return "create-todo";
    }

    @PostMapping("/todos/save")
    public String saveTodo(@ModelAttribute("todo") Todo todo) {
        this.todoService.createTodo(todo);
        return "redirect:/todos/getTodos?userName=" + todo.getUserName();
    }


}
