<#import "macros/standart.ftl" as standart>
<@standart.standart>
    <#if message??>
        <h1 class="text-centered">Start page</h1>
        ${message}, Guest
    </#if>
</@standart.standart>
