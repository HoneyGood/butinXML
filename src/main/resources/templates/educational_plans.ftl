<#import "macros/standart.ftl" as standart>
<#import "macros/navbar.ftl" as navbar>
<@standart.standart>
    <@navbar.navbar/>
    <div class="container">
        <table class="table table-striped table-bordered" cellspacing="0" width="100%" id="proxylisttable"
        >
            <thead>
            <tr>
                <th>profile</th>
                <th>institut</th>
                <th>forma</th>
                <th>fgos_id</th>
                <th>data_utv_opo</th>
                <th>data_utver</th>
                <th>god_nabora</th>
                <th>id</th>
                <th>nom_protokola</th>
                <th>prik_utv_opop</th>

            </tr>
            </thead>
            <tbody>
            <#list educational_plans_table as plans>
                <tr>
                    <td>${plans.profile!}</td>
                    <td>${plans.institut!}</td>
                    <td>${plans.forma!}</td>
                    <td><#list plans.disc_planas as dp>
                        <span>${dp.napr}</span>
                    </#list></td>
                    <td>${plans.data_utv_opo!}</td>
                    <td>${plans.data_utver!}</td>
                    <td>${plans.god_nabora!}</td>
                    <td><#list plans.semestries as ls>
                            <span>${ls.nach!}</span>
                        </#list>
                    </td>

                    <td>${plans.nom_protokola!}</td>
                    <td>${plans.prik_utv_opop!}</td>
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
            </tr>
            </tfoot>
        </table>


    </div>
</@standart.standart>