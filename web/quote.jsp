<%@ page import="quote.Quote" %><%--
  Created by IntelliJ IDEA.
  User: 152772a
  Date: 12/1/2016
  Time: 3:28 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>

<%
    String name = (String) session.getAttribute("name");
    Quote quo = (Quote) session.getAttribute("quote");

    String quote = quo.getQuote();
    String author = quo.getAuthor();


%>

Hi <%=name%>!<br>
Your daily quote is "<%=quote%> by <%=author%><br>
<a href="index.html">Back to Home</a> <a href="add.jsp">Add Quote</a>

</body>
</html>
