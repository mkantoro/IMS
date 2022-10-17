package pl.mkantorosinski.ims.entity;


import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "items_properties")
@NoArgsConstructor
@Getter
@Setter
public class ItemProp {

    public ItemProp(Date prodDate, String inventoryNum, Date usingDate, Department department, String room, int respUser, String invoice, String notice, Item item) {
        this.prodDate = prodDate;
        this.inventoryNum = inventoryNum;
        this.usingDate = usingDate;
        this.department = department;
        this.room = room;
        this.respUser = respUser;
        this.invoice = invoice;
        this.notice = notice;
        this.item = item;
    }

    @Id
    private long id;
    @Column(name = "prod_date")
    private Date prodDate;
    @Column(name= "inventory_num")
    private String inventoryNum;
    @Column(name = "using_date")
    private Date usingDate;
    @ManyToOne
    @JoinColumn(name="department")
    private Department department; //powiązać z department
    private String room;
    @Column(name="user_resp")
    private int respUser; //powiązać z user
    private String invoice;
    @Column(name = "notices")
    private String notice;
    @OneToOne(mappedBy = "property")
    private Item item;
}
