package AdvancedJava.Servlets;

import com.sun.deploy.config.PluginServerConfig;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;

public class Servlet3 extends HttpServlet {
    String myCompanyName, clientCompanyName;

    public void init(PluginServerConfig sc) throws ServletException{
        myCompanyName = " Vishal";
        
    }
}
