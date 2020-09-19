<%@page import="org.springframework.context.support.ResourceBundleMessageSource"%>
<%@page import="org.springframework.context.support.ClassPathXmlApplicationContext"%>
<%@page import="org.springframework.context.ApplicationContext"%>
<%@page import="java.util.Locale"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%
String lang = request.getHeader("accept-language");
Locale locale = new Locale(lang);
ApplicationContext ap = new ClassPathXmlApplicationContext("resources/spring.xml");
String value = ap.getMessage("lable", null, locale);

%>
<form action="./hello">
    <%=value%>: <input type="text" name="username"/>
                <input type="submit" value="submit" name="save"/>
</form>