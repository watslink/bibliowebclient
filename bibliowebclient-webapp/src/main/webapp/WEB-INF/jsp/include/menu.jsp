<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8" %>
<%@ taglib prefix="security" uri="http://www.springframework.org/security/tags" %>
<nav role="navigation" class="navbar-inverse">
    <div class="navbar">
        <div class="navbar-header">
            <button type="button" class="navbar-toggle" data-toggle="collapse" data-target=".navbar-collapse">
                <span class="icon-bar"></span>
                <span class="icon-bar"></span>
                <span class="icon-bar"></span>
            </button>
            <a class="navbar-brand " href="${pageContext.request.contextPath}/">Accueil</a>
        </div>
        <div class="collapse navbar-collapse">
            <ul class="nav navbar-nav">
                        <li><a href="${pageContext.request.contextPath}/liste_livres">Livres</a>
                        </li>
                        <li><a href="${pageContext.request.contextPath}/mes_emprunts">Mes Emprunts</a></li>
            </ul>
            <form class="navbar-form navbar-right inline-form">
                <span class="glyphicon glyphicon-user"> <security:authentication property="principal.username"/> </span>
                <a href="${pageContext.request.contextPath}/logout" class="btn btn-danger"><span
                        class="glyphicon glyphicon-off"></span> Déconnexion </a>
            </form>
        </div>
    </div>
</nav>

