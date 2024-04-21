package com.app.todo.service;

import com.app.todo.models.Todo;

import java.util.List;

public interface ITodoService {

    Todo getTodo(long id);

    Todo createTodo(Todo todo);

    Todo updateTodo(long id, Todo todo);

    boolean deleteTodo(Long id);

    List<Todo> getAllTodos(String userName);

}
