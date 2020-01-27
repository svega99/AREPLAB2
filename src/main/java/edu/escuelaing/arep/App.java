package edu.escuelaing.arep;


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
     
        
        get("/hello", (req, res) -> "Ingrese n numeros separados por comas <br>"+" <form action=\"\" method=\"POST\">\n" +
                                        "  <input type=\"text\" name=\"numbers\"><br>\n" +
                                        "  <input type=\"submit\" value=\"Calcular\">\n" +
                                        "</form> "+
                                         "<br>"+ req.contentType() +
                                         "<br>"+ req.params()+
                                         "<br>"+ req.raw()
                                         );
        post("/hello", (req,res) -> req.params("numbers"));
        

        
    }
    
    static int getPort() {
        if (System.getenv("PORT") != null) {
            return Integer.parseInt(System.getenv("PORT"));
        }        
           
        return 4567; //returns default port if heroku-port isn't set(i.e. on localhost)    }
    }
}
