package servlets;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import managers.generateExcel;

/**
 * Test Vector.
 * 
 * @author Trevor Parlee
 * @version March 4, 2021
 */
public class RunPageServlet extends HttpServlet {

    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request.
     * @param response servlet response.
     * @throws javax.servlet.ServletException when occur error.
     * @throws java.io.IOException when occur error.
     */ 
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        getServletContext().getRequestDispatcher("/WEB-INF/runPage.jsp").forward(request, response);
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request.
     * @param response servlet response.
     * @throws javax.servlet.ServletException when occur error.
     * @throws java.io.IOException when occur error.
     */ 
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        String carID = request.getParameter("carID");

        generateExcel car = new generateExcel(carID);

        String jsonString = car.generateJSON();
        int responseCode = car.postRequest(jsonString);

        if (responseCode == 200) {
            request.setAttribute("buttonPress", "Data Generated");
        } else {
            request.setAttribute("buttonPress", "Error! Response code:" + responseCode);
        }

        getServletContext().getRequestDispatcher("/WEB-INF/runPage.jsp").forward(request, response);

    }
}
