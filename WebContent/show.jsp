<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn" %>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<script type="text/javascript" src="jquery.js"></script>
<script type="text/javascript">
$(function () {
  
    $(".trcontent").hover(function(){
            $(this).css("background-color","cornsilk")
        },function(){
            $(this).css("background-color","white")
        })
        $(".del").click(function(){
        	var c= $(this).parent().siblings(".id").html()
        if (confirm("确认要删除？")) {
        	 window.location="del?id="+c;
        }
        })
        $("#del_some").click(function(){
        	var check = $("input:checked");
            if(check.size()==0){
                alert("您还没有选中条目")
            }else{
            	$("#form").submit();
            }
        	
        })
        $(".quit").click(function () {
            if(confirm("确定要退出？")){
                window.location="clean"
            }
        })
})
</script>


<body>

<b>您已经登录了${u.logincount }次了</b>
当前登录人数${fn:length(loginmap) }人<br>
<input type="button" style="float: right" value="退出" class="quit">
<form action="del_somebook" method="post" id="form">
<table border="1" style="width:100% " align="center">
<caption><font size="5">新华书店</font></caption>
<tr class="trcontent">
<td></td>
<td>编号</td>
<td>书号</td>
<td>书名</td>
<td>价格</td>
<td>作者</td>
<td>操作</td>
</tr>

<c:forEach items="${page.getList() }" var="vo" varStatus="status">
<tr class="trcontent">
<td><input type="checkbox" value="${vo.bookid }" name="id"></td>
<td>${status.count+(page.p-1)*page.pagesize }</td>
<td class="id">${vo.bookid }</td>
<td>${vo.bookname }</td>
<td>${vo.bookprice }</td>
<td>${vo.author }</td>
<td>
<a href="change?id=${vo.bookid}"><input type='button' value='修改'></a>
<input type='button' value='删除' class="del">
</td></tr>
</c:forEach>

</table>
</form>
<div style="float: left">
<a href="add.jsp"><input type="button" value="添加书目"></a>
<input type="submit" value="删除选中条目" id="del_some">
<span>第${page.getP() }页</span>
</div>
<div style="float: right">
<form action="${page.getUrl()}" method="get" id="pagefrom">
<input type="hidden" name="p" id="hidden">
</form>
<span>共${page.getCountn() }条记录</span>
    <a class="page" href="javascript:return void(0)" value="1"><input type="button" value="首页"></a>
    <c:if test="${page.getP()+1<=page.countpage() }">
    <a class="page" href="javascript:return void(0)" value=${page.getP()+1 }   ><input type="button" value="下一页"></a>
    </c:if>
    <c:if test="${page.getP()-1>0 }">
    <a class="page" href="javascript:return void(0)" value=${page.getP()-1 }><input type="button" value="上一页"></a>
    </c:if>
    <a class="page" href="javascript:return void(0)" value=${page.countpage() }><input type="button" value="最后一页"></a>
</div>


<script type="text/javascript">
$(function(){
	$(".page").click(function(){
		$("#hidden").val($(this).attr("value"))
		$("#pagefrom").submit();
	})
})

</script>

</body>
</html>