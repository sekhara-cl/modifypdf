package modifypdffile.controller;

import modifypdffile.model.FileObject;
import modifypdffile.repository.FileObjectRepository;
import modifypdffile.service.FileObjectService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;

@RestController
@RequestMapping("/api")
public class FileObjectController {

    @Autowired
    private FileObjectService fileObjectService;
//    @PostMapping("/save")
//    public FileObject save(@RequestParam("api") MultipartFile file) throws IOException {
//        return fileObjectService.saveFile(file);
//    }
}
