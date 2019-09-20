<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
        <title></title>
        <%@include file="WEB-INF/view/include/hearder.jsp" %>
<script type="text/javascript">
	function focusObj(id){
		id.style.backgroundColor="#FFCC80"
	}
	function userNameBlur(id){
		var name=id.value
		var nameD=document.getElementById("nameDiv")
		var reg = /^\w{3,30}$/;  //长度为大于3位小于30位的字符串
		if(!reg.test(name)){
			nameD.innerHTML = "用户名最大长度为30的字母，数字，下划线！"
			return false
		}
		id.style.backgroundColor="#FFF"
		nameD.innerHTML = "√"
		nameD.style.color = "green"
		return true
	}
	function pswBlur(id){
		var pwd =id.value
		var pswD=document.getElementById("pswDiv");
		var reg = /^\w{3,30}$/;  //长度为大于3位小于30位的字符串
		if(!reg.test(pwd)){
			pswD.innerHTML = "密码最大长度为30的字母，数字，下划线！"
			return false
		}
		id.style.backgroundColor="#FFF"
		pswD.innerHTML = "√"
		pswD.style.color = "green"
		return true	
	}

	//jQuery提交
	$(function(){
		$("#smit").click(function(){
			$("#loginForm").submit();
		})
		$("#imgv").click(function(){
			this.attr("src","${pageContext.request.contextPath}/admin/imageValidateAction.do");
		})
	})	
</script>
</head>
<body class="index">
	<div class="login_box">
		<form action="${pageContext.request.contextPath}/login" method="post" id="loginForm">
            		<span class="required">${erroMsg }</span>
            <table>
                <tr>
                    <td class="login_info">账号：</td>
                    <td colspan="2"><input name="acname" type="text" class="width150" id="name" onfocus="focusObj(this)" onblur="userNameBlur(this)" /></td>
                    <td class="login_error_info"><div id="nameDiv" class="required"></div></td> 
                </tr>
                <tr>
                    <td class="login_info">密码：</td>
                    <td colspan="2"><input name="apwd" type="password" class="width150" id="psw" onfocus="focusObj(this)" onblur="pswBlur(this)" /></td>
                     <td><div class="required" id="pswDiv"></div></td> 
                </tr>
                <tr>
                    <td class="login_info">验证码：</td>
                    <td class="width70"><input name="valicode" type="text" class="width70" /></td>
                    <td><img id="imgv" src="${pageContext.request.contextPath}/admin/imageValidateAction.do" alt="验证码" title="点击更换" /></td>  
                    <td><span class="required">验证码错误</span></td>              
                </tr> 
                <tr>
                    <td></td>
                    <td class="login_button" colspan="2">
                          <a id="smit">
                          <img src="assets/images/login_btn.png" /></a></td>    
                    <td><span class="required"></span></td>                
                </tr>
            </table>
            </form>
        </div>
	
</body>
</html>