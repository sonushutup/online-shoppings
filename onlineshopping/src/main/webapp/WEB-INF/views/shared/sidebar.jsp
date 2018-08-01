 <%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
 <h1 class="my-4">Shop Name</h1>
          <div class="list-group">
         
          <c:forEach items="${Category}" var="Category">
            <a href="#" class="list-group-item">${Category.name}</a>
            </c:forEach>
          </div>