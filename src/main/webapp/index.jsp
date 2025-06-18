<%@ page import="java.util.List" %>
<%@ page import="java.util.ArrayList" %>
<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html>
<head>
    <title>JSP - Hello World</title>
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.7/dist/css/bootstrap.min.css" rel="stylesheet" >
</head>
</head>
<body>
<h1><%= "Hello World!" %>
</h1>
<br/>
<a href="hello-servlet">Hello Servlet</a>
<%
      List<String> data=new ArrayList<>();
      data.add("Hello");
      data.add("Servlet");
      data.add("World");
      String name="Hi";
      int cond=780;
%>
<table class="table">
    <thead>
    <tr>
        <th scope="col">#</th>
        <th scope="col">First</th>
        <th scope="col">Last</th>
        <th scope="col">Handle</th>
    </tr>
    </thead>
    <tbody>
    <tr>
        <th scope="row">1</th>
        <td>Mark</td>
        <td>Otto</td>
        <td>@mdo</td>
    </tr>
    <tr>
        <th scope="row">2</th>
        <td>Jacob</td>
        <td>Thornton</td>
        <td>@fat</td>
    </tr>
    <tr>
        <th scope="row">3</th>
        <td>John</td>
        <td>Doe</td>
        <td>@social</td>
    </tr>
    </tbody>
</table>
<table class="table">
    <tr>
        <%
            for (String item :data) {
        %>
        <td>Element: <%= item %></td>
        <br>
        <%
            }
        %>
    </tr>
</table>
    <h3><%out.println(name);%></h3>
    <h3><%= cond<0 ?"Yes":"No" %></h3>
</body>
</html>