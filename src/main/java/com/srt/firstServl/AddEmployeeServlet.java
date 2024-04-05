import java.io.IOException;
import java.util.ArrayList;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/AddEmployeeServlet")
public class AddEmployeeServlet extends HttpServlet {
    private static final long serialVersionUID = 1L;
    private ArrayList<Employee> employees = new ArrayList<>();

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String nom = request.getParameter("nom");
        String email = request.getParameter("email");
        String numeroTelephone = request.getParameter("numeroTelephone");
        String departement = request.getParameter("departement");
        String poste = request.getParameter("poste");

        Employee employee = new Employee(nom, email, numeroTelephone, departement, poste);
        employees.add(employee);

        response.sendRedirect("employee-list.jsp");
    }
}
