<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
    <head>
        <link href = "webjars/bootstrap/5.2.3/css/bootstrap.min.css" rel = "stylesheet">
        <title>Todos Page</title>
    </head>
    <body>
        <div class = "container">
           <!-- Welcome back ${name} -->
            <br>
            <div><h1>Your todos are as follow<h1></div>
            <table class = "table">
                <thead>
                    <tr>
                        <th>id</th>
                        <th>Description</th>
                        <th>Target Date</th>
                        <th>Is Done</th>
                         <th>Delete</th>
                    <tr>
                </thead>
                <tbody>
                    <c:forEach items = "${todos}" var = "todo">
                        <tr>
                            <td>${todo.id}</td>
                            <td>${todo.description}</td>
                            <td>${todo.targetDate}</td>
                            <td>${todo.work}</td>
                            <td><a href = "delete-todo?id=${todo.id}" class = "btn btn-primary">DELETE ${todo.id}</a></td>
                        </tr>
                    </c:forEach>
                </tbody>
            <table>
            <a href = "add-todo" class = "btn btn-success">Add Todo</a>
        </div>
        <script src = "webjars/bootstrap/5.2.3/js/bootstrap.min.js"></script>
        <script src = "webjars/jquery/3.6.4/jquery.min.js"></script>
    </body>
</html>