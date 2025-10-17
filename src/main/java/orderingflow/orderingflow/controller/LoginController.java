package orderingflow.orderingflow;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class LoginController {
    public LoginController() {
        
    }

    @ResponseBody
    @GetMapping("login")
    public String Login() {
        return "success";
    }
}
