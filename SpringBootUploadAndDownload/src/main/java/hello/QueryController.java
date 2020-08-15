package hello;

import java.io.IOException;
import java.util.Random;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import hello.storage.StorageService;

@Controller
public class QueryController {

	private final StorageService storageService;

	@Autowired
	public QueryController(StorageService storageService) {
		this.storageService = storageService;
	}

	@GetMapping("/111")
	public String listUploadedFiles(Model model) throws IOException {

		

		return "111";
	}
	
	@RequestMapping(value = "getotp", method=RequestMethod.GET)
    @ResponseBody
    public String getOtp(@RequestParam(name = "telephone") String telphone) {
        //需要按照一定的规则生成OTP验证码
        Random random = new Random();
        int randomInt = random.nextInt(99999);
        randomInt += 10000;
        String otpCode = String.valueOf(randomInt);

        return "";
    }

}
