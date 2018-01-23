<%@page contentType="text/html; charset=UTF-8"%>

<%@include file="../layouts/header.html"%>

<form action="./show.jsp" method="post">
    <h3>単価と数量を入力してください。</h3>
    <input type="text" name="price">円 x
    <input type="text" name="count">個
    <br/>
    <input type="submit" value="計算">
</form>

<%@include file="../layouts/footer.html"%>
