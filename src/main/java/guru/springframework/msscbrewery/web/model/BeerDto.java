package guru.springframework.msscbrewery.web.model;

import java.util.UUID;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data//getters, setters, equals and hashcode methods
@NoArgsConstructor
@AllArgsConstructor
@Builder//Implement the Builder pattern
public class BeerDto {
	private UUID id; 
	private String beerName;
	private String beerStyle;
	private Long upc;
}
