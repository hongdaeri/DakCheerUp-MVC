<%@ page import="java.sql.*"%>

<%
String DB_URL = "jdbc:mysql://localhost:3306/dakcheerup";
String DB_USER = "root";
String DB_PASSWORD= "aslk1209";

Connection conn;
Statement stmt;
ResultSet rs=null;

String query = "select * from member";

// try {
Class.forName("org.gjt.mm.mysql.Driver");

conn = DriverManager.getConnection(DB_URL, DB_USER, DB_PASSWORD);

stmt = conn.createStatement();

rs = stmt.executeQuery(query);

while (rs.next()) {

out.println(rs.getString(1));
out.println(" ");
out.println(rs.getString(2));
out.println(" ");
out.println(rs.getString(3));
out.println("<br>");
}

rs.close();

stmt.close();

conn.close();

// } catch(Exception e){e.printStackTrace();}
%>