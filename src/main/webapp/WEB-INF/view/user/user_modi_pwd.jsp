<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
        <title></title>
         <%@include file="../include/hearder.jsp" %>
        <script type="text/javascript">
	        $(function(){
	    		if('${errorPwdMsg}'!=''){
	    			showResult();
	    		}
	    		$("#smit").click(function(){
	    			$(".main_form").submit();
	    		})
	    	})
	    	//保存成功的提示信息
            function showResult() {
                showResultDiv(true);
                window.setTimeout("showResultDiv(false);", 3000);
            }
            function showResultDiv(flag) {
                if (flag)
                    $("#save_result_info").css("display","block");
                else
                	$("#save_result_info").css("display","none");
            }
        </script>  
    </head>
    <body>
        <!--Logo区域开始-->
        <div id="header">当前用户${admin.aname}
            <img src="${pageContext.request.contextPath}/assets/images/logo.png" alt="logo" class="left"/>
            <a href="${pageContext.request.contextPath}/user/exitAction.do">[退出]</a>            
        </div>
        <!--Logo区域结束-->
        <!--导航区域开始-->
                <%@include  file="../include/navi.jsp" %>
        <!--导航区域结束-->
        <div id="main">      
            <!--保存操作后的提示信息：成功或者失败-->
            <c:if test="${errowPwdMsg!=null }">    
            <div id="save_result_info" class="save_fail" style="display:none">${errorPwdMsg }</div><!--保存失败，旧密码错误！-->
            </c:if>  
            <form action="${pageContext.request.contextPath}/user/updateAction.do" method="post" class="main_form">
                <div class="text_info clearfix"><span>旧密码：</span></div>
                <div class="input_info">
                    <input type="password" class="width200"  name="oldpwd" /><span class="required">*</span>
                    <div class="validate_msg_medium"></div>
                </div>
                <div class="text_info clearfix"><span>新密码：</span></div>
                <div class="input_info">
                    <input type="password"  class="width200" name="newpwd"/><span class="required">*</span>
                    <div class="validate_msg_medium"></div>
                </div>
                <div class="text_info clearfix"><span>重复新密码：</span></div>
                <div class="input_info">
                    <input type="password" class="width200"  name="renewpwd"/><span class="required">*</span>
                    <div class="validate_msg_medium"></div>
                </div>
                <div class="button_info clearfix">
                    <input type="button" id="smit" value="保存" class="btn_save"  />
                    <input type="button" value="取消" class="btn_save" />
                </div>
            </form>  
        </div>
        <!--主要区域结束-->
        <div id="footer">
           
        </div>
    </body>
</html>
