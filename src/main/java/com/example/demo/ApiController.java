package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@SpringBootApplication
@RestController
@RequestMapping(value = "/todo")
public class ApiController {

    //autowired sonst nullpointerexception
    @Autowired
    private ServiceTodoItem service;


    @GetMapping("/test")
    public String sayHello(){
        return "Hi was geht";
    }

    @GetMapping("/")
    public List<TodoItem> getTodoItems(){
        return service.getTodoItems();
    }

    @GetMapping("/{id}")
    public TodoItem getTodoById(@PathVariable Integer id){
        return service.getTodoItemById(id);
    }

    @PostMapping("/{id}")
    public void setTodoItem(@PathVariable Integer id){
        TodoItem item = new TodoItem(id);
        service.setTodoItem(item);
    }


    @PutMapping("/{id}")
    public void updateTodoItem(@PathVariable Integer id, @RequestBody TodoItem todoItem) {
        service.updateTodoItem(id, todoItem);
    }

}
