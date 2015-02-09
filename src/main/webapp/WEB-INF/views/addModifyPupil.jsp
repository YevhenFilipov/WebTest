<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page pageEncoding="UTF-8" contentType="text/html; charset=UTF-8" %>

<h1>
    <c:choose>
        <c:when test="${ADD_PUPIL_PAGE eq 1}">
            Add new pupil data
        </c:when>
        <c:otherwise>
            Edit current pupil data
        </c:otherwise>
    </c:choose>
</h1>

<div>
    <c:choose>
    <c:when test="${ADD_PUPIL_PAGE eq 1}">
    <form id="pupil" action="${CONTEXT}/addpupil.html" method="POST">
        </c:when>
        <c:otherwise>
        <form id="pupil" action="${CONTEXT}/editpupil.html" method="POST">
            </c:otherwise>
            </c:choose>

                <fieldset>
                    <legend>Pupil data:</legend>
                    <input type="hidden" id="id" name="id" value="${pupil.id}">
                    <p>
                        <label for="first_name">First name</label><br/>
                        <input id="first_name" name="first_name" type="text" value="${pupil.firstName}"/>
                    </p>
                    <p>
                        <label for="last_name">Last name</label><br/>
                        <input id="last_name" name="last_name" type="text" value="${pupil.lastName}"/>
                    </p>
                    <p>
                        <label for="birthday">Birthday (available pattern: yyy-MM-dd)</label><br/>
                        <input id="birthday" name="birthday" type="text" value="${pupil.birthday}"/>
                    </p>
                    <p>
                        <label for="class_phase">Year of education</label><br/>
                        <input id="class_phase" name="class_phase" type="text" value="${pupil.classPhase}"/>
                    </p>
                    <p>
                        <label for="class_group">Group</label><br/>
                        <input id="class_group" name="class_group" type="text" value="${pupil.classGroup}"/>
                    </p>
                    <input class="button" type="submit"  value="<c:choose><c:when test="${ADD_PUPIL_PAGE eq 1}">Add</c:when><c:otherwise>Save</c:otherwise></c:choose>">
                    <input class="button" type="button" value="Cancel" onclick="location.href='${CONTEXT}/pupillist.html'">
                </fieldset>
        </form>
</div>
