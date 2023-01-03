<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<%@ page import="com.example.JavaBeanDemo.JavaBeanDemo" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

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
<%--<%--%>
<%--    JavaBeanDemo javaBeanDemo=(JavaBeanDemo)request.getAttribute("javaBeanDemo");--%>
<%--%>--%>
<h1><%= "Hello World!" %>
</h1>
<br/>
<a href="hello-servlet">Hello Servlet</a>
<%--<% if(javaBeanDemo != null) { %>--%>
<%--<p class="red">--%>
<%--    <%=javaBeanDemo.getSex()%>--%>
<%--</p>--%>
<%--<% }%>--%>
<%--    <% if(javaBeanDemo != null) { %>--%>
<%--    <%=javaBeanDemo.getName() %>--%>
<%--    <% }; %>--%>
<div id="app">
    <input type="text" name="name" v-model="javaBeanDemo.name">{{javaBeanDemo.name}}
</div>
<script src="https://cdn.jsdelivr.net/npm/vue@2/dist/vue.js"></script>
<script>
    new Vue(
        {
            el:"#app",
            data(){
                return{
                    javaBeanDemo:{}
                }
            }
        }
    )
</script>
</body>
</html>