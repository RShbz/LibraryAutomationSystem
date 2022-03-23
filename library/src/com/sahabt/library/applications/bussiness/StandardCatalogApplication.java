package com.sahabt.library.applications.bussiness;

import java.util.Optional;

import com.sahabt.library.applications.CatalogApplication;
import com.sahabt.library.domain.catalog.Author;
import com.sahabt.library.domain.catalog.Available;
import com.sahabt.library.domain.catalog.BookId;
import com.sahabt.library.domain.catalog.Catalog;
import com.sahabt.library.domain.catalog.ISBN;
import com.sahabt.library.domain.catalog.Language;
import com.sahabt.library.domain.catalog.Periodical;
import com.sahabt.library.domain.catalog.PublishDate;
import com.sahabt.library.domain.catalog.PublishingHouse;
import com.sahabt.library.domain.catalog.Title;
import com.sahabt.library.domain.catalog.Topic;
import com.sahabt.library.domain.catalog.Type;
import com.sahabt.library.domain.catalog.UseTarget;

public class StandardCatalogApplication implements CatalogApplication {

	@Override
	public Optional<Catalog> addCatalog(Catalog catalog) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Optional<Catalog> removeCatalog(BookId bookId) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Optional<Catalog> editCatalog(Catalog catalog) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Optional<Catalog> getInformationBook(BookId bookId) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Optional<Catalog> getFindBookByIsbn(ISBN isbn) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Optional<Catalog> getFindBookByAuthor(Author author) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Optional<Catalog> getFindBookByTitle(Title title) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Optional<Catalog> getFindBookByPublishDate(PublishDate publishDate) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Optional<Catalog> getFindBookByPublishigHouse(PublishingHouse publishingHouse) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Optional<Catalog> getFindBookByLanguage(Language language) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Optional<Catalog> getFindBookByType(Type type) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Optional<Catalog> getFindBookByTitle(Topic topic) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Optional<Catalog> getFindBookByUseTarget(UseTarget useTarget) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Optional<Catalog> getFindBookByPeriodical(Periodical periodical) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Optional<Catalog> getFindBookByAvailable(Available available) {
		// TODO Auto-generated method stub
		return null;
	}

	

}
