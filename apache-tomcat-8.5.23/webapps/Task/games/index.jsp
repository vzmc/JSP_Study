<%@page contentType="text/html; charset=UTF-8"%>

<%@include file="../layouts/header.jsp"%>

<%@page import="bean.Game, java.util.List"%>

<% List<Game> games = (List<Game>)request.getAttribute("games"); %>

<div class="panel panel-default">
    <div class="panel-heading">
        <h2>ゲーム商品一覧</h2>
    </div>
    <div class="panel-body">
        <table class="table table-striped">
            <thead>
                <tr>
                    <th>ID</th>
                    <th>タイトル</th>
                    <th>価格(円)</th>
                    <th>会社名</th>
                    <th>編集</th>
                    <th>削除</th>
                </tr>
            </thead>
            <tbody>
                <% for(Game g : games){ %>
                    <tr>
                        <th><%= g.getId() %>    </th>
                        <td><%= g.getTitle() %> </td>
                        <td><%= g.getPrice() %></td>
                        <td><%= g.getCompany() %>  </td>
                        <td><a href=edit?id=<%=g.getId()%> class="btn btn-primary">編集</a></td>
                        <td><a href=Delete.action?id=<%=g.getId()%> class="btn btn-danger">削除</a></td>
                    </tr>
                <% } %>
            </tbody>
        </table>
    </div>
</div>

<a href="new.jsp" class="btn btn-success">新規追加</a>

<%@include file="../layouts/footer.jsp"%>
