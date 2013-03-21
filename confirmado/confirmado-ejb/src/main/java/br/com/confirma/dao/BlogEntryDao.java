package br.com.confirma.dao;

import java.util.List;

import javax.ejb.Local;

import br.com.confirma.BlogEntry;
import br.com.confirma.dao.common.Dao;

@Local
public interface BlogEntryDao extends Dao<BlogEntry> {

	List<BlogEntry> find(int maxresults, int firstresult);

	Long count();

}
