<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://www.springframework.org/tags" prefix="spring"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@ page session="false"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Update Employee</title>
<style type="text/css">
	body{
		background-color: pink
	}
</style>
</head>
<body>
	<div align="center">
		<h2>Update employee</h2>

		<form :form action="${pageContext.request.contextPath}/update" method="post" ModelAttribute="employee">

			<table border="1" cellpadding="3">
			

			
				<tr>
					<td width="120"><b>Employee Name</b></td>
					<td><input type="text" name="employeeName" size="45"
						value="<c:out value='${employee.eName}' />" />
					</td>
				</tr>

				<tr>
					<td width="130"><b>Employee Address</b></td>
					<td><input type="text" name="employeeAddress" size="45"
						value="<c:out value='${employee.eAdd}' />" />
					</td>
				</tr>

				<tr>
					<td width="120"><b>Employee Phone</b></td>
					<td><input type="text" name="employeePhone" size="45"
						value="<c:out value='${employee.ePhn}' />" />
					</td>
				</tr>

				<tr>
					<td width="120"><b>Employee Salary</b></td>
					<td><input type="text" name="employeeSalary" size="45"
						value="<c:out value='${employee.esalary}' />" />
					</td>
				</tr>
				
				<tr>
					<td align="center">
            			<input type="submit" value="Update" />
            		</td>
            	
            		<td align="center">
            			<input type="reset" value="Reset" />
            		</td>
				</tr>
			</table>
		</form>
	</div>
</body>

</html>