package hello;

import org.springframework.web.bind.annotation.RestController;

import hello.domain.Hello;
import hello.repository.HelloRepository;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

@RestController
public class HelloController {

	@Autowired
	HelloRepository helloRepository;
	
    @RequestMapping("/")
    public String index() {
    	System.out.println("<helloRepository>"+helloRepository.findByName("yoo"));
        return "baseTest";
//        return "<script type=\"text/javascript\">alert('hello there, I am JavaScript - x is '+x);</script>";

    }
    
    @RequestMapping("/findAll")
    public List<Hello> findAll() {
//    	param.setPname("what");
//    	Hello hello = new Hello();
//    	hello.setName("what");
    	List<Hello> list = (List<Hello>) helloRepository.findAll();
//    	model.addAttribute("helloList", hello.getName());
//    	List<Hello> list = helloRepository.findByName(hello);
//    	System.out.println("<helloRepository>"+helloRepository.save(Param param));
        return list;
    }
    
    @RequestMapping("/save")
    public void save() {
//    	param.setPname("what");
    	Hello hello = new Hello();
    	hello.setName("what");
    	helloRepository.save(hello);
//    	model.addAttribute("helloList", hello.getName());
//    	List<Hello> list = helloRepository.findByName(hello);
//    	System.out.println("<helloRepository>"+helloRepository.save(Param param));
//        return "save";
    }
    
    @RequestMapping("/update")
    public void update(ModelMap model) {
    	Hello hello2 = new Hello();
    	hello2.setId(66);
    	hello2.setName("updateNm");
    	
    	helloRepository.save(hello2);
//    	model.addAttribute("helloList", hello.getName());
//    	List<Hello> list = helloRepository.findByName(hello);
//    	System.out.println("<helloRepository>"+helloRepository.save(Param param));
//        return "save";
    }
    
    @RequestMapping("/delete")
    public void delete(ModelMap model) {
    	Hello hello2 = new Hello();
    	hello2.setId(130);
    	
    	helloRepository.delete(hello2);
//    	model.addAttribute("helloList", hello.getName());
//    	List<Hello> list = helloRepository.findByName(hello);
//    	System.out.println("<helloRepository>"+helloRepository.save(Param param));
//        return "save";
    }
    
    @RequestMapping("/deleteAll")
    public void deleteAll(ModelMap model) {
    	helloRepository.deleteAll();
    }

}