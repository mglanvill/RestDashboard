package dash;

import org.springframework.core.ParameterizedTypeReference;
import org.springframework.hateoas.*;
import org.springframework.hateoas.client.Traverson;
import org.springframework.hateoas.hal.HalLinkDiscoverer;

import java.net.URI;
import java.net.URL;
import java.net.URLConnection;
import java.util.HashMap;
import java.util.Map;

public class RestDashboardApplicationTests {

	private static final ParameterizedTypeReference<PagedResources<Resource<UserResource>>> TYPE_REFERENCE = new ParameterizedTypeReference<PagedResources<Resource<UserResource>>>() {};

	public static void main(String[] args) {
		try {
			String urlstring = "http://localhost:8085/RestDashboard";
			URL url = new URL(urlstring);
			URLConnection connection = url.openConnection();
			connection.setRequestProperty("Accept", "application/json");
			LinkDiscoverer discoverer = new HalLinkDiscoverer();
			Link link = discoverer.findLinkWithRel("users", connection.getInputStream());

			URI uri = new URI(urlstring);
			Traverson traverson = new Traverson(uri, MediaTypes.HAL_JSON);
			Map<String, Object> parameters = new HashMap<>();
			PagedResources<Resource<UserResource>> resources = traverson.follow(link.getRel()).withTemplateParameters(parameters).toObject(TYPE_REFERENCE);

			for (Resource<UserResource> resource : resources) {
				System.out.println(resource.getContent().authority.role.descX);
			}

		} catch (Exception ex) {
			System.err.println(ex);
		}
	}
}
