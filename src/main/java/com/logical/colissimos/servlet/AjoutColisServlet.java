/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.logical.colissimos.servlet;

import com.logical.colissimos.model.dao.iDao.ColisDaoLocal;
import com.logical.colissimos.model.Colis;
import java.io.IOException;
import java.util.Date;
import javax.ejb.EJB;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author yirou
 */
public class AjoutColisServlet extends HttpServlet {

    @EJB
    private ColisDaoLocal dao;

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        String action = request.getParameter("action");
        if (action != null) {
            if (action.equalsIgnoreCase("Valider")) {
                System.out.println(request.getParameter("identifiant") + "" + request.getParameter("poids") + "" + request.getParameter("valeur") + "" + request.getParameter("origine") + "" + request.getParameter("destination"));

                String identifiant = (request.getParameter("identifiant"));
                float poids = Float.parseFloat(request.getParameter("poids"));
                double valeur = Double.parseDouble(request.getParameter("valeur"));
                String origine = request.getParameter("origine");
                String destination = request.getParameter("destination");
                Colis colis = new Colis(identifiant, poids, valeur, origine, destination, new Date(), null);
                dao.add(colis);
                request.setAttribute("isValid", true);
                request.setAttribute("listeColis", dao.getAll());
                System.out.println("colis bien ajouté");
//                getServletContext().getRequestDispatcher("/liste.jsp").forward(request, response);

            }
        }

        getServletContext().getRequestDispatcher("/add.jsp").forward(request, response);

    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
