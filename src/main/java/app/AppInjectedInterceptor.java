package app;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.data.domain.PageRequest;
import org.springframework.web.servlet.handler.HandlerInterceptorAdapter;

import app.business.UserBusiness;

public class AppInjectedInterceptor extends HandlerInterceptorAdapter {

	@Autowired
  @Qualifier("UserBusiness")
  private UserBusiness userBusiness;

	@Override
	public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler)
			throws Exception {
		
		System.out.println("\n\n\nInterceptado\n\n\n");
		userBusiness.list(new PageRequest(0, 100));
		
		return true;
	}
}
