package view;

import static spark.Spark.*;

public class App {

	public static void main(String[] args) {
		
		get("/", (request,response) -> {
			
			String mensagem  = "<html><body><center>";
			       mensagem += "<br><br><br>";
			       mensagem += "<br><br><br>";
			       
			       mensagem += "<hr><br>";
			       
			       mensagem += "<font face=verdana size=3><b>";
			       mensagem += "PizzaDigital Inc.";
			       mensagem += "</b></font>";
			       
			       mensagem += "<br><br>";
			       
			       mensagem += "<font face=verdana size=1>";
			       mensagem += "RESTful Web Service: Java + Spark + MongoDB";
			       mensagem += "</b></font>";
			       
			       mensagem += "<br><br>";
			       
			       mensagem += "<font face=verdana size=1>";
			       mensagem += (new java.util.Date()).toGMTString();
			       mensagem += "</b></font>";
			       
			       mensagem += "<br><br><hr>";
			       
			       mensagem += "</center></body></html>";
			       
			return mensagem;
			
		});
		
	}
}
