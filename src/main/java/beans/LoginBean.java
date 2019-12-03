package beans;


import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class LoginBean {
    private String resultat;
    private boolean valid;
    public void verifyIdentification(HttpServletRequest request){
        String login=request.getParameter("login");
        String pass=request.getParameter("pass");

        if (login.equals(login) && pass.equals(login+"123"))
            valid=true;
        else
            valid=false;
    }
    public boolean isValid(){
        return valid;
    }
}
