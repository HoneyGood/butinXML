<#import "macros/standart.ftl" as standart>
<#import "macros/navbar.ftl" as navbar>
<@standart.standart>
    <@navbar.navbar/>
    <div class="container">
        <table class="table table-striped table-bordered" cellspacing="0" width="100%" id="proxylisttable"
        >
            <thead>
            <tr>
                <th>Номер семестра</th>
                <th>Начало семестра</th>
                <th>Дисциплина</th>
                <th>Сокращеное название контролей</th>
                <th>Вид контролей</th>
                <th>Код направления</th>
                <th>Профиль</th>

            </tr>
            </thead>
            <tbody>
            <#list kontr_sem as kontr_s>
                <tr>
                    <td>${kontr_s.semestry.nomer!}</td>
                    <td>${(kontr_s.semestry.nach)!}</td>
                    <td>
                        ${kontr_s.disc_plana.nazv}:
                        <small>${kontr_s.disc_plana.shifr}</small>
                    </td>
                    <td>
                        <#list kontr_s.vidy_kontrs as vd>
                            <p>${vd.sokr_nazv}</p>
                        </#list>
                    </td>
                    <td>
                        <#list kontr_s.vidy_kontrs as vd>
                            <p>${vd.nazv}</p>
                        </#list>
                    </td>
                    <td>${(kontr_s.disc_plana.napr)!}</td>
                    <td>${(kontr_s.semestry.uch_plany.profile)!}</td>

                </tr>
            </#list>
            </tbody>
            <tfoot>
            <tr>
                <th></th>
                <th></th>
                <th></th>
                <th></th>
                <th></th>
                <th></th>
                <th><input type="text"/></th>

            </tr>
            </tfoot>
        </table>


    </div>
</@standart.standart>