<%@page contentType="text/html; charset=UTF-8"%>

<%@include file="../layouts/header.jsp"%>

<h1>ゲーム商品の新規登録</h1>
<form action="Create.action" method="post">
  <div class="well">
    <div class="form-group">
      <label for="title">タイトル</label>
      <input type="text" name="title" class="form-control" placeholder="タイトル"/>
    </div>
    <div class="form-group">
      <label for="price">価格</label>
      <input type="number" name="price" class="form-control" placeholder="5000"/>
    </div>
    <div class="form-group">
      <label for="company">会社名</label>
      <input type="text" name="company" class="form-control" placeholder="会社名"/>
    </div>
  </div>
  <input type="submit" value="新規登録" class="btn btn-success"/>
</form>

<%@include file="../layouts/footer.jsp"%>
