<%@page contentType="text/html; charset=UTF-8"%>

<%@include file="../layouts/header.html"%>

<%@page import="bean.Book, java.util.List"%>

<% List<Book> books = (List<Book>)request.getAttribute("books"); %>

<h1>ライブラリ蔵書一覧</h1>
<table>
    <% for(Book b : books){ %>
        <tr>
            <td><%= b.getId() %>    </td>
            <td><%= b.getTitle() %> </td>
            <td><%= b.getAuthor() %></td>
            <td><%= b.getIsbn() %>  </td>
        </tr>
    <% } %>
</table>

<%@include file="../layouts/footer.html"%>
