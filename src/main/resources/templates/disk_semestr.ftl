<#import "macros/standart.ftl" as standart>
<#import "macros/navbar.ftl" as navbar>
<@standart.standart>
    <@navbar.navbar/>
    <div class="container">
        <table class="table table-striped table-bordered" cellspacing="0" width="100%" id="proxylisttable"
        >
            <thead>
            <tr>
                <th>pract</th>
                <th>id</th>
                <th>lab</th>
                <th>kontr</th>
                <th>srs</th>
                <th>sem_id</th>
                <th>lect</th>
                <th>disk_id</th>

            </tr>
            </thead>
            <tbody>
            <#list disk_semestry as semestr>
                <tr>
                    <td>${semestr.pract!}</td>
                    <td>${semestr.id!}</td>
                    <td>${semestr.lab!}</td>
                    <td>${semestr.kontr!}</td>
                    <td>${semestr.srs!}</td>
                    <td>${(semestr.disc_plana.napr)!}</td>
                    <td>${semestr.lect!}</td>
                    <td>${(semestr.semestry.nach)!}</td>
                </tr>
            </#list>
            </tbody>
            <tfoot>
            <tr>
                <th class="input"><input type="text"/></th>
                <th class="input"><input type="text"/></th>
                <th class="input"></th>
                <th class="input"></th>
                <th class="input"></th>
                <th class="input"></th>
                <th class="input"></th>
                <th class="input"></th>
            </tr>
            </tfoot>
        </table>



    </div>
</@standart.standart>