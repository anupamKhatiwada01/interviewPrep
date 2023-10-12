A Servlet is a java class used in JavaEE web applications to respond to requests from clients, typically web browsers. Servlets can respond to various types of requests inncluding HTTP requests which is the most common use case.


Characteristics of servlets:
1. Java based: written in java leveraging java's platform independent features.
2. Server-Side component: Servlets run on server side processing client requests and generating responses.
3. Lifecycle managed by container: The servlet container or servlet engine manages the lifecycle of servlets invoking methods like init(), service() and destroy() at different stages of a servelt's lifecycle;
4. Concurrent processing: Servlets handle multiple request concurrently with each request handled in a seperate thread.
5. Performance: Servlets are known for their performance and stability as they persist in memory and handle multiple requests over their lifetime.

Lifecycle of a servlet:
1. Loading and initialization: The servlet class is loaded and `init()` method is called to initialize the servlet.
2. Request Handling: The `service()` method is called to process client requests. This method dispatches requests to appropriate methods like `doGet()` or `doPost()` based on http method of the request.
3. Destruction: When a servlet is no longer needed the `destroy()` method is called to release resources held by the servlet.

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/MyServlet")
public class MyServlet extends HttpServlet {
    
    protected void doGet(HttpServletRequest request, HttpServletResponse response) 
            throws ServletException, IOException {
        response.getWriter().write("Hello, World!");
    }
}

The servlet is annotated with @WebServlet("/MyServlet") to map it to the URL pattern /MyServlet.
The doGet() method is overridden to handle HTTP GET requests. It writes "Hello, World!" to the response output stream.
The servlet extends HttpServlet, which is a part of the javax.servlet.http package.


Servlets are typically packaged in war files and deployed on servlet containers such as apache tomcat, jetty and etc.

@ComponentScan annotation is used in Spring framework and is used to specify the packages that are to be scanned for spring components.
Spring comonents can be classes annotated with @Service, @Component, @Repository, @Controller etc.
During the initialization of the application context, spring will automatically detect these annotated classes and register them as beans in the application context.

@ComponentScan is typically put in the main configuartion class to specify the packages to be checked to register beans.
If the annotation is not used then we need to create the beans in the configuration class manually.

How to use @ComponentScan?
Default scanning will scan the package of the configuration class and its sub packages.
We can add multiple base packages using the basePackages attribute and passing in an array of packages.








