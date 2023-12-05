<%@ include file = "common/header.jspf" %>
<title> Welcome Page</title>
    </head>
    <body>
        <%@ include file = "common/navigation.jspf" %>
        <div class = "container">
            <div>Welcome back ${name}</div>
            <hr>
            <div><a href = "list-todos">Manage</a> your Todos</div>
        </div>
<%@ include file = "common/footer.jspf" %>