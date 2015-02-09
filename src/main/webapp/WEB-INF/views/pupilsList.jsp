<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page pageEncoding="UTF-8" contentType="text/html; charset=UTF-8" %>

<h1>
    Pupils list
</h1>

<div>
    <form id="pupil_list" action="${CONTEXT}/pupillist.html" method="POST">
        <table>
            <tr>
                <th></th>
                <th>First name</th>
                <th>Last name</th>
                <th>Birthday</th>
                <th>Year of education</th>
                <th>Group</th>
            </tr>
            <c:forEach var="pupil" items="${pupils}">
                <tr>
                    <td><input id="${pupil.id}" type="checkbox"></td>
                    <td>${pupil.firstName}</td>
                    <td>${pupil.lastName}</td>
                    <td>${pupil.birthday}</td>
                    <td>${pupil.classPhase}</td>
                    <td>${pupil.classGroup}</td>
                </tr>
            </c:forEach>
        </table>
        <div>
            <input class="button" type="button" value="Refresh" onclick="location.href='${CONTEXT}/pupillist.html'">
            <input class="button" type="button" value="Edit" onclick="addModifyPupil()">
            <input class="button" type="button" value="Delete" onclick="deletePupils()">
        </div>
    </form>
</div>
