package quote;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;

/**
 * Created by 152772a on 12/1/2016.
 */
@WebServlet(name = "QuoteServlet", urlPatterns = "/quote")
public class QuoteServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        HttpSession session = request.getSession();

        String ownQuote = request.getParameter("quote");
//        System.out.println(ownQuote);

        String name = (String) session.getAttribute("name");

        Quote qute = new Quote(name, ownQuote);
        QuoteDAO dao = new QuoteDAO();
        dao.addQuote(qute);

        request.setAttribute("qt", qute);


        getServletContext().getRequestDispatcher("/success.jsp").forward(request, response);


    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {


        HttpSession session = request.getSession();


        String name = request.getParameter("name");
        String age = request.getParameter("age");

        QuoteDAO quote = new QuoteDAO();
        Quote quo = quote.getRandomQuote();

        //temp
//        int ageFinal = Integer.parseInt(age);
//        Quote qq = quote.getQuote(ageFinal);
//        System.out.println("Quotessss");
//        System.out.println(qq.getQuote());
//        System.out.println(qq.getAuthor());



        session.setAttribute("name", name);
        session.setAttribute("age", age);
        session.setAttribute("quote", quo);


        getServletContext().getRequestDispatcher("/quote.jsp").forward(request, response);


    }
}
