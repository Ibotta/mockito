package org.mockito.usage.binding;

import org.junit.Test;
import org.mockito.Mockito;


public class OverriddenIntrefaceMethodTest {


    @Test
    public void virtualMethodTableBinding() throws Exception {
        IDerivedInterface mock = Mockito.mock(IDerivedInterface.class);

        ClassUseDerivedInterface superDerived = new ClassUseDerivedInterface(mock);
        Message message = new Message("Shake it baby");


        superDerived.print(message);

        Mockito.verify(mock).print(message);
    }
}