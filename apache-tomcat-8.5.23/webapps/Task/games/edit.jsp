<%@page contentType="text/html; charset=UTF-8"%>

<%@include file="../layouts/header.jsp"%>

<%@page import="bean.Game" %>

<% Game game = (Game)request.getAttribute("game"); %>
<h1>ゲーム商品の編集</h1>
<form action="Update.action" method="post">
    <div class="well">
        <div class="form-group">
            <label for="ID">ID</label>
            <input type="number" name="id" class="form-control" value=<%= game.getId() %> readonly>
        </div>
        <div class="form-group">
            <label for="title">タイトル</label>
            <input type="text" name="title" class="form-control" value=<%= game.getTitle() %>>
        </div>
        <div class="form-group">
            <label for="price">価格</label>
            <input type="numer" name="price" class="form-control" value=<%= game.getPrice() %>>
        </div>
        <div class="form-group">
            <label for="company">会社名</label>
            <input type="text" name="company" class="form-control" value=<%= game.getCompany() %>>
        </div>
    </div>
    <div>
        <input type="submit" value="更新" class="btn btn-primary"/>
    </div>
</form>

<%@include file="../layouts/footer.jsp"%>
