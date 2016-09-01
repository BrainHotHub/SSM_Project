package crm.com.controller;

import java.io.File;
import javax.servlet.http.HttpServletRequest;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;

@Controller
public class UploadController {
	private final Logger log=LoggerFactory.getLogger(UploadController.class); 

	@RequestMapping(value="/preUpload",method=RequestMethod.POST)
	public String uplpad(@RequestParam("file") MultipartFile file,HttpServletRequest request,ModelMap model ){
		System.out.println("开始上传图片....");
		String path=request.getSession().getServletContext().getRealPath("upload");
	    String fileName=file.getOriginalFilename();
	    System.out.println(path);
	    
	    File targetFile=new File(path,fileName);
	    if(!targetFile.exists()){
	    	targetFile.mkdirs();//创建目录
	    }
	    try {
			file.transferTo(targetFile);
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
	     model.addAttribute("fileUrl", "/upload/"+fileName);
	     return "result";
	}
	@RequestMapping(value="/uploadlist",method=RequestMethod.GET)
	public String uddd(Model model){
		log.info("进入页面");
		return "upload";
	}
	
	@RequestMapping(value="/aaaaaaaaaaaaaa",method=RequestMethod.POST)
	public String aa(){
		return "result";
	}
}
