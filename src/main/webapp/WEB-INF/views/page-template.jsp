<%@ page pageEncoding="UTF-8" contentType="text/html; charset=UTF-8" %>
<%@ page session="false" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<!DOCTYPE html>
<html>
<head>
    <meta charset="utf8"/>
    <title>AkvelonTestTask</title>

    <script type="text/javascript" src="<c:url value="/resources/javascript/jquery-1.10.2.min.js" />"></script>
    <script type="text/javascript" src="<c:url value="/resources/javascript/webtest.js" />"></script>
    <link rel="stylesheet" type="text/css" href="<c:url value="/resources/CSS/reset.css" />"/>
    <link rel="stylesheet" type="text/css" href="<c:url value="/resources/CSS/style.css" />"/>

    <script>
            var context = "${CONTEXT}";
    </script>
</head>

<body>
<div class="container">
    <jsp:include page="${currentPage}" flush="true"/>
</div>
</body>
</html>
