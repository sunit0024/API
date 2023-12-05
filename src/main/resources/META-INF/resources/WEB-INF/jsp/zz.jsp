
        <%@ include file = "common/header.jspf" %>
        <title>Todos Page</title>
    </head>
    <body>

        <%@ include file = "common/navigation.jspf" %>
        <div class = "container">
           <!-- Welcome back ${name} -->
            <br>
            <div><h1>Your todos are as follow<h1></div>
            <table class = "table">
                <thead>
                    <tr>
                        <!-- <th>id</th> -->
                        <th>Description</th>
                        <th>Target Date</th>
                        <th>Is Done</th>
                    <tr>
                </thead>
                <tbody>
                    <c:forEach items = "${todos}" var = "todo">
                        <tr>
                            <!-- <td>${todo.id}</td> -->
                            <td>${todo.description}</td>
                            <td>${todo.targetDate}</td>
                            <td>${todo.work}</td>
                            <td><a href = "delete-todo?id=${todo.id}" class = "btn btn-danger">DELETE</a></td>
                            <td><a href = "update-todo?id=${todo.id}" class = "btn btn-primary">UPDATE</a></td>
                        </tr>
                    </c:forEach>
                </tbody>
            <table>
            <a href = "add-todo" class = "btn btn-success">Add Todo</a>
        </div>
        <%@ include file = "common/footer.jspf" %>
