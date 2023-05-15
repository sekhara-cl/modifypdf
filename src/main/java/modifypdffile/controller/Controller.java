package modifypdffile.controller;

import com.itextpdf.text.DocumentException;
import modifypdffile.service.FileObjectService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;

@RestController
@RequestMapping("/api")
public class Controller {

    @Autowired
    private FileObjectService fileObjectService;


   @PostMapping("/")
    public  uploadPdf(@RequestParam("file") MultipartFile file,String text) throws DocumentException, IOException {


       fileObjectService.updatePdf(file,text);





    }
}
