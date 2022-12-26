package com.springBoot.Service;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;

import javax.servlet.ServletContext;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

@Service
public class AddPropertyService {
	

	
    @Autowired
    ServletContext ctx;
    public final String uploadDirectory = "D:\\SEMESTER 5\\crudOperation - Copy\\SpringBootLearningProject\\src\\main\\resources\\static\\uploadImage";
//    public final String uploadDirectory = new ClassPathResource("static/images/").getFile().getAbsolutePath();

    public boolean uploadFile(MultipartFile file)
    {
        boolean fileUploaded = false;
        try{
            Files.copy(file.getInputStream(), Paths.get(uploadDirectory+ File.separator+file.getOriginalFilename()), StandardCopyOption.REPLACE_EXISTING);
            fileUploaded = true;
        }catch(Exception e){
          e.printStackTrace();
        }
        return fileUploaded;
    }

    public AddPropertyService() throws IOException
    {
    }


    
}
