<%@page contentType="text/html; charset=UTF-8"%>
<%@include file="../layouts/header.html"%>
<%@page import="bean.User"%>

<% User user = (User)session.getAttribute("user"); %>
こんにちは、<%= user.getName()%>さん。
<a href="/Task/games/index" class="btn btn-primary">一覧へ</a>

<%@include file="../layouts/footer.html"%>
