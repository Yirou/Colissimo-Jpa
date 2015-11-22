/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.logical.colissimos.servlet;

import com.logical.colissimos.model.Colis;
import com.logical.colissimos.model.Position;
import com.logical.colissimos.model.dao.PositionDaoLocal;
import com.logical.colissimos.model.dao.iDao.ColisDaoLocal;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Date;
import javax.ejb.EJB;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author Yirou
 */
public class AjoutPositionServlet extends HttpServlet {

    @EJB
    ColisDaoLocal dao;
    @EJB
    PositionDaoLocal positionDao;

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
                System.out.println("Ajout position");
                double latitude = Double.parseDouble(request.getParameter("latitude"));
                double longitude = Double.parseDouble(request.getParameter("longitude"));
                String emplacement = request.getParameter("ville");
                String etat = request.getParameter("etat");
                Colis colis = dao.getColis(Integer.parseInt(request.getParameter("idColis")));
                Position position = new Position(latitude, longitude, emplacement, etat,new Date());
                position.setColis(colis);
                positionDao.add(position);
                colis.getMesPositions().add(position);
                dao.update(colis);
                request.setAttribute("isValid", true);
            }
        }
//        String url = request.getRequestURL().toString();

        request.setAttribute("idColis", Integer.parseInt(request.getParameter("idColis")));
        System.out.println(request.getAttribute("idColis"));
        getServletContext().getRequestDispatcher("/addPosition.jsp").forward(request, response);
//        Colis colis=dao.getColis(id);
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
