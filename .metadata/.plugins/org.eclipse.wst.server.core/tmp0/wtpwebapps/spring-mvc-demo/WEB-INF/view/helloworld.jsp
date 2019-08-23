<!DOCTYPE html> <!-- Defines the document type --> 

<html> <!--  Defines an html document -->
	
	<body> <!-- Defines the body element of page -->
	
		Hello World of Spring!
		
		<br> <br> <!-- Inserts 2 break lines -->
		
		Student name: ${param.studentName} <!-- studentName is the variable name from helloworld-form.jsp -->
		
		<br> <br> <!-- Inserts 2 break lines -->
		
		The message: ${message} <!-- going to access the attribute from the model -->
		
	</body>
	
</html>