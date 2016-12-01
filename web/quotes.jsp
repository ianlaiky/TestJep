<%@ page import="quote.QuoteDAO" %>
<%@ page import="quote.Quote" %>
<%@ page import="java.util.List" %><%--
  Created by IntelliJ IDEA.
  User: 152772a
  Date: 12/1/2016
  Time: 4:42 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>

<%
    QuoteDAO db = new QuoteDAO();
    List<Quote> q = db.getAll();


%>
sdf
<%for (int i = 0; i < q.size(); i++) {%><%=q.get(i).getQuote()%> by <%=q.get(i).getAuthor()%><%}%>

</body>
</html>
