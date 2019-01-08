<#import "macros/standart.ftl" as standart>
<#import "macros/filesender.ftl" as filesender>
<@standart.standart>

    <div class="container text-center">
        <h1>Start page</h1>
        <#if message??>
            ${message}
        </#if>
    </div>
    <@filesender.filesender/>

</@standart.standart>
