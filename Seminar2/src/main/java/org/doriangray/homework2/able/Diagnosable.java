package org.doriangray.homework2.able;

import org.doriangray.Animal;
import org.doriangray.homework2.impl.Nurse;

public interface Diagnosable {
    void getDiagnosis(Animal animal);
    void instruct(Nurse nurse, Animal animal);

}
