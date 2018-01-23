<%@page contentType="text/html; charset=UTF-8"%>

<%@include file="../layouts/header.jsp"%>

<h1>書籍編集</h1>

<form>
  <div class="form-group">
    <label for="bookname">書名: </label>
    <input type="bookname" class="form-control" id="bookname">
  </div>
  <div class="form-group">
    <label for="pwd">著者: </label>
    <input type="password" class="form-control" id="pwd">
  </div>
  <div class="checkbox">
    <label><input type="checkbox"> Remember me</label>
  </div>
  <button type="submit" class="btn btn-default">Submit</button>
</form>

<%@include file="../layouts/footer.jsp"%>
