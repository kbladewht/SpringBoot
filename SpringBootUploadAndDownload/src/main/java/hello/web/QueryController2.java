package hello.web;

import java.util.List;

import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController

@RequestMapping(value = "/users")
public class QueryController2 {

	@RequestMapping(value = { "ddd" }, method = RequestMethod.GET)

	public List<String> getUserList(String name, @RequestBody String id) {

		System.out.println(name);
		System.out.println(id);

		return null;

	}

	@RequestMapping(value = { "ddd2" }, method = RequestMethod.POST)

	public List<String> getUserList2(String name, String id) {

		System.out.println("ddddd=====" + name);
		System.out.println("id=====" + id);

		return null;

	}

	@RequestMapping(value = { "333" }, method = RequestMethod.POST)

	public List<String> fsfddsf(String name, @RequestBody String id) {

		System.out.println("ddddd=====" + name);
		System.out.println("id=====" + id);

		return null;

	}
}
