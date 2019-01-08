<#macro filesender>
<div class="wrapper">
    <form enctype="multipart/form-data" action="/sendfile" method="post" class="form-file"  >
    <div class="form-group">
        <h1 class="text-center">File sender</h1>
        <input type="file" class="form-control-file" name="file" accept="text/xml" required>
    </div>
    <input type="hidden" name="_csrf" value="${_csrf.token}">
    <button type="submit" class="btn btn-primary btn-block">Submit</button>
</form>
</div>
</#macro>