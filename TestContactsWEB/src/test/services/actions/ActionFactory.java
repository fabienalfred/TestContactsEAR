package test.services.actions;


public class ActionFactory {

	public static Action getAction(String cde) {
		Action action = null;
		if(cde == null || cde.isEmpty())
			cde = "home";
		switch (cde) {
		case "home":
			action = new ActionHome();
			break;
		case "all":
			action = new ActionGetAll();
			break;
		default:
			break;
		}
		return action;
	}

	
	
}
