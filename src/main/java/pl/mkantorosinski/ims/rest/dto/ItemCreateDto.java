package pl.mkantorosinski.ims.rest.dto;

import lombok.Builder;
import lombok.Getter;
import pl.mkantorosinski.ims.entity.ItemProp;
import pl.mkantorosinski.ims.entity.ItemType;


@Getter
@Builder
public class ItemCreateDto {


    private String name;

    private ItemType type;

    private ItemProp properties;


}
