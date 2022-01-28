package servlets;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


public class ArithmeticCalculatorServlet extends HttpServlet {

    

    
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        String message = "---";
        request.setAttribute("Message", message);
        getServletContext().getRequestDispatcher("/WEB-INF/arithmeticcalculatorjsp.jsp").forward(request, response);
        return;
    }

    
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        String firstNumber = request.getParameter("first");
        String secondNumber = request.getParameter("second");
        
        if(firstNumber == null || firstNumber.equals("") || secondNumber == null || secondNumber.equals("")){
            String message = "Invalid";
            request.setAttribute("Message", message);
            getServletContext().getRequestDispatcher("/WEB-INF/arithmeticcalculatorjsp.jsp").forward(request, response);
        return;
        }
        try{
            int numberOne = Integer.parseInt(firstNumber);
            int numberTwo = Integer.parseInt(secondNumber);
            int numberThree = 0;
            String action = request.getParameter("mathOperators");
            switch(action){
                case "+" : numberThree = numberOne + numberTwo;
                break;
                case "-" : numberThree = numberOne - numberTwo;
                break;
                case "*" : numberThree = numberOne * numberTwo;
                break;
                case "%" : numberThree = numberOne % numberTwo;
                break;
            }
            request.setAttribute("Message", numberThree);
            
        }
        catch(Exception e){
            String message = "Invalid";
            request.setAttribute("Message", message);
        }
        getServletContext().getRequestDispatcher("/WEB-INF/arithmeticcalculatorjsp.jsp").forward(request, response);
        return;
    }

    

}
