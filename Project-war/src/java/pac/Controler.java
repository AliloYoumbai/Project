/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pac;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import model.Amelbadani;
import model.Amelmihani;
import model.Amwal;
import model.Chiayni;
import model.Jamia;
import model.Jamiai;
import model.Persone;
import model.Sang;
import tratement.Comand;

/**
 *
 * @author Mr-Alilo
 */
public class Controler extends HttpServlet {

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
   

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs protected void
     * doGet(HttpServletRequest request, HttpServletResponse response) throws
     * ServletException, IOException { // TODO Auto-generated method stub
     *
     * HttpSession ses = request.getSession(false); if(ses==null) {
     * this.getServletContext().getRequestDispatcher("/login.html").forward(request,
     * response);
     *
     * }else {
     *
     * String id = request.getParameter("id"); int idd = Integer.parseInt(id);
     *
     * switch (idd) { case 1:
     * this.getServletContext().getRequestDispatcher("/WEB-INF/profile.jsp").forward(request,
     * response);
     *
     * break; case 3: ArrayList<Persone> liste = null; try { liste = new
     * Comand().getallPersone(); } catch (SQLException e) { // TODO
     * Auto-generated catch block System.out.print(e); }
     * request.setAttribute("liste", liste);
     *
     * this.getServletContext().getRequestDispatcher("/WEB-INF/profile2.jsp").forward(request,
     * response);
     *
     * break; case 5:
     * this.getServletContext().getRequestDispatcher("/WEB-INF/dam.jsp").forward(request,
     * response);
     *
     * break; case 6:
     * this.getServletContext().getRequestDispatcher("/WEB-INF/chiayni.jsp").forward(request,
     * response);
     *
     * break; case 7:
     * this.getServletContext().getRequestDispatcher("/WEB-INF/amelbadani.jsp").forward(request,
     * response);
     *
     * break; case 8:
     * this.getServletContext().getRequestDispatcher("/WEB-INF/amwal.jsp").forward(request,
     * response);
     *
     * break; case 9:
     * this.getServletContext().getRequestDispatcher("/WEB-INF/amelmihani.jsp").forward(request,
     * response);
     *
     * break; case 10: String time = request.getParameter("time"); String typet
     * = request.getParameter("typet"); String place =
     * request.getParameter("place"); String name =
     * request.getParameter("name"); String message =
     * request.getParameter("message");
     *
     * HttpSession session = request.getSession(true);
     *
     * Jamia jam = (Jamia) session.getAttribute("bdnamej"); String namej =
     * jam.getNamej();
     *
     * Jamiai jami = new Jamiai(name,namej,place,typet,time,message); new
     * Comand().savei(jami);
     * this.getServletContext().getRequestDispatcher("/WEB-INF/profile2.jsp").forward(request,
     * response);
     *
     * break;
     *
     * default: break; }
     *
     * }
     * }
     * /
     **
     * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
     * response)
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        // TODO Auto-generated method stub

        HttpSession ses = request.getSession(false);

        if (request.getParameter("test").equals("dam")) {
            Persone persone = (Persone) ses.getAttribute("bdname");

            String time = request.getParameter("time");
            String quantite = request.getParameter("quantite");
            String place = request.getParameter("place");
            String category = request.getParameter("category");

            Sang sg = new Sang(persone.getId(), time, place, quantite, category);

            new Comand().saveSang(sg);

            this.getServletContext().getRequestDispatcher("/WEB-INF/profile.jsp").forward(request, response);

        } else {

            if (request.getParameter("test").equalsIgnoreCase("persone")) {
                String name = request.getParameter("name");
                String lastname = request.getParameter("lastname");
                String city = request.getParameter("city");
                String email = request.getParameter("email");
                String password = request.getParameter("password");
                String tel = request.getParameter("tel");
                Persone sp = new Persone(name, lastname, city, email, password, tel);
                new Comand().save(sp);

                this.getServletContext().getRequestDispatcher("/login.html").forward(request, response);

            } else {
                if (request.getParameter("test").equalsIgnoreCase("jamia")) {
                    String namej = request.getParameter("namej");
                    String city = request.getParameter("city");
                    String email = request.getParameter("email");
                    String password = request.getParameter("password");
                    String tel = request.getParameter("tel");

                    new Comand().savej(namej, city, email, password, tel);

                    this.getServletContext().getRequestDispatcher("/login2.html").forward(request, response);

                } else {
                    if (request.getParameter("test").equalsIgnoreCase("chiayni")) {
                        String chose = request.getParameter("chose");
                        String quantite = request.getParameter("quantite");
                        String time = request.getParameter("time");
                        String place = request.getParameter("place");
                        Persone persone = (Persone) ses.getAttribute("bdname");

                        Chiayni ca = new Chiayni(persone.getId(), chose, quantite, time, place);
                        new Comand().saveChiayni(ca);

                        this.getServletContext().getRequestDispatcher("/WEB-INF/profile.jsp").forward(request,
                                response);

                    } else {
                        if (request.getParameter("test").equalsIgnoreCase("amwal")) {

                            String montant = request.getParameter("montant");
                            String time = request.getParameter("time");
                            String place = request.getParameter("place");
                            Persone persone = (Persone) ses.getAttribute("bdname");

                            Amwal a = new Amwal(persone.getId(), montant, time, place);

                            new Comand().saveAmwal(a);

                            this.getServletContext().getRequestDispatcher("/WEB-INF/profile.jsp").forward(request,
                                    response);

                        } else {
                            if (request.getParameter("test").equalsIgnoreCase("amelmihani")) {
                                String lesjours = request.getParameter("lesjours");
                                String time = request.getParameter("time");
                                String place = request.getParameter("place");
                                Persone persone = (Persone) ses.getAttribute("bdname");

                                Amelmihani am = new Amelmihani(persone.getId(), lesjours, time, place);
                                new Comand().saveAmelmihani(am);

                                this.getServletContext().getRequestDispatcher("/WEB-INF/profile.jsp").forward(request,
                                        response);

                            } else {
                                if (request.getParameter("test").equalsIgnoreCase("amelbadani")) {
                                    String lesjours = request.getParameter("lesjours");
                                    String time = request.getParameter("time");
                                    String place = request.getParameter("place");
                                    Persone persone = (Persone) ses.getAttribute("bdname");

                                    Amelbadani ab = new Amelbadani(persone.getId(), time, lesjours, place);
                                    new Comand().saveAmelbadani(ab);

                                    this.getServletContext().getRequestDispatcher("/WEB-INF/profile.jsp")
                                            .forward(request, response);

                                } else {
                                    if (request.getParameter("test").equalsIgnoreCase("jamiai")) {
                                        String time = request.getParameter("time");
                                        String typet = request.getParameter("typet");
                                        String place = request.getParameter("place");
                                        String name = request.getParameter("name");
                                        String message = request.getParameter("message");

                                        HttpSession session = request.getSession(true);

                                        Jamia jam = (Jamia) session.getAttribute("bdnamej");
                                        String namej = jam.getNamej();

                                        Jamiai jami = new Jamiai(name, namej, place, typet, time, message);
                                        new Comand().savei(jami);
                                        this.getServletContext().getRequestDispatcher("/WEB-INF/profile2.jsp").forward(request, response);

                                    }

                                }
                            }

                        }
                    }
                }

            }
        }
    }

  

}
