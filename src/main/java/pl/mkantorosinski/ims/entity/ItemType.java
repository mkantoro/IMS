package pl.mkantorosinski.ims.entity;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name="items_type")
@NoArgsConstructor
@Getter
@Setter
public class ItemType {

    public ItemType(String name, String notice) {
        this.name = name;
        this.notice = notice;
    }

    @Id
    @Column(unique = true)
    private long id;
    private String name;
    private String notice;

    @OneToMany(mappedBy = "type")
    private List<Item> items;

}
