<%@page contentType="text/html; charset=UTF-8"%>

<%@include file="../layouts/header.html"%>

<%@page isErrorPage = "true"%>

<h2>エラーが発生しました。</h2>

<p>数字のみを入力してください</p>
<hr/>
<pre>
    <%=exception%>
</pre>

<%@include file="../layouts/footer.html"%>
