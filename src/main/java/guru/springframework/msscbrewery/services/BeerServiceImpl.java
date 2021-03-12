package guru.springframework.msscbrewery.services;
import guru.springframework.msscbrewery.web.model.BeerDto;
import org.springframework.stereotype.Service;
import java.util.UUID;

@Service
public class BeerServiceImpl implements BeerService {

    @Override
    public BeerDto getBeerById(UUID beerId) {
        return BeerDto.builder()
                .id(UUID.randomUUID())
                .beerStyle("Pale Ale")
                .beerName("Galaxy Cat")
                .upc(1234L)
                .build();
    }

    @Override
    public BeerDto saveNewBeer(BeerDto beerDto) {
        return BeerDto.builder()
                .id(UUID.randomUUID())
                .build();
    }

    @Override
    public void updateBeer(UUID beerId, BeerDto beerDto) {

    }
}
