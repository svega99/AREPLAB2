package edu.escuelaing.arep;

import edu.escuelaing.arep.Calculator.Calculator;
import edu.escuelaing.arep.LinkedListImpl.LinkedList;
import java.util.List;
import spark.*;
import static spark.Spark.*;
/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        port(getPort());
          
        get("/inputdata", (req, res) -> inputDataPage(req, res));
        get("/results", (req, res) -> resultsPage(req, res));
   
    }
    
     private static String inputDataPage(Request req, Response res) {
        String pageContent
                = "<!DOCTYPE html>"
                + "<html>"
                + "<body>"
                + "<h2>Mean and Standard Deviation Calculation</h2>"
                + "<form action=\"/results\">"
                + "  Enter n numbers separated by commas <br>"
                + "  <input type=\"text\" name=\"numbers\" >"
                + "  <br><br>"
                + "  <input type=\"submit\" value=\"Submit\">"
                + "</form>"
                + "<p>If you click the \"Submit\" button, the form-data will be sent to a page called \"/results\".</p>"
                + "</body>"
                + "</html>";
        return pageContent;
    }

    private static String resultsPage(Request req, Response res) {
        
        LinkedList<Double> listaLink=new LinkedList<Double>();
        String[] listaNormal= req.queryParams("numbers").split(",");
        String pageContent;
        
        for (String i: listaNormal){
            try {
                listaLink.add(Double.parseDouble(i));
            }
            catch (NumberFormatException n){
                pageContent
                = "<!DOCTYPE html>"
                + "<html>"
                + "<body>"
                + "<h2>Format Incorrect</h2>"
                + "</body>"
                + "</html>";
            }
      
        }
        
        Double mean = Calculator.getMean(listaLink);
        Double stDev = Calculator.getStandardDeviation(listaLink);
        
        pageContent
                = "<!DOCTYPE html>"
                + "<html>"
                + "<body>"
                + "<h3>Mean: "+mean+"</h3>"
                + "<h3>Standard Deviation: "+stDev+"</h3>"
                + "</body>"
                + "</html>";
        
        return pageContent;
    }
    
    
    static int getPort() {
        if (System.getenv("PORT") != null) {
            return Integer.parseInt(System.getenv("PORT"));
        }        
           
        return 4567; //returns default port if heroku-port isn't set(i.e. on localhost)    }
    }
}
