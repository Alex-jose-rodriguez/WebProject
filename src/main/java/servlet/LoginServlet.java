package servlet;

import beans.LoginBean;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet("/LoginServlet")// Instruccion al .jsp
//@WebServlet(name = "/add", urlPatterns = {"/add"})// Instruccion al .jsp
public class LoginServlet extends HttpServlet {
    private static final long serialVersionUID=1L;

    public LoginServlet(){
        super();
    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
    this.getServletContext().getRequestDispatcher("/root/index.jsp").forward(request, response);
        /*response.sendRedirect("/html/root/index.jsp");
        System.out.println("hola");*/
        //response.sendRedirect("/root/index.jsp");
    /*response.setContentType("test/html");
    response.setCharacterEncoding("UTF-8");
    PrintWriter out = response.getWriter();
        out.println("Test");*/
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        /*this.getServletContext().getRequestDispatcher("/html/root/index.jsp").forward(request, response);
        response.sendRedirect("/webapp/WEB-INF/html/root/index.jsp");
        System.out.println("hola2");*/
        /*String resultat;
        LoginBean form = new LoginBean();
        form.verifyIdentification(request);
        if (form.isValid()){
            response.sendRedirect("index.jsp");
            resultat= "Identifiants incorrects !";}
        else{
            response.sendRedirect("home.jsp");
            resultat= "Vous êtes bien connecté !";}*/

    }
}