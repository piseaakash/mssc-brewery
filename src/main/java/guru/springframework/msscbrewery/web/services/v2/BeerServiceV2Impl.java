package guru.springframework.msscbrewery.web.services.v2;

import java.util.UUID;

import org.springframework.stereotype.Service;

import guru.springframework.msscbrewery.web.model.v2.BeerDtoV2;
import lombok.extern.slf4j.Slf4j;

@Slf4j
@Service
public class BeerServiceV2Impl implements BeerServiceV2{public BeerDtoV2 getBeerById(UUID beerId) {
		// TODO Auto-generated method stub
		return null;
	}

	public BeerDtoV2 saveNewBeer(BeerDtoV2 beerDto) {
		// TODO Auto-generated method stub
		return null;
	}

	public void updateBeer(UUID beerId, BeerDtoV2 beerDto) {
		// TODO Auto-generated method stub
		
	}

	public void deleteById(UUID beerId) {
		// TODO Auto-generated method stub
		
	}

}
