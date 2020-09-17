package org.kersevanivan;

/**
 * <p>Title: StringObserver</p>
 * <p>Description: </p>
 * <p>Copyright: Copyright (c) 2020 ec-logic GmbH, Fuerth, germany</p>
 * <p>Company: ec-logic GmbH</p>
 * <p>$LastChangedRevision: $</p>
 * <p>$Id: $</p>
 * <p>$LastChangedDate: $</p>
 * <p>$HeadURL: $</p>
 *
 * @author ivan
 * @version 17.09.20 09:46
 */
public class StringObserver implements Observer {

    @Override
    public void update() {
        System.out.println("Da hat sich aber etwas gändert.");
    }
}
