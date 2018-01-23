<%@page contentType="text/html; charset=UTF-8"%>
<%@include file="../layouts/header.html" %>

<%@page import="bean.Book, java.util.List"%>
<% List<Book> books=(List<Book>)request.getAttribute("books"); %>


  <% for (Book book : books ){ %>
    <h1>『<%= book.getTitle() %>』の詳細</h1>
    <div class="well">
      <dl>
        <dt>id:</dt>
        <dd><%= book.getId() %></dd>
      </dl>
      <dl>
        <dt>著者:</dt>
        <dd><%= book.getAuthor()%></dd>
      </dl>
      <dl>
        <dt>ISBN:</dt>
        <dd><%= book.getIsbn()%></dd>
      </dl>

    </div>
  <% } %>
</table>

<hr>
<div class="text-center">
  <a href="./index">一覧に戻る</a>
</div>

<%@include file="../layouts/footer.html" %>
