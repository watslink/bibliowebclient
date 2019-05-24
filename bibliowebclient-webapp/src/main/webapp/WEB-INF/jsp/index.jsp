<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8" %>
<%@include file="include/taglibs.jsp" %>
<html>
<%@include file="include/head.jsp" %>
<body>
<%@include file="include/header.jsp" %>
<%@include file="include/menu.jsp" %>
<div class="container">
    <h2 class="accueil">Bonjour ${utilisateurConnecte.pseudo}</h2>
    <p class="accueil"><strong>Bienvenue sur liste de la bibliothèque de votre ville</strong></p>
</div>
<%@include file="include/footer.jsp" %>
</body>
</html>
