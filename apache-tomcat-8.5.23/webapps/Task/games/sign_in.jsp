<%@page contentType="text/html; charset=UTF-8"%>
<%@include file="../layouts/header.html"%>

<form action="SignIn.action" method="post">
    <div class="well">
        <div class="form-group">
            <label for="name">ユーザー名</label>
            <input type="text" name="name" class="form-control" placeholder="name">
        </div>
        <div class="form-group">
            <label for="password">パスワード</label>
            <input type="password" name="password" class="form-control" placeholder="password">
        </div>
    </div>
    <input type="submit" value="Login" class="btn btn-success">
</form>


<%@include file="../layouts/footer.html"%>
