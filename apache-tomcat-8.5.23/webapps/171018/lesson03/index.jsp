<%@ page contentType="text/html; charset=UTF-8" %>
<%@ include file="../parts/header.html" %>
<h1>スクリプトレットのテスト</h1>
<% out.println("hello world"); %>
<br>
<% out.println(new java.util.Date()); %>
<%@ include file="../parts/footer.html" %>
