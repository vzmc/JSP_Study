<%@page contentType="text/html; charset=UTF-8"%>

<%@include file="../layouts/header.html"%>

<div class="container">
    <p>bootstrapのテスト</p>
    <h2>グリッドシステム</h2>
    <div class="row">
        <div class="col-xs-12 col-sm-6 col-md-8">メインコンテンツ</div>
        <div class="col-xs-12 col-sm-6 col-md-4">サイドバー</div>
        <div class="hidden-xs col-sm-6">表示されません</div>
    </div>
    <hr/>
    <h2>テーブルの扱い</h2>
    <table class="table table-striped table-bordered table-hover">
        <tr>
            <th>1</th>
            <td>1-1</td>
            <td>1-2</td>
        </tr>
        <tr>
            <th>2</th>
            <td>2-1</td>
            <td>2-2</td>
        </tr>
        <tr>
            <th>3</th>
            <td>3-1</td>
            <td>3-2</td>
        </tr>
        <tr>
            <th>4</th>
            <td>4-1</td>
            <td>4-2</td>
        </tr>
    </table>

    <hr/>
    <h2>Formの扱い</h2>
    <div class="well">
        <form action="">
            <input type="text"/>
            <div class="form-group">
                <label for="firstName">名前</label>
                <input type="text" class="form-control" name="firstName"/>
            </div>
            <div class="form-group">
                <label for="">お問い合わせ</label>
                <textarea name="" id="" rows="10" cols="10" class="form-control"></textarea>
            </div>
            <div class="form-group">
                <input type="submit" value="送信" class="btn btn-lg btn-success"/>
            </div>
        </form>
    </div>
</div>

<%@include file="../layouts/footer.html"%>
