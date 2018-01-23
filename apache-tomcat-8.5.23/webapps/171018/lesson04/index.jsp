<%@ page contentType="text/html; charset=UTF-8" %>
<%@ include file="../parts/header.html" %>
<h1>「式」のテスト</h1>
<p>"＜％" "％＞"の内側はJAVAが表示される</p>

<h4>スクリプトレットの場合</h4>
<% out.println(new java.util.Date()); %>

<hr>
<h4>式の場合</h4>
<%= new java.util.Date() %>
<%@ include file="../parts/footer.html" %>
