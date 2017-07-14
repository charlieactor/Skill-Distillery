/**
 * 
 */
package com.skilldistillery.data;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.servlet.ServletContext;

public class PresidentDAOImpl implements PresidentDAO {

	private static final String filename = "WEB-INF/presidents.csv";
	private ServletContext servletContext;
	private List<String> president;

	public PresidentDAOImpl(ServletContext context) {
		servletContext = context;
	}
	
	@Override
	public Map<Integer, President> loadPresidentsFromFile() {
		Map<Integer, President> presMap = new HashMap<>();
		// Retrieve an input stream from the servlet context
		// rather than directly from the file system
		InputStream is = servletContext.getResourceAsStream(filename);
		try (BufferedReader buf = new BufferedReader(new InputStreamReader(is))) {
			String line;
			while ((line = buf.readLine()) != null) {
				System.out.println(line);
				String[] tokens = line.split(", ");
				int presidentNumber = Integer.parseInt(tokens[0]);
				String firstName = tokens[1];
				String middleName = tokens[2];
				String lastName = tokens[3];
				int termBegin = Integer.parseInt(tokens[4].split("-")[0]);
				int termEnd = Integer.parseInt(tokens[4].split("-")[1]);
				String party = tokens[5];
				String interestingFact = tokens[6];
				
				President newPres = new President(presidentNumber, firstName, middleName, lastName, termBegin, termEnd, party, interestingFact);
				
				presMap.put(newPres.getPresidentNumber(), newPres);
				

			}
		} catch (Exception e) {
			System.err.println(e);
		}
		System.out.println(presMap.size());
		return presMap;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.skilldistillery.data.PresidentDAO#getpresidentNumber(int)
	 */
	@Override
	public int getpresidentNumber(int presidentNumber) {
		// TODO Auto-generated method stub
		return 0;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.skilldistillery.data.PresidentDAO#getFirstName(java.lang.String)
	 */
	@Override
	public String getFirstName(String firstName) {
		// TODO Auto-generated method stub
		return null;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * com.skilldistillery.data.PresidentDAO#getMiddlename(java.lang.String)
	 */
	@Override
	public String getMiddlename(String middleName) {
		// TODO Auto-generated method stub
		return null;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.skilldistillery.data.PresidentDAO#getLastName(java.lang.String)
	 */
	@Override
	public String getLastName(String lastName) {
		// TODO Auto-generated method stub
		return null;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.skilldistillery.data.PresidentDAO#getTermBegin(int)
	 */
	@Override
	public int getTermBegin(int termBegin) {
		// TODO Auto-generated method stub
		return 0;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.skilldistillery.data.PresidentDAO#getTermEnd(int)
	 */
	@Override
	public int getTermEnd(int termEnd) {
		// TODO Auto-generated method stub
		return 0;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.skilldistillery.data.PresidentDAO#getParty(java.lang.String)
	 */
	@Override
	public String getParty(String party) {
		// TODO Auto-generated method stub
		return null;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.skilldistillery.data.PresidentDAO#getInterestingFact(java.lang.
	 * String)
	 */
	@Override
	public String getInterestingFact(String fact) {
		// TODO Auto-generated method stub
		return null;
	}
	

}
