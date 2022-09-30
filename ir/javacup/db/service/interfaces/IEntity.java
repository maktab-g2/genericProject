package ir.javacup.db.service.interfaces;

public interface IEntity<I> {

	void setId(I id);
	
	I getId();
}
