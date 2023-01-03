<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<%@ page import="com.example.JavaBeanDemo.JavaBeanDemo" %>
<!DOCTYPE html>
<html>
<head>
    <style type="text/css">
        .red {
            color: #ff0000;
        }
    </style>
    <title class="red">JSP - Hello World</title>
</head>
<body>
<%
    JavaBeanDemo javaBeanDemo=(JavaBeanDemo)request.getAttribute("javaBeanDemo");
%>
<h1><%= "Hello World!" %>
</h1>
<br/>
<a href="hello-servlet">Hello Servlet</a>
<% if(javaBeanDemo != null) { %>
<p class="red">
    <%=javaBeanDemo.getSex()%>
</p>
<% }%>
<p>
    <% if(javaBeanDemo != null) { %>
    <%=javaBeanDemo.getName() %>
    <% }; %>
</p>
</body>
</html>