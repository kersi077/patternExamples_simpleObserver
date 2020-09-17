package org.kersevanivan;

/**
 * <p>Title: Subject</p>
 * <p>Description: </p>
 * <p>Copyright: Copyright (c) 2020 ec-logic GmbH, Fuerth, germany</p>
 * <p>Company: ec-logic GmbH</p>
 * <p>$LastChangedRevision: $</p>
 * <p>$Id: $</p>
 * <p>$LastChangedDate: $</p>
 * <p>$HeadURL: $</p>
 *
 * @author ivan
 * @version 17.09.20 10:02
 */
public interface Subject {

    public void register(Observer observer);

    public void callObserver();
}
