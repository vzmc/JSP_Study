<%@page contentType="text/html; charset=UTF-8"%>

<%@include file="../layouts/header.html"%>

<form action="create" method="post">
    <div>
        <label for="title">書籍名</label>
        <input type="text" name="title"/>
    </div>
    <div>
        <label for="author">著者名</label>
        <input type="text" name="author"/>
    </div>
    <div>
        <label for="isbn">ISBN</label>
        <input type="number" name="isbn"/>
    </div>
    <div>
        <input type="submit" value="新規登録"/>
    </div>
</form>

<%@include file="../layouts/footer.html"%>
