package Servlets;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import Database.UserDB;
import Objects.User;

/**
 * Servlet implementation class SignInServlet
 */ 
public class SignUpServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private UserDB userDatabase = new UserDB();
	
    /**
     * @see HttpServlet#HttpServlet()
     */
    public SignUpServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.getRequestDispatcher("signUpView.jsp").forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String signUp = request.getParameter("signUp");
		String login = request.getParameter("login");
		String password = request.getParameter("password");
		String username = request.getParameter("username");
		String firstName = request.getParameter("firstName");
		String lastName = request.getParameter("lastName");
		String email = request.getParameter("email");
		String check = request.getParameter("human");
		System.out.println(check);
		
		if(signUp != null){
			response.sendRedirect("SignUp");
		}
		if(login != null){
			response.sendRedirect("Login");
		}
		
		if(firstName != null && lastName != null && password != null && username != null && email != null && check.equals("on")){
			int count = 0;
			for(int i = 0; i < userDatabase.retrieveAllUsers().size(); i++){
				User currentUser = userDatabase.retrieveAllUsers().get(i);
				if(currentUser.getIdNumber() > count){
					count = currentUser.getIdNumber();
				}
			}
			User newUser = new User(password, username, firstName, lastName, count, email);
			userDatabase.retrieveAllUsers().add(newUser);
			response.sendRedirect("Amount");
		}
	}

}
