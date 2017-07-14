package data;

import static junit.framework.TestCase.format;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

import javax.annotation.PostConstruct;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.context.WebApplicationContext;

public class StateDAOImpl implements StateDAO {
	private static final String FILE_NAME = "/WEB-INF/states.csv";
	private List<State> states = new ArrayList<>();
	/*
	 * Use Autowired to have Spring inject an instance of a
	 * WebApplicationContext into this object after creation. We will use the
	 * WebApplicationContext to retrieve an ServletContext so we can read from a
	 * file.
	 */
	@Autowired
	private WebApplicationContext wac;

	/*
	 * The @PostConstruct method is called by Spring after object creation and
	 * dependency injection
	 */
	@PostConstruct
	public void init() {
		// Retrieve an input stream from the servlet context
		// rather than directly from the file system
		try (InputStream is = wac.getServletContext().getResourceAsStream(FILE_NAME);
				BufferedReader buf = new BufferedReader(new InputStreamReader(is));) {
			String line = buf.readLine();
			while ((line = buf.readLine()) != null) {
				String[] tokens = line.split(",");
				String abbrev = tokens[1];
				String name = tokens[2];
				String capital = tokens[3];
				String latitude = tokens[4];
				String longitude = tokens[5];
				String populationString = tokens[6];
				String fact = tokens[7];
				int population = Integer.parseInt(populationString);
				states.add(new State(abbrev, name, capital, latitude, longitude, population, fact));
			}
		} catch (Exception e) {
			System.err.println(e);
		}
	}

	@Override
	public State getStateByName(String name) {
		// TODO : Implement method
		State s = null;

		for (int i = 0; i < states.size(); i++) {
			if (states.get(i).getName().equals(name)) {
				s = states.get(i);
			}
		}
		return s;
	}

	@Override
	public State getStateByAbbreviation(String abbrev) {
		// TODO : Implement method
		State s = null;

		for (int i = 0; i < states.size(); i++) {
			if (states.get(i).getAbbrev().equals(abbrev)) {
				s = states.get(i);
			}
		}
		return s;
	}

	@Override
	public void addState(State state) {
		// TODO : Implement method
		states.add(state);
	}
}
