<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<!DOCTYPE html>

<html>

	<head>
	
		<title>Student Confirmation</title>
		
	</head>
	
	<body>
		The student is confirmed: ${student.firstName} ${student.lastName}
		<!-- Will call student.getFirstName() and student.getLastName() -->
	
		<br><br>
		
		Country: ${student.country} <!-- will call student.getCountry() -->
	
		<br> <br>
		
		Favorite Language: ${student.favoriteLanguage}
		
		<br> <br>
		
		Operating Systems: 
		
		<!-- Bullet List -->
		<ul>
			<!-- Loop through the array -->
			<c:forEach var="temp" items="${student.operatingSystems}">
			
			<!-- What to display -->
			<li> ${temp} </li>
			
			</c:forEach>
			
		</ul>
		
	</body>
	
</html>