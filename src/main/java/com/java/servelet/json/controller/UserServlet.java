package com.java.servelet.json.controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.google.gson.Gson;
import com.java.servelet.json.model.User;
import com.java.servelet.json.service.UserService;

/**
 * Servlet implementation class UserServlet
 * 
 * 
 */
@WebServlet(urlPatterns = {"/users"}, name="userServelt", description ="UserServlet return json" )
public class UserServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
      private UserService services = new UserService(); 
    /**
     * @see HttpServlet#HttpServlet()
     */
    public UserServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		List<User> users = new ArrayList<>();
		users=services.getUsers();
		
		Gson gson = new Gson();
		String userJson = gson.toJson(users);
		PrintWriter printWritter = response.getWriter();
		response.setContentType("application/json");
		response.setCharacterEncoding("UTF-8");
		printWritter.write(userJson);
		printWritter.close();
		
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
