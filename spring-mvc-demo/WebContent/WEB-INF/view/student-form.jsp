<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<!DOCTYPE html>

<html>

	<head>
	
		<title>Student Registration Form</title>
	
	</head>
	
	<body>
	
		<form:form action="processForm" modelAttribute="student">
		
		First name: <form:input path="firstName"/> <!-- firstName = Property of student class -->
		
		<br> <br>
		
		Last name: <form:input path="lastName"/> <!-- lastName = Property of Student class -->
		
		<br><br>
		
		Country: <form:select path="country"> <!-- drop down list -->
				<!-- Values for drop down list -->
				<form:options items="${student.countryOptions}"/>
				<!-- FOR INDIVIDUAL OPTIONS == 
					<form:option path="" value=""/> -->
				
				</form:select>
		
		<br> <br>
		
		Favorite Programming Languages: 
			<form:radiobuttons path="favoriteLanguage" items="${student.favoriteLanguageOptions}"/>
			
			
		<!-- FOR INDIVIDUAL RADIO BUTTONS == 
			Name <form:radiobutton path="" value=""/>-->
		
		<br> <br>
		
		Operating Systems: 
		Linux <form:checkbox path="operatingSystems" value="Linux"/>
		Mac OS <form:checkbox path="operatingSystems" value="Mac Os"/>
		MS Windows <form:checkbox path="operatingSystems" value="MS Windows"/>
		
		<br> <br>
		
		<input type="submit" value="Submit"/>
		<!-- Spring will call setFirstName() -->
		<!-- Spring will call setLastName() -->
		
		</form:form>
	</body>

</html>