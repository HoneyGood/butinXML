<#import "macros/standart.ftl" as standart>
<#import "macros/navbar.ftl" as navbar>
<@standart.standart>
    <@navbar.navbar/>
    <div class="container">
        <table class="table table-striped table-bordered" cellspacing="0" width="100%" id="proxylisttable"
        >
            <thead>
            <tr>
                <th>id</th>
                <th>upl_id</th>
                <th>nomer</th>
                <th>nedel</th>
                <th>nach</th>
                <th>okon</th>
                <th>vid</th>
                <th>semestry->diskplana</th>


            </tr>
            </thead>
            <tbody>
            <#list semestrylist as semestry>
                <tr>
                    <td>${(semestry.id)!}</td>
                    <td>${(semestry.uch_plany.profile)!}</td>
                    <td><#list semestry.disk_semestrs as ds>
                        <p>${ds.sem_id}</p>
                    </#list></td>
                    <td>${(semestry.nedel)!}</td>
                    <td>${(semestry.nach)!}</td>
                    <td>${(semestry.okon)!}</td>
                    <td>${(semestry.vid)!}</td>
                    <td><#list (semestry.disc_planas)! as dp>
                        <p>${dp.napr}</p>
                    </#list></td>


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