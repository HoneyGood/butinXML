<#import "macros/standart.ftl" as standart>
<#import "macros/navbar.ftl" as navbar>
<@standart.standart>
    <@navbar.navbar/>
    <div class="container">
        <table class="table table-striped table-bordered" cellspacing="0" width="100%" id="proxylisttable"
        >
            <thead>
            <tr>
                <th>Id</th>
                <th>Название</th>
                <th>Краткое название</th>
                <th>Вид контроля</th>
            </tr>
            </thead>
            <tbody>
            <#list vidy_kontr as vidy>
                <tr>
                    <td>${vidy.id!}</td>
                    <td>${vidy.nazv!}</td>
                    <td>${vidy.sokr_nazv!}</td>
                    <td>${vidy.vid_kontr!}</td>
                </tr>
            </#list>
            </tbody>
            <tfoot>
            <tr>
                <th></th>
                <th></th>
                <th></th>
                <th></th>
            </tr>
            </tfoot>
        </table>


    </div>
</@standart.standart>