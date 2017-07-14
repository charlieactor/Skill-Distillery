package controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import data.State;
import data.StateDAO;

@Controller
public class StateController {

	@Autowired
	private StateDAO stateDAO;

	public StateDAO getStateDAO() {
		return stateDAO;
	}

	public void setStateDAO(StateDAO stateDAO) {
		this.stateDAO = stateDAO;
	}

	@RequestMapping(path = "GetStateData.do", params = "name", method = RequestMethod.GET)
	public ModelAndView getStateDataByName(String name) {
		ModelAndView mv = new ModelAndView();
		mv.addObject("state", stateDAO.getStateByName(name));
		mv.setViewName("result.jsp");
		return mv;
	}

	@RequestMapping(path = "GetStateData.do", params = "abbr", method = RequestMethod.GET)
	public ModelAndView getStateDateByAbbrev(String abbr) {
		ModelAndView mv = new ModelAndView();
		mv.addObject("state", stateDAO.getStateByAbbreviation(abbr));
		mv.setViewName("result.jsp");
		return mv;
	}

	@RequestMapping(path = "NewState.do", method = RequestMethod.POST)
	public ModelAndView addState(State state) {
		ModelAndView mv = new ModelAndView();
		mv.addObject("state", state);
		mv.setViewName("result.jsp");
		return mv;
	}

	@RequestMapping(path = "NewState.do", method = RequestMethod.POST)
	public ModelAndView redirectPost(State state) {
		ModelAndView mv = new ModelAndView();
		mv.addObject("state", state);
		mv.setViewName("redirect:stateAdded.do");
		return mv;
	}

	@RequestMapping(path = "stateAdded.do", method = RequestMethod.GET)
	public ModelAndView stateCreatedRedirect(State state) {
		ModelAndView mv = new ModelAndView();
		mv.addObject("State", state);
		mv.setViewName("result.jsp");
		return mv;
	}

	// TODO : Implement another request handler for:
	// path "NewState.do"
	// method POST
	// command object : State
	// return : ModelAndView
	// view : "redirect:stateAdded.do"
	// behavior : add state to dao, add state to flashAttributes

	// TODO : Implement another request handler for:
	// path "stateAdded.do"
	// method GET
	// command object : State
	// return : ModelAndView
	// view : "result.jsp" or "result" if using InternalResourceViewResolver

}
