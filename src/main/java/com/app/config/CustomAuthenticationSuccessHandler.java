package com.app.config;

import java.io.IOException;
import java.util.Collection;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.security.core.Authentication;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.web.DefaultRedirectStrategy;
import org.springframework.security.web.RedirectStrategy;
import org.springframework.security.web.authentication.AuthenticationSuccessHandler;
import org.springframework.stereotype.Component;

@Component
public class CustomAuthenticationSuccessHandler implements AuthenticationSuccessHandler {

	private RedirectStrategy redirectStrategy = new DefaultRedirectStrategy();

	@Override
	public void onAuthenticationSuccess(HttpServletRequest request, HttpServletResponse response,
			Authentication authentication) throws IOException, ServletException {

		boolean hasAdminRole = false;
		boolean hasManagerRole = false;
		Collection<? extends GrantedAuthority> authorities = authentication.getAuthorities();
		for (GrantedAuthority grantedAuthority : authorities) {
			System.out.println("User Role "+grantedAuthority.getAuthority());
			if (grantedAuthority.getAuthority().equals("Admin")) {
				System.out.println(grantedAuthority.getAuthority());
				hasAdminRole = true;
				break;
			} else if (grantedAuthority.getAuthority().equals("Manager")) {
				hasManagerRole = true;
				System.out.println(grantedAuthority.getAuthority());

				break;
			}
		}

		if (hasAdminRole) {
			redirectStrategy.sendRedirect(request, response, "/admin");
		} else if (hasManagerRole) {
			redirectStrategy.sendRedirect(request, response, "/manager");
		} else {
			System.out.println("roleee");
			redirectStrategy.sendRedirect(request, response, "/");
		}
	}

}
