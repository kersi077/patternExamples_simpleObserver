package org.kersevanivan;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/**
 * <p>Title: MyString</p>
 * <p>Description: </p>
 * <p>$LastChangedRevision: $</p>
 * <p>$Id: $</p>
 * <p>$LastChangedDate: $</p>
 * <p>$HeadURL: $</p>
 *
 * @author ivan
 * @version 17.09.20 09:36
 */
public class MyString implements Subject {

    private String anyString;
    private final List<Observer> observer =  new ArrayList<>();

    /**
     * @param anyString - nonNull.
     */
    public void setString(String anyString) {
        Objects.requireNonNull(anyString);
        this.anyString = anyString;
        callObserver();
    }
    @Override
    public void register(Observer observer) {
        Objects.requireNonNull(observer,"Bitte keine Null fuer observer.");
        this.observer.add( observer );
    }
    @Override
    public void callObserver() {
        observer.forEach(currentObserver -> currentObserver.update());

       // for(int index=0; index < observer.size(); index++) {
       //     Observer currentObserver = observer.get(index);
       //     currentObserver.update();
       // }

        // for(int index=0; index < observer.size(); index++) {
        //    observer.get(index).update();
        // }


    }
}
