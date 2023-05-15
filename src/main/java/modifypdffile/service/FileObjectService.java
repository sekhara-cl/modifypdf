package modifypdffile.service;

import com.itextpdf.text.DocumentException;
import com.itextpdf.text.Element;
import com.itextpdf.text.pdf.BaseFont;
import com.itextpdf.text.pdf.PdfContentByte;
import com.itextpdf.text.pdf.PdfReader;
import com.itextpdf.text.pdf.PdfStamper;
import modifypdffile.model.FileObject;
import modifypdffile.repository.FileObjectRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.UUID;

@Service
public class FileObjectService {

//    @Autowired
//    private FileObjectRepository fileObjectRepository;

//    public FileObject saveFile(MultipartFile file) throws IOException {
//        String name=file.getOriginalFilename();
//        FileObject object= new FileObject(UUID.randomUUID().toString(),name,file.getContentType(),file.getBytes());
//        return fileObjectRepository.save(object );
//    }

    public PdfStamper updatePdf(MultipartFile file, String text) throws IOException, DocumentException {
        PdfReader reader=new PdfReader(file.getBytes());
        PdfStamper stamper= new PdfStamper(reader,new FileOutputStream("C:\\Users\\dell\\Downloads\\chinna.pdf"));
        PdfContentByte c=stamper.getOverContent(1);
        c.beginText();
        c.setFontAndSize(BaseFont.createFont(),15);
        c.showTextAligned(Element.ALIGN_RIGHT,text,300,600,0);
        c.endText();
        stamper.close();
        reader.close();
        return  stamper;

    }
}
