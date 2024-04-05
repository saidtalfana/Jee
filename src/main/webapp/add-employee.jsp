<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
</head>
<body>
    <form action="AddEmployeeServlet" method="post">
        <label>Nom:</label><br>
        <input type="text" name="nom"><br>
        <label>Email:</label><br>
        <input type="email" name="email"><br>
        <label>Numéro de téléphone:</label><br>
        <input type="text" name="numeroTelephone"><br>
        <label>Département:</label><br>
        <input type="text" name="departement"><br>
        <label>Poste:</label><br>
        <input type="text" name="poste"><br>
        <input type="submit" value="Ajouter">
    </form>
</body>
</html>
