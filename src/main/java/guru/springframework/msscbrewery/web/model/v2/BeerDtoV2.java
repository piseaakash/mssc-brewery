package guru.springframework.msscbrewery.web.model.v2;

import java.util.UUID;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data//getters, setters, equals and hashcode methods
@NoArgsConstructor
@AllArgsConstructor
@Builder//Implement the Builder pattern
public class BeerDtoV2 {
	private UUID id; 
	private String beerName;
	private BeerStyleEnum beerStyle;
	private Long upc;
}
