<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>显示所有学生数据</title>
</head>
<body>
欢迎《${name}》登录
<table border="1">
    <tr>
        <td>ID</td>
        <td>姓名</td>
        <td>性别</td>
    </tr>

<#list lists as student >

    <tr>
        <td>${student.id}</td>
        <td>${student.studentName}</td>
        <td>${student.sex}</td>
    </tr>
</#list>

</table>


</body>
</html>