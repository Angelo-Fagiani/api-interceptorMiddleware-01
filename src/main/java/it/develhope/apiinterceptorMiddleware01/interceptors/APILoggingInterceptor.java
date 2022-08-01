package it.develhope.apiinterceptorMiddleware01.interceptors;

import org.springframework.lang.Nullable;
import org.springframework.stereotype.Component;
import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@Component //annotiamo la classe interceptor con @Component
public class APILoggingInterceptor implements HandlerInterceptor {

    //Questo metodo verrà chiamato prima che il controller inizierà a lavorare
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {
        Long startTime = System.currentTimeMillis();
        System.out.println("Request URL::" + request.getRequestURL().toString() + ":: Start Time=" + System.currentTimeMillis());
        request.setAttribute("StartTime",startTime);
        return true;
    }
    //Questo metodo viene chiamato dopo la richiesta API
    public void postHandle(HttpServletRequest request, HttpServletResponse response, Object handler, @Nullable ModelAndView modelAndView) throws Exception {
    }
    //Questo metodo verrà chiamato dopo aver inviato la richiesta API. Utile per catturare l'eccezione e loggarla in maniera corretta
    public void afterCompletion(HttpServletRequest request, HttpServletResponse response, Object handler, @Nullable Exception ex) throws Exception {
    }
}
