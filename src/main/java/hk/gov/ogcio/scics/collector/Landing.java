package hk.gov.ogcio.scics.collector;

import java.io.IOException;
import javax.naming.InitialContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.Map;
import java.util.Objects;

@WebServlet(urlPatterns = "/scics/Landing")
public class Landing extends HttpServlet {
	

	
	/**
	 * 
	 */
	private static final long serialVersionUID = -1638994321430963747L;
	private static final String standardErr = "/forms/html/error.html";

	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		try {
			//Logger logger = Logger.getLogger("Landing");
			/*String siteDomain = "";
			try{
				InitialContext ic = new InitialContext();
				String site = (String) ic.lookup("java:global/scics/notification/site_id");
	
				if (site.equals("KP")){
					siteDomain = "//scics1.one.gov.hk";
				}else if (site.equals("SP")){
					siteDomain = "//scics2.one.gov.hk";
				}else if (site.equals("TT")){
					siteDomain = "//scicsdev.one.gov.hk";
				}
			} catch (Exception e){
	
				logger.info("Exception on getting the Site info", e);
				siteDomain = "";
			}*/
			
			
			
			response.addCookie(new Cookie("applicationId", request.getParameter("applicationId")));
			//response.addCookie(new Cookie("language", ));
			
			Map<String, String[]> params =  request.getParameterMap();
			for(Map.Entry<String, String[]> param : params.entrySet()) {
			    String key = param.getKey();
			    String[] values = param.getValue();
			    
			    if (key.matches("^fb_.*")) {
			    	String value = String.join(";", values);
			    	response.addCookie(new Cookie("ogcsc_" + key, value));
			    }
	
			}
	
	
			//String redirectURL = siteDomain + "/scics/landing2.jsp";
			//logger.info("Redirect URL is: " + redirectURL);
	
	
			/*logger.info("  applicationId: " + request.getParameter("applicationId"));
			logger.info("  language: " + request.getParameter("language"));
			logger.info("  url: " + request.getParameter("govhk_survey_url"));
			logger.info("  pageType: " + request.getParameter("fb_page_type"));
			logger.info("  userGroup: " + request.getParameter("fb_usergroup"));
			logger.info("  cluster: " + request.getParameter("fb_cluster"));
			logger.info("  id: " + request.getParameter("fb_id"));*/
			
			String language = Objects.toString(request.getParameter("language"), "");
			String applicationId = Objects.toString(request.getParameter("applicationId"), "");
			
			language = language.toLowerCase();
			if (!(language.equals("tc") || language.equals("sc") || language.equals("en"))){
				language = "en";
			}
			
	
			if (applicationId.isEmpty()){
				//logger.info("Applicatio ID is empty");
				
				response.setStatus(HttpServletResponse.SC_NOT_FOUND);
				response.sendRedirect(standardErr);
				return;
			}
				
			if (!applicationId.matches("^.{4}\\d{2}$")){
				//logger.info("Format of applicationId is not match: " + applicationId.length());
				applicationId = "";
				response.setStatus(HttpServletResponse.SC_NOT_FOUND);
				response.sendRedirect(standardErr);
				return;
			}
			
			
			//get URL history
			
			
			    /*
			ArrayList<UrlHistory> listOfUrl = new ArrayList<UrlHistory>();
			int numOfUrl = 0;
			try{
				numOfUrl = Integer.parseInt(Objects.toString(request.getParameter("govhk_survey_url_max"), "0"));
				logger.info("Number of URL: " + numOfUrl);
			} catch (NumberFormatException e){
				logger.info("Cannot get the value of number of URL");
				numOfUrl = 0;
			} 
			String fullUrls = URLDecoder.decode(Objects.toString(request.getParameter("govhk_survey_url"), ""), "UTF-8");
			String fullTime = URLDecoder.decode(Objects.toString(request.getParameter("govhk_survey_time"), ""), "UTF-8");
			
			String[] urls = fullUrls.split("\\|");
			String[] times = fullTime.split("\\|");
			logger.info("Size of URL array: " + urls.length);
			logger.info("Size of time array: " + times.length);
			
			for (int i = 0; i < numOfUrl; i++){
				String visitedUrl;
				String visitDateTimeString;
				
				try{
					visitedUrl = urls[i];
					visitDateTimeString = times[i];
				} catch (ArrayIndexOutOfBoundsException e){
					logger.info("Number of items in visit URL or time cookies not match the number of history at index: " + i + ". Stop the parsing of remaining item", e);
					continue;
				}
			
				
				if (visitedUrl == null || visitDateTimeString == null || visitedUrl.isEmpty() || visitDateTimeString.isEmpty()){
					logger.info("Visit URL or time cookies have null or empty value at index: " + i + ". Skip this item.");
					continue;
				}*/
				
				/*GregorianCalendar visitDateTimeCalendar = new GregorianCalendar();
				
				TimeZone tz = TimeZone.getTimeZone("UTC");
				DateFormat df = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss.SSSS'Z'"); // Quoted "Z" to indicate UTC, no timezone offset
				df.setTimeZone(tz);
				Date date = df.parse(visitDateTimeString);
				visitDateTimeCalendar.setTime(date);
				
			
				UrlHistory urlHistory = new UrlHistory(visitedUrl, visitDateTimeCalendar);
				listOfUrl.add(urlHistory);
			
			}
			session.setAttribute("urlHistory", listOfUrl);
			session.setAttribute("url", url);
			session.setAttribute("pageType", pageType);
			session.setAttribute("userGroup", userGroup);
			session.setAttribute("cluster", cluster);
			session.setAttribute("id", id);
			*/
//			String siteDomain = "";
//			try{
//				InputStream is =  null;
//				String propertiesPath = System.getProperty("hk.gov.ogcio.scics.PROPERTIES_FILEPATH");
//				File file = new File(propertiesPath + "/scics.properties");
//				is = new FileInputStream(file);
//				PropertyResourceBundle prb = new PropertyResourceBundle(is);
//				String site = prb.getString("site");
//			
//				if (site.equals("KP")){
//					siteDomain = "//scics1.one.gov.hk";
//				}else if (site.equals("SP")){
//					siteDomain = "//scics2.one.gov.hk";
//				}else if (site.equals("TT")){
//					siteDomain = "//scicsdev.one.gov.hk";
//				}
//			} catch (Exception e){
//			
//				logger.info("Exception on getting the Site info", e);
//				siteDomain = "";
//			}
			
			//String redirectURL = "/forms/" + applicationId.toLowerCase() + "/" + applicationId.toLowerCase() + "_"+ language +".html";
			//logger.info("Redirect URL is: " + redirectURL);
			
			response.setStatus(HttpServletResponse.SC_MOVED_TEMPORARILY);
			response.setHeader("location", "/kenneth/login.do");
		} catch (Exception e) {
			response.setStatus(HttpServletResponse.SC_NOT_FOUND);
			response.sendRedirect(standardErr);
		} 
	}

}
