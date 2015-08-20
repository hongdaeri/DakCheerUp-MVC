<%--
  Created by IntelliJ IDEA.
  User: h0ngz
  Date: 2015. 8. 18.
  Time: 오전 10:52
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>



<table>
  <tr>
    <td width="50px" align="center">id</td>
    <td align="center">pw</td>
    <td align="center">name</td>
    <td align="center">reg</td>
  </tr>
  <!-- result는 contoller의 addObject로 부터 가져온다. -->
  <c:forEach items="${result}" var="member">
    <tr>
      <td>${member.memberId}</td>
      <td>${member.memberPassword}</td>
      <td>${member.memberName}</td>
      <td>${member.regDate}</td>
    </tr>
  </c:forEach>
</table>

<%
  System.out.println((String)session.getAttribute("memberLoginInfo"));

%>

<hr>

<form id="member" name="member" action="/account/signUp" method="post">
  id : <input type="text" name="memberId"/><br>
  password : <input type="text" name="memberPassword"/><br>
  memberName : <input type="text" name="memberName"/><br>
  <input type="submit" />

</form>
