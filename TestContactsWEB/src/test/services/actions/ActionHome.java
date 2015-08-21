package test.services.actions;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class ActionHome implements Action {

	@Override
	public String execute(HttpServletRequest request, HttpServletResponse response) {
		return "/index.jsp";
	}

}
