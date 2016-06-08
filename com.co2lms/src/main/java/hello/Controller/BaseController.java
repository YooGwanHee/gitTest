package hello.Controller;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import hello.repository.HelloRepository;

@RestController
public class BaseController {

	@Autowired
	HelloRepository helloRepository;
	
    @RequestMapping("/baseTest")
    public String baseTest() {
    	System.out.println("<helloRepository>"+helloRepository.findByName("yoo"));
        return "baseTest";

    }
    
    @RequestMapping("/baseMaps")
    public String baseMaps( @RequestParam Map<String, Object> maps) {
    	maps.put("val", "����");
        return "baseMaps?val="+maps.get("val");

    }
    
//    @RequestMapping("/baseSave")
//    public void save(Param param) {
//    	param.setPname("what");
//    	helloRepository.save(param);
////    	System.out.println("<helloRepository>"+helloRepository.save(Param param));
////        return "<script type=\"text/javascript\">alert('hello there, I am JavaScript - x is '+x);</script>";
//    }

}
