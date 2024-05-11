<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://www.springframework.org/tags" prefix="spring" %>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<style>
	
	body{
		text-align:center;
		back-ground:  aqua;
	}
	.table{
		border=2;
		
	}
</style>
</head>
<body>
	
	<h2>Add Table</h2>
	
	<c:url var="Addaction" value="/add"></c:url>
	
	<form:form action="ToController" method="post" commandName="employee" >
		<div class="table">
			<table border="2" cellpadding="5">
				<tr>
					<td width="100">Employee Name</td>
					<td>
						<input type="text" name="EmployeeName" value="<c:out value=${employee.eName }/>"/>	
					</td>		
				</tr>
				<tr>
					<td width=100> Employee Address</td>
					<td>
						<input type="text" name="Adsress" value= " <c:out value=${employee.eAdd } />"/>
					</td>
				</tr>
				<tr>
					<td width="100">Employee Phone</td>
					<td>
						<input type="text" name="Phone" value="<c:out value=${employee.ePhn }/>"/>
					</td>
				</tr>
				<tr>
					<td width="100"> Employee Salary</td>
					<td>
						<input type="text" name="Salary" value="<c:out value=${employee.esalary }/>"/>
					</td>
				</tr>
					<td align="center" > 
						<input type="submit" value="submit" />
					</td>
					<td align="center"> 
						<input type="submit" value="Reset" />
					</td> 
				<tr>
				</tr>
			</table>
		</div>
	</form:form>

</body>
</html>