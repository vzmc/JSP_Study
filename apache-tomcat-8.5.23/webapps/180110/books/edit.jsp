<%@page contentType="text/html; charset=UTF-8"%>
<%@page import="bean.Book, java.util.List"%>
<% List<Book> books=(List<Book>)request.getAttribute("books"); %>

<%@include file="../layouts/header.html"%>
<% for (Book book : books ){ %>

<h1>『<%= book.getTitle() %>』のアップデート</h1>

<form action="update" method="post">
  <input type="hidden" name="id" value="<%= book.getId() %>"/>
  <div class="well">
    <div class="form-group">
      <label for="title">書籍名</label>
      <input type="text" name="title" class="form-control" placeholder="ハリーポッターと賢者の石" value="<%= book.getTitle() %>"/>
    </div>
    <div class="form-group">
      <label for="author">著者名</label>
      <input type="text" name="author" class="form-control" placeholder="J.K.ローリング" value="<%= book.getAuthor() %>"/>
    </div>
    <div class="form-group">
      <label for="isbn">ISBN</label>
      <input type="number" name="isbn" class="form-control" placeholder="000000" value="<%= book.getIsbn() %>"/>
    </div>
  </div>
  <input type="submit" value="更新" class="btn btn-primary"/>
</form>
<%}%>
<%@include file="../layouts/footer.html"%>
