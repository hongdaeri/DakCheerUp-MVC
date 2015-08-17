<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html lang="ko">
<head>

  <!-- =================== ETC ======================================= -->
</head>
<body>




<table>
  <tr>
    <td width="50px" align="center">id</td>
    <td align="center">email</td>
    <td align="center">phone</td>
  </tr>
  <!-- result는 contoller의 addObject로 부터 가져온다. -->
  <c:forEach items="${result}" var="member">
    <tr>
      <td>${member.name}</td>
      <td>${member.email}</td>
      <td>${member.phone}</td>
    </tr>
  </c:forEach>
</table>

<hr>

<form id="member" name="member" action="/insert" method="post">
    이름 : <input type="text" name="name"/><br>
    이메일 : <input type="text" name="email"/><br>
    폰 : <input type="text" name="phone"/><br>
    <input type="submit" />

</form>

<!-- ================== BEGIN PAGE LEVEL JS ================== -->
<div id="siteMeshJavaScript">


  <script>
    $(document).ready(function() {
      App.init();

    });


  </script>
</div>
<!-- ================== END PAGE LEVEL JS ================== -->

</body>
</html>
