<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>  
		<div id="navi">
           <ul id="menu">
			<c:forEach items="${admin.lp }" var="priv">
				<li><a href="${pageContext.request.contextPath}${priv.purl }"
					class="${priv.pclass}_off"></a></li>
			</c:forEach>
		</ul> 
        </div>