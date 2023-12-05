
        <%@ include file = "common/header.jspf" %>
        <title>Add Todo Page</title>
    </head>
    <body>

        <%@ include file = "common/navigation.jspf" %>

        <div class = "container">
            <h1>Enter todo details<h1>
            <form:form method = "post" modelAttribute = "todo">
                <br>

                <fieldset class = "mb-3">
                    <form:label path = "description">Description</form:label>
                    <form:input type = "text" path = "description" required = "required"/>
                    <form:errors  path = "description" cssClass = "text-warning"/>
                 </fieldset>

                <fieldset class = "mb-3">
                    <form:label path = "targetDate">Target Date</form:label>
                    <form:input type = "text" path = "targetDate" required = "required"/>
                    <form:errors  path = "targetDate" cssClass = "text-warning"/>
                </fieldset>

                <fieldset class = "mb-3">
                    <form:label path = "work">Is Done</form:label>
                    <form:input type = "text" path = "work" required = "required"/>
                    <form:errors  path = "work" cssClass = "text-warning"/>
                </fieldset>

                <form:input type = "hidden" path = "id"/>
                <input type = "submit" class = "btn btn-success"/>
            </form:form>
        </div>
        <%@ include file = "common/footer.jspf" %>
