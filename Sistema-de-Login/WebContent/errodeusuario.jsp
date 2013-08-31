<%@page isErrorPage="true" %>
<%@page import="java.util.Enumeration" %>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Error</title>
</head>
<body>

    <div style="text-align: center">
     <img src="imagens/erro1.jpg"/>
     <hr/>
     Exceção: <%=exception.getClass() %> <br/>
     Mensagem de erro : <%=exception.getMessage() %><br/>
     <hr/>
          <a href="login.jsp">Tentar Novamente</a> 
    </div>

</body>
</html>