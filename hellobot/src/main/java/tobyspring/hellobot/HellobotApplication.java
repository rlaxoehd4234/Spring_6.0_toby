package tobyspring.hellobot;


import org.springframework.boot.web.embedded.tomcat.TomcatServletWebServerFactory;
import org.springframework.boot.web.server.WebServer;
import org.springframework.boot.web.servlet.server.ServletWebServerFactory;

public class HellobotApplication {
    public static void main(String[] args){
        ServletWebServerFactory serverFactory = new TomcatServletWebServerFactory();
        WebServer webServer =serverFactory.getWebServer();
        webServer.start();


    }

}
