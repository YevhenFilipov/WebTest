package akvelontask.listeners;

import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;

public class ContextListener implements ServletContextListener {
    public ContextListener() {
    }

    @Override
    public void contextInitialized(ServletContextEvent servletContextEvent) {
        final String context = servletContextEvent.getServletContext().getContextPath();
        servletContextEvent.getServletContext().setAttribute("CONTEXT", context);
    }

    @Override
    public void contextDestroyed(ServletContextEvent servletContextEvent) {

    }
}
