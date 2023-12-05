<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
    <head>
        <link href = "webjars/bootstrap/5.2.3/css/bootstrap.min.css" rel = "stylesheet">
        <title>Add Todo Page</title>
    </head>
    <body>
        <div class = "container">
            <h1>Enter todo details<h1>
            <form:form method = "post" modelAttribute = "todo">
                <br>
                Description : <form:input type = "text" path = "description" required = "required"/>
                <form:errors  path = "description" cssClass = "text-warning"/>
                <form:input type = "hidden" path = "work"/>
                <form:input type = "hidden" path = "id"/>
                <br>
                <input type = "submit" class = "btn btn-success"/>
            </form:form>
        </div>
        <script src = "webjars/bootstrap/5.2.3/js/bootstrap.min.js"></script>
        <script src = "webjars/jquery/3.6.4/jquery.min.js"></script>
    </body>
</html>