<%-- 
    Document   : liste
    Created on : 8 nov. 2015, 19:03:58
    Author     : Yirou
--%>

<%@page import="java.util.List"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>

<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">

        <link rel=stylesheet type="text/css" href="css/bootstrap.min.css">
        <link rel=stylesheet type="text/css" href="css/sb.css">
        <script src="js/bootstrap.min.js"></script>
        <title>Colissimo</title>
    </head>
    <body>

        <div id="wrapper">

            <!-- Navigation -->
            <nav class="navbar navbar-inverse navbar-fixed-top" role="navigation">
                <!-- Brand and toggle get grouped for better mobile display -->
                <div class="navbar-header">
                    <button type="button" class="navbar-toggle" data-toggle="collapse" data-target=".navbar-ex1-collapse">
                        <span class="sr-only">Toggle navigation</span>
                        <span class="icon-bar"></span>
                        <span class="icon-bar"></span>
                        <span class="icon-bar"></span>
                    </button>
                    <a class="navbar-brand" href="index.html">Colissimo Admin</a>
                </div>
           
                <!-- Sidebar Menu Items - These collapse to the responsive navigation menu on small screens -->
                <div class="collapse navbar-collapse navbar-ex1-collapse">
                    <ul class="nav navbar-nav side-nav">
                        <li class="active">
                            <a href="package-list"><i class="fa fa-fw fa-dashboard"></i>Tableau de bord</a>
                        </li>
                        <li>
                            <a href="package-list"><i class="fa fa-fw fa-bar-chart-o"></i> Liste des colis</a>
                        </li>
                        <li>
                            <a href="suivre-colis"><i class="fa fa-fw fa-table"></i> Suivre un colis</a>
                        </li>

                    </ul>
                </div>
                <!-- /.navbar-collapse -->
            </nav>
