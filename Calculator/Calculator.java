package Task2;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * @author Manasa Gottam
 *
 */
/**
 * Servlet implementation class Calculator
 */
@WebServlet("/Calculator")
public class Calculator extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public Calculator() {
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

		int operand1 = Integer.valueOf(request.getParameter("op1"));
		int operand2 = Integer.valueOf(request.getParameter("op2"));
		String operator = request.getParameter("operator");
		if (operator.equals("add"))
			out.println(addition(operand1, operand2));
		if (operator.equals("sub"))
			out.println(substraction(operand1, operand2));
		if (operator.equals("mul"))
			out.println(multiplication(operand1, operand2));
		if (operator.equals("div") && operand2 == 0) {
			out.println("Operand 2 cannot be 0");
			request.getRequestDispatcher("Calculator.html").include(request, response);
		}
		if (operator.equals("div") && operand2 != 0) {
			out.println(division(operand1, operand2));
		}

	}

	int addition(int operand1, int operand2) {
		int result = operand1 + operand2;
		return result;
	}

	int multiplication(int operand1, int operand2) {
		int result = operand1 * operand2;
		return result;
	}

	int substraction(int operand1, int operand2) {
		int result = operand1 - operand2;
		return result;
	}

	int division(int operand1, int operand2) {
		int result = operand1 / operand2;
		return result;
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
