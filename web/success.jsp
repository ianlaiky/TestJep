<%@ page import="quote.Quote" %><%--
  Created by IntelliJ IDEA.
  User: 152772a
  Date: 12/1/2016
  Time: 3:50 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>

<%


    Quote qt = (Quote) request.getAttribute("qt");
    String quote = qt.getQuote();
    String author = qt.getAuthor();


%>

Thank You <%=author%> for contributing the quote '<%=quote%>'
<a href="index.html">Back to Home</a>



</body>
</html>
