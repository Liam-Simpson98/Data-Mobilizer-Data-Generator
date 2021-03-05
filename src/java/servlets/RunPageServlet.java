package servlets;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import managers.generateExcel;

public class RunPageServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        getServletContext().getRequestDispatcher("/WEB-INF/runPage.jsp").forward(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
        generateExcel obj = new generateExcel();
        String jsonString = obj.generateJSON();
        int responseCode = obj.postRequest(jsonString);
        
        if (responseCode == 200) {
            request.setAttribute("buttonPress", "Data Generated");
        } else {
            request.setAttribute("buttonPress", "Error! Response code:" + responseCode);
        }

        getServletContext().getRequestDispatcher("/WEB-INF/runPage.jsp").forward(request, response);
    }

}
