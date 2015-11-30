<%-- 
    Document   : liste
    Created on : 8 nov. 2015, 19:03:58
    Author     : Yirou
--%>


<%@page import="com.logical.colissimos.model.Position"%>
<%@page import="java.util.List"%>
<%@page import="com.logical.colissimos.model.Colis"%>
<jsp:include page="header.jsp"/>
<% List<Colis> colis = (List<Colis>) request.getAttribute("listeColis");%>
<div id="page-wrapper">

    <div class="container-fluid">
        <div class="row">
            <div class=" col-lg-2">
                <form action="add-package"method="POST">
                    <input name="action" class="btn btn-info " value="Ajouter un nouveau colis" type="submit">
                </form>
            </div>
            <div class="col-lg-10">
                <form  role="search" class="navbar-form navbar-right" action="package-list" method="POST">
                    <div class="form-group">
                        <input type="text" class="form-control " placeholder="Indentifiant" name="identifiant">
                    </div>
                    <button type="submit" class="btn btn-info" name="action" value="chercher">Chercher un colis</button>
                </form>
            </div>
        </div>
        <hr>

        <table class="table table-condensed">
            <thead>
                <tr>
                    <th>Numero colis</th>
                    <th>Poids</th>
                    <th>Valeur</th>
                    <th>Date enrégistré</th>
                    <th>Position</th>
                    <th>Origigine</th>
                    <th>Destination</th>
                </tr>
            </thead>
            <tbody>
                <% for (Colis col : colis) {
                        List<Position> positions = col.getMesPositions();
                %>
            <div class="collapse" id="collapseExample<%= col.getId()%>">
                <div class="well">
                    <ul class="list-group">
                        <% for (Position position : positions) {%>

                        <li class="list-group-item">
                            <span class="badge"><%= position.getDate()%></span>
                            <%=position.getEmplacement()%>| <%= position.getEtat()%>
                        </li>
                        <%  }%>
                    </ul>
                </div>
            </div>
            <tr>
                <td><%= col.getIdentifiant()%></td>
                <td><%= col.getPoids()%></td>
                <td><%= col.getValeur()%></td>
                <td><%= col.getDateAjoute()%></td>
                <td><button class="btn btn-success" data-toggle="collapse" data-target="#collapseExample<%= col.getId()%>" aria-expanded="true" aria-controls="collapseExample">Liste position</button></td>
                <td><%= col.getOrigine()%></td>
                <td><%= col.getDestination()%></td>
                <td><a title="delete" href="delete?idColis=<%= col.getId()%>"><i class="glyphicon glyphicon-remove red"></i></a></td>
                <td><a title="Add position" href="add-position?idColis=<%= col.getId()%>"> Ajouter une position <i class="glyphicon glyphicon-pushpin"></i></a></td>

            </tr>

            <% }%>
            </tbody>
        </table>
    </div>

</div>
<!-- /#page-wrapper -->

<!-- /#wrapper -->

<jsp:include page="footer.jsp"/>