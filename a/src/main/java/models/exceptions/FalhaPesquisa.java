package models.exceptions;

import java.util.InputMismatchException;

public class FalhaPesquisa extends InputMismatchException  {

    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public FalhaPesquisa(String msg){
        super(msg);
    }
    
}
