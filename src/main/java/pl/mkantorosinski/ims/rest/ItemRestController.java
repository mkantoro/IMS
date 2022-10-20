package pl.mkantorosinski.ims.rest;


import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import pl.mkantorosinski.ims.entity.Item;
import pl.mkantorosinski.ims.rest.dto.ItemCreateDto;
import pl.mkantorosinski.ims.service.ItemService;

@RestController
@RequestMapping("/item")
@RequiredArgsConstructor
public class ItemRestController {

    private final ItemService itemService;

    @PostMapping
    public void create(@RequestBody ItemCreateDto itemCreateDto){
        itemService.create(itemCreateDto);
    }


}
