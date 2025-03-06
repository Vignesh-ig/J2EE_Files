package com;

public class Demo {
}

/*
 * Keys points to study in servlets-----
 * 
 * SERVLETS
 * Servlet is technolodege used to create a dynamic Web application.
 * it is also called as API because it helps us to connect java(back-end) with front-end.
 * it will take request from the user and create the response.
 * 
 * TYPES OF SERVLETS
 * implements Servlet interface.
 * extending GenericServlet.
 * extending HttpServlet.
 * 
 * LIFE CYCLE OF SERVLET
 * 1. Servlet class will be loading
 * 2. Servlet instance will be created
 * 3. init() method will be invoke (It is used to initialize the Servlet Object.
 * 									 During the life cycle init() will be called only once)
 * 4. Service() method will be invoked (It is used to create the repose for the request.
 * 											It will will be called whenever we sent the request.)
 * 5. Destroy() method will be invoked (It is used to destroy the Servlet Object.
 * 									 During the life cycle destroy() will be called only once.)
 * 
 * 
 * DIFFERENCE BETWEEN SERVLET AND GENERIC SERVLET
 * SERVLET - in this we have 5 method [ init(), service(), destroy(), getServletInfo(), getServletConfig()]
 * 
 * 
 * WHAT IS WEB CONTAINER?
 * It is component of web servlet.
 * it is used to interact with java servlet.
 *--------------- USES 
 * it will managed the servlet life cycle.
 * it will map the SERVLET url by using web.xml.
 * 
 * 
 * WEB.XML (DEPLOYMENT DESCRIPTOR)  --- @WebServlet('/ ')
 * 
 * Deployment Discriptor is used to map the url with servlet.
 * 
 * 
 * 
 * 
 * 
 * DIFFERNCE BETWEEN GenericServlet AND HttpServlet ?
 * 
 * GenericServlet is a protocal independent.
 * it can accpet any type of protocal such as (smtp, stp, ftp, http, https).
 * Session management with cookies is not allowed in GenericServlet.
 * 
 * 
 * HttpServlet is a protocal dependent
 * it can accept only http and https protocal
 * Session management with cookies is allowed in HttpServlet.
 * 
 * 
 * DIFFERNCE BETWEEN ServletConfig AND ServletContext ? 
 * 
 * ServletConfig is Servlet specific.
 * ServletConfig object is obtained by getServletConfig method.
 * Each servlet has its own config object.
 * it is used to share inform for particular servlet.
 * 
 * ServletContext it represent the whole application.
 * ServletContext object is obtained by getServletContext method.
 * ServletContext object is only one it is used by whole app.
 * it is used to share inform for whole application.
 * 
 * WHAT DO YOU MEAN BY SESSION ?
 * session is a particular interval of time.
 * 
 * SESSION MANAGEMENT or SESSION TRACKING
 * SESSION MANAGEMENT or SESSION TRACKING is a way to maintain state of a user. 
 * 		[converting the sateless protocal to statefull protocal]
 * by default http is stateless to maintain the state we will use session tracking.
 * stateless protocal is each and every request is a new request.
 * 
 * COOKIES - HIDDEN FORM FILL --HTTP SESSION
 * 
 * cookie is a piece of an information which is stores in browser
 * 
 * 
 * 
 * 
 * HTTPSESSION
 * web container creates a session id for each user.
 * the web container uses the session id used to identify the particular user.
 * 
 * 
 * 
 * 
 * 
 * 
 * Attribute 
 * it used  to transfer from one servlet to another servlet.
 * three type of attribute
 * 		context attribute.
 * 		request attribute.
 * 		session attribute.
 * 
 * 
 * Request Dispatcher
 * it is an interface provides facility of dispatching the request from one servlet to another servlet.
 * -forward - it is used to forward the request  -- we can forward only one request
 * -include - it is used to include the request -- we can include many request
 * it will send the same request and response.
 * 
 * Send Re-Direct 
 * it is used to send response or re-direct the response.
 * it used to re-direct  response from one page to another   it may be servlet or JSP or html .
 * it can be used in same applicaton also outside application also.
 * it will send the new request and response.
 * 
 * 
 *  
 */