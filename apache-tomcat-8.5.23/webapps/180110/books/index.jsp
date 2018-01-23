<%@page contentType="text/html; charset=UTF-8"%>
<%@include file="../layouts/header.html" %>

<%@page import="bean.Book, java.util.List"%>
<% List<Book> books=(List<Book>)request.getAttribute("books"); %>

<h1>ライブラリ蔵書一覧</h1>
<table class="table">
  <thead>
    <tr>
      <th>ID</th>
      <th>書籍名</th>
      <th>著者</th>
      <th>ISBN</th>
      <th>操作</th>
    </tr>
  </thead>
  <% for (Book book : books ){ %>
    <tr>
      <td><%= book.getId() %></td>
      <td><%= book.getTitle() %></td>
      <td><%= book.getAuthor()%></td>
      <td><%= book.getIsbn()%></td>
      <td>
        <a href="./show?id=<%= book.getId() %>" class="btn-sm btn-info">詳細</a>
        <a href="./edit?id=<%= book.getId() %>" class="btn-sm btn-success">編集</a>
      </td>
    </tr>
  <% } %>
</table>

<hr>
<a href="./new.jsp" class="btn btn-primary">新規登録</a>

<%@include file="../layouts/footer.html" %>
