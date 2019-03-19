package Task2;
/**
 * @author Manasa Gottam
 *
 */
import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class SimpleCompoundInterest
 */
@WebServlet("/SimpleCompoundInterest")
public class SimpleCompoundInterest extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public SimpleCompoundInterest() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
		PrintWriter out = response.getWriter();

		int Principle = Integer.valueOf(request.getParameter("principle_amt"));
		float InterestRate = Float.valueOf(request.getParameter("interest_rate"));
		int Time = Integer.valueOf(request.getParameter("time"));
		
		String MaterialStandard = request.getParameter("interest");
		if (MaterialStandard.equals("simple")) {
			out.println("Simple Interest :");
			out.println((Principle*Time*InterestRate)/100);
		}
		if (MaterialStandard.equals("compound")) {
			out.println("Compound Interest :");
			out.println(Principle *(Math.pow((1 + (InterestRate/100)),Time)));
		}
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
