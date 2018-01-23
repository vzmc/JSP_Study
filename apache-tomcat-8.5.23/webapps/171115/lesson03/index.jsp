<%@page contentType="text/html; charset=UTF-8" %>
<%@include file="../layouts/header.html" %>

<% out.println("テスト"); %>
<hr/>
<% out.println(new java.util.Date()); %>
<hr/>
<%= new java.util.Date() %>

<%@include file="../layouts/footer.html" %>
