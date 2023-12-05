package com.myFirstWebApp.myapp.todo;

import jakarta.validation.constraints.Size;

import java.time.LocalDate;

public class Todo {

    private long id;
    private String username;

    @Size(min = 10, message = "Please enter 10 characters", max = 20)
    private String description;
    private LocalDate targetDate;
    private String work;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public LocalDate getTargetDate() {
        return targetDate;
    }

    public void setTargetDate(LocalDate targetDate) {
        this.targetDate = targetDate;
    }

    public String getWork() {
        return work;
    }

    public void setWork(String work) {
        this.work = work;
    }

    public Todo(long id, String username, String description, LocalDate targetDate, String work) {
        this.id = id;
        this.username = username;
        this.description = description;
        this.targetDate = targetDate;
        this.work = work;
    }

    @Override
    public String toString() {
        return "Todo{" +
                "id=" + id +
                ", username='" + username + '\'' +
                ", description='" + description + '\'' +
                ", targetDate=" + targetDate +
                ", work='" + work + '\'' +
                '}';
    }
}
