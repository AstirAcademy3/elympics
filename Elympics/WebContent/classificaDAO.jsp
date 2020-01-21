<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ page import="com.elympics.bean.*" %>
    <%@ page import="com.elympics.manager.UserManager" %>
    <%@ page import="com.elympics.dao.ClassificaDAO" %>
    <%@ page import="java.util.List" %>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %> 
    <%@ taglib uri="http://displaytag.sf.net" prefix="display"%>

    
<jsp:include page="header.jsp"></jsp:include>

<jsp:useBean id="user" scope="session" class="com.elympics.bean.User"/>

<p>User</p>

<p> <jsp:getProperty property="cognome" name="user"/> <jsp:getProperty property="nome" name="user"/></p>

<c:if test="${user.username != null }">

<%UserManager manager = new UserManager();
List<Classifica> lista = manager.getListaPrimiTre(user);
request.setAttribute("lista",lista);
%>

<display:table name="lista" class="tabella">
    <display:column property="user.cognome" title="Cognome"/>
    <display:column property="punti" title="Punti"/>
</display:table>

</c:if>

<c:if test="${user.username == null}">
Login necessary
</c:if>

<jsp:include page="footer.jsp"></jsp:include>
