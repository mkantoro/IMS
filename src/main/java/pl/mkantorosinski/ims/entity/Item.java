package pl.mkantorosinski.ims.entity;

import lombok.*;

import javax.persistence.*;

@Entity
@Table(name = "items")
@NoArgsConstructor
@Setter
@AllArgsConstructor
@Getter
@Builder
public class Item {

    public Item(String name, ItemType type, ItemProp property) {
        this.name = name;
        this.type = type;
        this.property = property;
    }

    @Id
    private Long id;
    private String name;

    @ManyToOne
    @JoinColumn(name = "type")
    private ItemType type;


    @OneToOne
    @JoinColumn(name = "properties")
    private ItemProp property;

}
