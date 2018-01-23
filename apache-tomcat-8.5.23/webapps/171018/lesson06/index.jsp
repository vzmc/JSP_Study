<%@ page contentType="text/html; charset=UTF-8" %>
<%@ page import="java.util.*" %>

<%@ include file="../parts/header.html" %>

<h1>メソッドの宣言について</h1>
<p>JSPで＜％！　％＞メソッドや変数をあらかじめ宣言できる</p>
<hr>
<%!
  int add(int a, int b)
  {
    return a + b;
  }
%>
<p>1 + 2 = <%= add(1, 2)%></p>

<%@ include file="../parts/footer.html" %>
