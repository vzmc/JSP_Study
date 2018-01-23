<%@page contentType="text/html; charset=UTF-8"%>
<%@include file="../layouts/header.html"%>

<%@page errorPage="error.jsp"%>

<%
    request.setCharacterEncoding("UTF-8");
    int price = Integer.parseInt(request.getParameter("price"));
    int count = Integer.parseInt(request.getParameter("count"));
%>

<p>
    <%=price%>円 x <%=count%>個 = <%=price * count%>円
</p>

<%@include file="../layouts/footer.html"%>
