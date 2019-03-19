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
 * Servlet implementation class HouseConstructioncost
 */
@WebServlet("/HouseConstructioncost")
public class HouseConstructioncost extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public HouseConstructioncost() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
		PrintWriter out = response.getWriter();

		int area = Integer.valueOf(request.getParameter("area"));
		out.println("COST :");
		String MaterialStandard = request.getParameter("MaterialStandard");
		if (MaterialStandard.equals("standard"))
			out.println(area * 1200);
		if (MaterialStandard.equals("above_standard"))
			out.println(area * 1500);
		if (MaterialStandard.equals("high_standard"))
			out.println(area * 1800);
		if (MaterialStandard.equals("high_automated"))
			out.println(area * 2500);

	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
