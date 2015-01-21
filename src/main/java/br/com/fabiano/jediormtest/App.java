package br.com.fabiano.jediormtest;

import br.com.fabiano.jediormtest.models.Cliente;
import jedi.db.engine.JediORMEngine;

public class App 
{
    public static void main( String[] args )
    {
        System.out.println( JediORMEngine.getSQL( Cliente.class ) );
    }
}
