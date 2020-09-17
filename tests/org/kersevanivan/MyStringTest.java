package org.kersevanivan;

import org.junit.Test;

/**
 * <p>Title: MyStringTest</p>
 * <p>Description: </p>
 * <p>Copyright: Copyright (c) 2020 ec-logic GmbH, Fuerth, germany</p>
 * <p>Company: ec-logic GmbH</p>
 * <p>$LastChangedRevision: $</p>
 * <p>$Id: $</p>
 * <p>$LastChangedDate: $</p>
 * <p>$HeadURL: $</p>
 *
 * @author ivan
 * @version 17.09.20 09:41
 */
public class MyStringTest {

    @Test (expected = NullPointerException.class )
    public void testSetStringNull() {
        MyString myTestString = new MyString();
        myTestString.setString(null);
    }
}
