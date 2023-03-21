package models.exceptions;

import java.util.InputMismatchException;

public class FalhaPesquisa extends InputMismatchException  {

    public FalhaPesquisa(String msg){
        super(msg);
    }
    
}
