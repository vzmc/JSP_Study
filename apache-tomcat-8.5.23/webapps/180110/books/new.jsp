<%@page contentType="text/html; charset=UTF-8"%>
<%@include file="../layouts/header.html"%>
<h1>書籍の新規登録</h1>
<form action="create" method="post">
  <div class="well">
    <div class="form-group">
      <label for="title">書籍名</label>
      <input type="text" name="title" class="form-control" placeholder="ハリーポッターと賢者の石"/>
    </div>
    <div class="form-group">
      <label for="author">著者名</label>
      <input type="text" name="author" class="form-control" placeholder="J.K.ローリング"/>
    </div>
    <div class="form-group">
      <label for="isbn">ISBN</label>
      <input type="number" name="isbn" class="form-control" placeholder="000000"/>
    </div>
  </div>
  <input type="submit" value="新規登録" class="btn btn-primary"/>
</form>

<%@include file="../layouts/footer.html"%>
