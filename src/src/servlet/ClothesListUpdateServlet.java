package servlet;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import model.Cloth;

/**
 * Servlet implementation class ClothesListUpdateServlet
 */
@WebServlet("/ClothesListUpdateServlet")
public class ClothesListUpdateServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		//前画面からPOSTされるidを受け取る
		 //int clothId = Integer.parseInt(request.getParameter("CLOTH_ID"));

		//服のキーとなる項目を前画面から受け取る
		//int CLOTH_ID = 10;


		//服の情報をデータベースから取得する

		HttpSession session = request.getSession();
		Cloth smallcategory = (Cloth)session.getAttribute("small_category");

		request.setAttribute("small_category",smallcategory);



		//取得した値をjspに渡す
		//request.setAttribute("clothId", CLOTH_ID);


		//編集画面にフォワード
		RequestDispatcher dispatcher = request.getRequestDispatcher("/WEB-INF/jsp/clothes_update.jsp");
		dispatcher.forward(request, response);
	}


	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("UTF-8");




		//編集確認ページにフォワードする
		RequestDispatcher dispatcher = request.getRequestDispatcher("/WEB-INF/jsp/clothes_update_check.jsp");
		dispatcher.forward(request, response);
	}

 }
/*
//int CTAG = Integer.parseInt(ctag);

//String ctag = request.getParameter("upclothes__id");
String cname = request.getParameter("upclothes__name");
String cimages = request.getParameter("upclothes__images");
Cloth upclothestag = new Cloth();
//upclothestag.setID(ctag);
upclothestag.setSMALL_TAG(cname);
upclothestag.setCLO_IMAGES(cimages);


HttpSession session = request.getSession();
session.setAttribute("upsmallTag", upclothestag);*/

//Cloth clothestag = new Cloth();
		/*clothestag.setID(CTAG);
		clothestag.setSMALL_TAG(cname);
		clothestag.setCLO_IMAGES(cimages);*/
