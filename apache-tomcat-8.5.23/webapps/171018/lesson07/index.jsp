<%@ page contentType="text/html; charset=UTF-8" %>
<%@ page import="java.util.*" %>

<%@ include file="../parts/header.html" %>

<h1>変数の宣言について</h1>
<p>変数の宣言にはちょっと注意が必要</p>
<hr>
<%!
  int countA = 0;
%>

<%
  int countB = 0;
  countA++;
  countB++;
%>

<p>宣言による変数countAの値は<%= countA%></p>
<p>スクリプトレット内の変数countBの値は<%= countB%></p>

<%@ include file="../parts/footer.html" %>
