<#import "macros/standart.ftl" as standart>
<#import "macros/navbar.ftl" as navbar>
<@standart.standart>
    <@navbar.navbar/>
    <div class="container">
        <table class="table table-striped table-bordered" cellspacing="0" width="100%" id="proxylisttable"
        >
            <thead>
            <tr>
                <th>upl_id</th>
                <th>id</th>
                <th>forma</th>
                <th>annot</th>
                <th>kaf_id</th>
                <th>kontr</th>
                <th>srs</th>
                <th>nazv</th>
                <th>napr</th>
                <th>shifr</th>
                <th>disk_plana->semestr</th>


            </tr>
            </thead>
            <tbody>
            <#list disc_plana as plans>
                <tr>
                    <td>${plans.uch_plany.profile!}</td>
                    <td>${plans.id!}</td>
                    <td>${plans.forma!}</td>
                    <td>${plans.annot!}</td>
                    <td>${plans.kaf_id!}</td>
                    <td><#list plans.disk_semestrs as ds>
                        <p>${(ds.semestry.nach)!}</p>
                    </#list></td>
                    <td>${plans.srs!}</td>
                    <td>${plans.nazv!}</td>
                    <td>${plans.napr!}</td>
                    <td>${plans.shifr!}</td>
                    <td>${(plans.semestry.nach)!}</td>

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
                <th class="input"></th>
                <th class="input"></th>
                <th class="input"></th>

            </tr>
            </tfoot>
        </table>



    </div>
</@standart.standart>