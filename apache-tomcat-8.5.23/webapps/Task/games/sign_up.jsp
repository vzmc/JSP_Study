<%@page contentType="text/html; charset=UTF-8"%>
<%@include file="../layouts/header.html"%>

<h2>SignUp</h2>
<form action="SignUp.action" method="post">
    <div class="well">
        <div class="form-group">
            <label for="name">ユーザー名</label>
            <input type="text" name="name" class="form-control" placeholder="name">
        </div>
        <div class="form-group">
            <label for="password">パスワード</label>
            <input type="password" name="password" class="form-control" placeholder="password">
        </div>
        <div class="form-group">
            <label for="address">住所</label>
            <input type="text" name="address" class="form-control" placeholder="住所">
        </div>
        <div class="form-group">
            <label for="telnumber">電話番号</label>
            <input type="number" name="telnumber" class="form-control" placeholder="電話番号">
        </div>
    </div>
    <input type="submit" value="SignUp" class="btn btn-info">
</form>

<%@include file="../layouts/footer.html"%>
