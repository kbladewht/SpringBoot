package hello.web;

import java.util.List;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import io.swagger.annotations.ApiOperation;

@RestController

@RequestMapping(value = "/users")
public class QueryController2 {

	@RequestMapping(value = { "" }, method = RequestMethod.GET)
	 @ApiOperation(value="获取所有用户列表", notes="")
	public List<String> getUserList() {

		return null;

	}
}
