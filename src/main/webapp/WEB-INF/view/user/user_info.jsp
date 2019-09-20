<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
        <title></title>
         <%@include file="../include/hearder.jsp" %>
        <script language="javascript" type="text/javascript">
	        $(function(){
	    		$("#smit").click(function(){
	    			$.post({
	    				url: "../../user/updateAdminInfo.do",
	    			   data: $(".main_form").serialize(),
	    			success: function(){
	    				showResult(result);
	    			}
	    			})
	    		})
	    	})	 
        	
            //保存成功的提示信息
            function showResult(msg) {
	        	var m;
	        	if("ok".equals(msg)){
				m="修改成功"
	        	}else{
	        		m="修改失败";
	        	}
	        	$("#save_result_info").text(m);
                showResultDiv(true);
                window.setTimeout("showResultDiv(false);", 3000);	        		
            }
            function showResultDiv(flag) {
            	System.out.printil(22222222222222222222222222222);
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
        <!--主要区域开始-->
        <div id="main">            
            <!--保存操作后的提示信息：成功或者失败-->
            <div id="save_result_info" class="save_success" style="display:none">修改成功</div><!--保存失败，数据并发错误！-->
            <form action="" method="post" class="main_form">
                <div class="text_info clearfix"><span>管理员账号：</span></div>
                <div class="input_info"><input type="text" readonly="readonly" class="readonly" value="${admin.acname }" /></div>
                <div class="text_info clearfix"><span>角色：</span></div>
                <div class="input_info">
                    <input type="text" readonly="readonly" class="readonly width400" value="${admin.lr_String }" />
                </div>
                <div class="text_info clearfix"><span>姓名：</span></div>
                <div class="input_info">
                    <input type="text" value="${admin.aname }" name="aname"/>
                    <span class="required">*</span>
                    <div class="validate_msg_long error_msg"></div>  
                </div>
                <div class="text_info clearfix"><span>电话：</span></div>
                <div class="input_info">
                    <input type="text" class="width200" value="${admin.atel }" name="atel" />
                    <div class="validate_msg_medium"></div>
                </div>
                <div class="text_info clearfix"><span>Email：</span></div>
                <div class="input_info">
                    <input type="text" class="width200" value="${admin.aemail }" name="aemail"/>
                    <div class="validate_msg_medium"></div>
                </div>
                <div class="text_info clearfix"><span>创建时间：</span></div>
                <div class="input_info"><input type="text" readonly="readonly" class="readonly" value="${admin.creattime }"/></div>
                <div class="button_info clearfix">
                    <input type="button" value="保存" class="btn_save" id="smit" />
                    <input type="button" value="取消" class="btn_save" />
                </div>
                <input type="hidden" name="id" value="${admin.id }" />
            </form>  
        </div>
        <!--主要区域结束-->
        <div id="footer">
          
        </div>
    </body>
</html>
