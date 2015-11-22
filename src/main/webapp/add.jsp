<jsp:include page="header.jsp"/>
            <div id="page-wrapper">

                <div class="container-fluid">
                    <div class="row">
                        <a href="package-list" class="btn btn-info">Liste des colis</a>
                        <hr>

                        <form action="add-package"method="POST">
                            <div class="row col-sm-12 col-lg-12 col-sm-12 col-xs-12 mon-container">
                                <label for="identifiant">Identifiant:</label>
                                <input name="identifiant" placeholder="Identifiant" class="form-control"/>
                                <label for="poids">Poids:</label>
                                <input name="poids" placeholder="Poids" class="form-control"/>
                                <label for="Valeur">Valeur:</label>
                                <input name="valeur" placeholder="Valeur" class="form-control"/>
                                <label for="origine">Origine</label>
                                <input name="origine" placeholder="Origine" class="form-control"/>
                                <label for="destination">Destination:</label>
                                <input name="destination" placeholder="destination" class="form-control"/>
                                <br>
                                <input class="btn btn-info "value="Valider" name="action" type="submit"/>
                            </div>
                        </form>
                    </div>
                </div>

            </div>
            <!-- /#page-wrapper -->
            <jsp:include page="footer.jsp"/>