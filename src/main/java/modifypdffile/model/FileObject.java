package modifypdffile.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "FileTable")
@Data
public class FileObject {
    @Id
    private String id;
    private String name;
    private String type;
    private byte[] data;

    public FileObject(){

    }

    public FileObject(String id, String name, String type, byte[] data) {
        this.id = id;
        this.name = name;
        this.type = type;
        this.data = data;
    }
}
