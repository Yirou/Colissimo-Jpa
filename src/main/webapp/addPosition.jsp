<jsp:include page="header.jsp"/>
<div id="page-wrapper">

    <div class="container-fluid">
        <div class="row">
            <a href="package-list" class="btn btn-info">Liste des colis</a>
            <hr>

            <form action="add-position"method="POST">
                <div class="row col-sm-12 col-lg-12 col-sm-12 col-xs-12 mon-container">
                    <input value="<%= request.getAttribute("idColis")%>" name="idColis" type="hidden"/>
                    <label for="longitude">Longitude:</label>
                    <input name="longitude" placeholder="Longitude" class="form-control"/>
                    <label for="latitude">Latitude:</label>
                    <input name="latitude" placeholder="Latitude" class="form-control"/>
                    <label for="Ville">Ville:</label>
                    <input name="ville" placeholder="Ville" class="form-control"/>
                    <label for="etat">Etat</label>
                    <select name="etat" class="form-control">
                        <option>Enregistrement</option>
                        <option>En attente</option>
                        <option>En acheminement</option>
                        <option>Bloqué</option>
                        <option>Livré</option>
                    </select>

                    <br>
                    <input class="btn btn-info "value="Valider" name="action" type="submit"/>
                </div>
            </form>
        </div>
    </div>

</div>
<!-- /#page-wrapper -->


 <jsp:include page="footer.jsp"/>