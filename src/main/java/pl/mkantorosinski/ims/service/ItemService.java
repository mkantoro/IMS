package pl.mkantorosinski.ims.service;


import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import pl.mkantorosinski.ims.entity.Item;
import pl.mkantorosinski.ims.repository.ItemRepository;
import pl.mkantorosinski.ims.rest.dto.ItemCreateDto;

@Service
@RequiredArgsConstructor
public class ItemService {

    private final ItemRepository itemRepository;

    public void create(ItemCreateDto itemCreateDto){
        Item itemToSave;
        itemToSave = new Item(itemCreateDto.getName(), itemCreateDto.getType(),itemCreateDto.getProperties());
        itemRepository.save(itemToSave);
    }
}
