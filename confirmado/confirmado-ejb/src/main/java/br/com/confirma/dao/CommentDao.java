package br.com.confirma.dao;

import java.util.List;

import javax.ejb.Local;

import br.com.confirma.BlogEntry;
import br.com.confirma.Comment;
import br.com.confirma.dao.common.Dao;

@Local
public interface CommentDao extends Dao<Comment> {

	List<Comment> findComments(BlogEntry blogEntry);

}
