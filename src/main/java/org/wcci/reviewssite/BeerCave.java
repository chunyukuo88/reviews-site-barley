package org.wcci.reviewssite;

//
//�Atenci�n!  This class is analagous to the other two ...Storage.java classes.
//

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class BeerCave {
	@Autowired
	BeerRepository beerRepo;
	@Autowired
	private BrewingCompanyRepository breweryRepo;

	public Beer findBeer(Long id) {
		return beerRepo.findById(id).get();
	}

	public Iterable<Beer> findAllTheBeers() {
		return beerRepo.findAll();
	}

	public void add(Beer beer) {
		breweryRepo.save(beer.getBrewery());
		beerRepo.save(beer);
	}
}
