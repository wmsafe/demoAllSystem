<!DOCTYPE html>
<html xmlns="http://www.w3.org/1999/xhtml" xmlns:th="http://www.thymeleaf.org"
      xmlns:sec="http://www.thymeleaf.org/thymeleaf-extras-springsecurity3">
<head>
    <meta content="text/html;charset=utf-8"></meta>
    <title>Hello World!</title>
</head>
<body>
    Hello,${user.getUsername()},${message}<br/>
    freemarker的一些用法<br/>
    for:<br/>
    <#list 1..5 as i>
        ${i}
    </#list><br/>

    fore自定义:<br/>
    <#list [1,3,5] as i>
        ${i}
    </#list><br/>

    单独使用if:<br/>
    <#if 2 % 2 == 0 >
        if-success
    </#if><br/>

    循环使用if:<br/>
    <#list 1..10 as i >
        <#if i % 2 = 0 >
            ${i}
        </#if>
    </#list><br/>
</body>
</html>