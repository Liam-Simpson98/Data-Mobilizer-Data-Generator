<%-- 
    Document   : runPage
    Created on : 2-Feb-2021, 2:30:35 PM
    Author     : Trevor Parlee
--%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link type="text/css" rel="stylesheet" href="css/TrialStyle.css">
        <link rel="preconnect" href="https://fonts.gstatic.com">
        <link href="https://fonts.googleapis.com/css2?family=Russo+One&display=swap" rel="stylesheet">
        <title>Data Generator</title>
    </head>
    <body>
        <form method="post" action="run">
            <div class="container">
                <header>
                    <img class='logo' src='<c:url value="/css/TRIG-logo-web (1).jpg"></c:url>'/>
                        <h1>Data Generator </h1>
                    </header>
                    <div class="train">
                        <img class='train' src='<c:url value="/css/Train (2).png"></c:url>' />  
                    </div>
                    <div class="middle">
                        <div class="text"> 
                            <input class="button" type="submit" value="Run" name="run">
                        </div>
                    </div>
                </div>
            </form>
            <p class="text">${buttonPress}</p>
    </body>
</html>
