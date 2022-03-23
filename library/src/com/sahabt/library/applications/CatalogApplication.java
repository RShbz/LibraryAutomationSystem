package com.sahabt.library.applications;

import java.util.Optional;

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

public interface CatalogApplication {

	Optional<Catalog> addCatalog(Catalog catalog);
	Optional<Catalog> removeCatalog(BookId bookId);
	Optional<Catalog> editCatalog(Catalog catalog);
	Optional<Catalog> getInformationBook(BookId bookId);
	Optional<Catalog> getFindBookByIsbn(ISBN isbn);
	Optional<Catalog> getFindBookByAuthor(Author author);
	Optional<Catalog> getFindBookByTitle(Title title);
	Optional<Catalog> getFindBookByPublishDate(PublishDate publishDate);
	Optional<Catalog> getFindBookByPublishigHouse(PublishingHouse publishingHouse);
	Optional<Catalog> getFindBookByLanguage(Language language);
	Optional<Catalog> getFindBookByType(Type type);
	Optional<Catalog> getFindBookByTitle(Topic topic);
	Optional<Catalog> getFindBookByUseTarget(UseTarget useTarget);
	Optional<Catalog> getFindBookByPeriodical(Periodical periodical);
	Optional<Catalog> getFindBookByAvailable(Available available);
}
