package pl.mkantorosinski.ims.entity;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Table(name = "items")
@NoArgsConstructor
@Setter
@AllArgsConstructor
public class Item {

    public Item(String name, ItemType type, ItemProp property) {
        this.name = name;
        this.type = type;
        this.property = property;
    }

    @Id
    private long id;
    private String name;

    @ManyToOne
    @JoinColumn(name = "type")
    private ItemType type;


    @OneToOne
    @JoinColumn(name = "properties")
    private ItemProp property;

}
