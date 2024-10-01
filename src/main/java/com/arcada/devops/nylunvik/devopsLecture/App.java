package com.arcada.devops.nylunvik.devopsLecture;

import com.sun.net.httpserver.HttpExchange;
import com.sun.net.httpserver.HttpHandler;
import com.sun.net.httpserver.HttpServer;

import java.io.IOException;
import java.io.OutputStream;
import java.net.InetSocketAddress;

public final class App 
{
	private static int count = 0;
    public static final void main(final  String[] args )
    {
    	App app = new App();
    	app.createServer();
    }//main closes
    
    public boolean createServer()
    {
    	try
    	{
    		final HttpServer server = HttpServer.create(new InetSocketAddress(8008), 0);
            server.createContext("/", new DemoHandler()); 
            server.setExecutor(null); // creates a default executor
            server.start();
            System.out.println("Hello. Your server has started. It is running on this port: http://localhost:8008/");
                        
            return true;
    	}
    	catch(final IOException exception)
    	{
    		exception.printStackTrace();
    		return false;
    	}
    }
    
    private static final class DemoHandler implements HttpHandler 
    {
        @Override
        public final void handle(final HttpExchange t) throws IOException 
        {
            final String response = "<html lang='fi'>"
            		+ "<style>table, td {"
            		+ "border:1px solid black;"
            		+ "} </style>"
            		+ "<head> <title>Pulla</title> "
            		+ "<meta http-equiv='Content-Type' content='text/html;' /> </head>"
            		+ "<body>"
            		+ "<h2> Welcome to Viktor's server! "
            		+ "The server code was provided by Niraj. <br>"
            		+ "This page was called "+ (++count)+" times. </h2><br><br>" //extra
            		+ "<dir style='background-color:lightgreen;'>"
            		+ "<h1>Korvapuusti resepti:</h1>"
            		+ "<table>"
	            		+ "<tr>"
	            			+ "<th>Aine</th>"
	            			+ "<th>Osa</th>"
            			+ "</tr><tr>"
		            		+ "<td>hiivaa </td>"
		            		+ "<td>50 g </td>"
	            		+ "</tr><tr>"
	            			+ "<td>maitoa </td>"
		            		+ "<td>5 dl </td>"
	            		+ "</tr><tr>"
		            		+ "<td>kanamunaa </td>"
		            		+ "<td>2 </td>"
	            		+ "</tr><tr>"
		            		+ "<td>sokeria </td>"
		            		+ "<td>2 dl + 1 dl </td>"
	            		+ "</tr><tr>"
		            		+ "<td>suolaa </td>"
		            		+ "<td>2 tl </td>"
	            		+ "</tr><tr>"
		            		+ "<td>kardemummaa </td>"
		            		+ "<td>1 rkl </td>"
	            		+ "</tr><tr>"
		            		+ "<td>vehnejauhoa </td>"
		            		+ "<td>16 dl </td>"
	            		+ "</tr><tr>"
		            		+ "<td>voita </td>"
		            		+ "<td>~175 g + 100 g </td>"
	            		+ "</tr><tr>"
		            		+ "<td>kanelia </td>"
		            		+ "<td> 2 rkl </td>"
	            		+ "</tr>"
            		+ "</table>"
            		+ "<p>1. Liuota hiiva ka'denla'mpo'iseen maitoon. Lisa'a' munat, sokeri, mausteet ja osa jauhoista. Sekoita taikina tasaiseksi. </p>"
            		+ "<p>2. Alusta va'hitellen loput jauhot taikinaan, kunnes taikina irtoaa kulhon reunoista. Lisa'a' lopuksi sulatettu voi. </p>"
            		+ "<p>3. Anna taikinan kohota liinan alla vedottomassa paikassa kaksinkertaiseksi. </p>"
            		+ "<p>4. Kauli taikina kahdeksi 60 x 30 cm:n kokoiseksi levyksi. </p>"
            		+ "<p>5. Levita' levyille pehmea' voita. Ripota pinnalle sokeri ja kaneli. </p>"
            		+ "<p>6. Ka'a'ri taikinalevyt rulliksi pitka'lta' sivulta. Ja'ta' saumakohta alapuolelle. "
            		+ "<br>Leikkaa rullat tera'va'lla' veitsella' vinottain kolmikulmaisiksi paloiksi. Nosta palat pystyyn kapea kohta ylo'spa'in. </p>"
            		+ "<p>7. Paina sormilla kapea kohta alas po'yta'a'n saakka. Na'in leikkauspinnat nousevat ylo's. Kohota liinan alla. </p>"
            		+ "<p>8. Voitele kohonneet puustit. Ripota pinnalle mantelirouhetta tai raesokeria. </p>"
            		+ "<p>9. Paista uunin keskiosassa 225 asteessa n. 8 min. </p> <br>"
            		+ "</dir>"
    				+ "</body></html>";
            t.sendResponseHeaders(200, response.length());
            final OutputStream os = t.getResponseBody();
            os.write(response.getBytes());
            os.close();
        }//handle method closes
    }//Inner class closes
}//class App closes
