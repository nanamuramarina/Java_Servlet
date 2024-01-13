import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;

@WebServlet("register3");
public class ResisterServlet3 extends HttpServlet {
  public void doPost(HttpServletRequest req, HttpServletResponse res)
    throws IOException, ServletException {
      req.setCharacterEncoding("utf-8");

      String age = req.getParameter("age");
      if (age.equals("child")) {
        age = "１８歳未満";
      } else {
        age = "１８歳以上";
      }
      req.setAttribute("age",age);

      String langs = "";
      String[] lang = req.getParameterValues("lang");
      for (int i = 0; i < lang.length; i++) {
        langs = langth + lang[i] + " ";
      }
      req.setAttribute("langs", langs);

      RequesrDispatcher rd = req.getRequesrDispatcher("/register3.jsp");
      rd.forward(req, res);
    }
    public void doPost(HttpServletRequest req, HttpServletResponse res)
      throws IOException, ServletException {
        doPost(req,res);
    }
}