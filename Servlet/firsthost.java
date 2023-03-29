import java.io.IOException.*;
import java.io.printWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class Login extends HttpServlet{
    protected void dePost(HttpServletRequest req, HttpServletResponse res) throws IOException, ServletException{
    PrintWriter pr=res.getWriter();
    res.SetContenttype("text/html");
    String loginName=req.getParameter("i_name");
    String topass=req.getParameter("i_pass");
    if (loginName.equals("admin") && pass.equals("root")){
        pr.print("login success");
    }
    else{
        pr.print("Invalid");
    }
    pr.close();
    }
}