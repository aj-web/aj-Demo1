<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>    
<!DOCTYPE html>
<html>
        <meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
        <title></title>
        <%@include file="../include/hearder.jsp" %> 
        <script language="javascript" type="text/javascript">
            //显示角色详细信息
            function showDetail(flag, a) {
                var detailDiv = a.parentNode.getElementsByTagName("div")[0];
                if (flag) {
                    detailDiv.style.display = "block";
                }
                else
                    detailDiv.style.display = "none";
            }
            //重置密码
           /*  function resetPwd() {
                alert("请至少选择一条数据！");
                //document.getElementById("operate_result_info").style.display = "block";
            } */
            //删除
            function deleteAdmin() {
                var r = window.confirm("确定要删除此管理员吗？");
                document.getElementById("operate_result_info").style.display = "block";
            }
            //全选
            function selectAdmins(inputObj) {
                var inputArray = document.getElementById("datalist").getElementsByTagName("input");
                for (var i = 1; i < inputArray.length; i++) {
                    if (inputArray[i].type == "checkbox") {
                        inputArray[i].checked = inputObj.checked;
                    }
                }
            }
            
            $(function(){
        		$("#smit").click(function(){
        			$(".m_form").submit();
        		})
        	}) 
        	//下拉菜单
        	
          /*   $('.select_search').change(function () { 
            	
            	location.href="${pageContext.request.contextPath}/admin/searchRoleAction.do?id="+id;
             }) */
             
             function searchAdmin(id){
	             var pid=document.getElementById("selModules").value
	             location.href="${pageContext.request.contextPath}/admin/searchRoleAction.do?id="+pid;
             }
            
           //重置多个
            function resetPwd(id){
            	var count=0;
            	var statue=document.getElementsByName("cbox");
            	for(var i=0;i<statue.length;i++){
	            	if(statue[i].checked){
	            		count=1
	            	}
	            }
           		if(count==0){
           		alert("请至少选择一条数据！");	            			
           		}
	            location.href="${pageContext.request.contextPath}/admin/showChangeInfoAction?id="+id;
            } 
            	
            //修改
            function updateRole(id){
            	location.href="${pageContext.request.contextPath}/admin/showChangeInfoAction?id="+id;
            }
            //删除
            function deleteRole(id) {
            	location.href="${pageContext.request.contextPath}/admin/showChangeInfoAction?id="+id;       	
            }
        </script>       
    </head>
    <body>
        <!--Logo区域开始-->
        <div id="header">
            <img src="${pageContext.request.contextPath}/images/logo.png" alt="logo" class="left"/>
            <a href="${pageContext.request.contextPath}/user/exitAction.do">[退出]</a>            
        </div>
        <!--Logo区域结束-->
        <!--导航区域开始-->
        <%@include  file="../include/navi.jsp" %>  
        <!--导航区域结束-->
        <!--主要区域开始-->
        <div id="main">
            <form action="${pageContext.request.contextPath}/admin/searchRoleAction.do" method="post" class="m_form" >
                <!--查询-->
                <div class="search_add">
                    <div>
					模块： 
					<select id="selModules" class="select_search"  onchange="searchAdmin('${p.pid};')">
						<c:forEach items="${privlist}" var="p">
							<option value="${p.pid}">${p.name}</option>
						</c:forEach>
					</select>
				</div>
                    <div>角色：<input type="text" value="输入角色" class="text_search width200" /></div>
                    <div><input type="button" value="搜索" class="btn_search" id="smit"/></div>
                    <input type="button" value="密码重置" class="btn_add" onclick="location.href='${pageContext.request.contextPath}/admin/setDfPwdAction.do'" />
                    <input type="button" value="增加" class="btn_add" onclick="location.href='${pageContext.request.contextPath}/admin/modiShowAction.do'"/>
                </div>
                <!--删除和密码重置的操作提示-->
                <div id="operate_result_info" class="operate_fail">
                    <img src="${pageContext.request.contextPath}/images/close.png" onclick="this.parentNode.style.display='none';" />
                    <span>删除失败！数据并发错误。</span><!--密码重置失败！数据并发错误。-->
                </div> 
                <!--数据区域：用表格展示数据-->     
                <div id="data">            
                    <table id="datalist">
                        <tr>
                            <th class="th_select_all">
                                <input type="checkbox" onclick="selectAdmins(this);" />
                                <span>全选</span>
                            </th>
                            <th>管理员ID</th>
                            <th>姓名</th>
                            <th>登录名</th>
                            <th>电话</th>
                            <th>电子邮件</th>
                            <th>授权日期</th>
                            <th class="width100">拥有角色</th>
                            <th></th>
                        </tr> 
                        <c:forEach items="${adminlist}" var="ad">                    
                        <tr>
                            <td><input type="checkbox" name="cbox" id="cbox" value="${ad.id}"/></td>
                            <td>${ad.id}</td>
                            <td>${ad.aname}</td>
                            <td>${ad.acname}</td>
                            <td>${ad.atel}</td>
                            <td>${ad.aemail}</td>
                            <td>${ad.creattime}</td>
                            <td>
                                <a class="summary"  onmouseover="showDetail(true,this);" onmouseout="showDetail(false,this);">${ad.roles}</a>
                                <!--浮动的详细信息-->
                                <div class="detail_info">
                             ${ad.roles}       
                                </div>
                            </td>
                            <td class="td_modi">
                                <input type="button" value="修改" class="btn_modify" onclick="updateRole('${ad.id}');"/>
                                <input type="button" value="删除" class="btn_delete" onclick="deleteRole('${ad.id}');" />
                            </td>
                        </tr>
                        </c:forEach>                               
                    </table>
                </div>
                <!--分页-->
                <div id="pages">
        	        <a href="#">上一页</a>
                    <a href="#" class="current_page">1</a>
                    <a href="#">2</a>
                    <a href="#">3</a>
                    <a href="#">4</a>
                    <a href="#">5</a>
                    <a href="#">下一页</a>
                </div>                    
            </form>
        </div>
        <!--主要区域结束-->
        <div id="footer">
          
        </div>
    </body>
</html>
