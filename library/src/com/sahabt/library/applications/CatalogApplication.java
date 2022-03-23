package com.sahabt.library.applications;

import java.util.Optional;

import com.sahabt.library.domain.catalog.BookId;
import com.sahabt.library.domain.catalog.Catalog;

public interface CatalogApplication {

	Optional<Catalog> hireCatalog(Catalog catalog);
	Optional<Catalog> fireCatalog(BookId bookId);
	Optional<Catalog> editCatalog(Catalog catalog);
	Optional<Catalog> getInformationBook(BookId bookId);
	

}
