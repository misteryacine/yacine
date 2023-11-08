package TD3;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

public class Application {

	public static void main(String[] args) {

		
		
		Client client1= new Client("yacine","khimoum","smaoun");
		
		//pour récupérer les données de la base
		ObjectMapper mapper = new ObjectMapper();
		try {
			String json = mapper.writeValueAsString(client1);
			System.out.println(json);
		} catch (JsonProcessingException e) {
			e.printStackTrace();
		}
	}

}
