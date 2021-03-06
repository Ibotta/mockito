/*
 * Copyright (c) 2007 Mockito contributors
 * This program is made available under the terms of the MIT License.
 */
package org.mockitousage.debugging;

import org.junit.Test;
import org.mockito.Mock;
import org.mockitoutil.TestBase;

import static org.mockito.BDDMockito.*;

public class PrintingInvocationsDetectsUnusedStubTest extends TestBase {

    @Mock Foo mock;
    @Mock Foo mockTwo;

    @Test
    public void shouldDetectUnusedStubbingWhenPrinting() throws Exception {
        //given
        given(mock.giveMeSomeString("different arg")).willReturn("foo");
        mock.giveMeSomeString("arg");

        //when
        String log = NewMockito.debug().printInvocations(mock, mockTwo);

        //then
        assertContainsIgnoringCase("unused", log);
    }
}