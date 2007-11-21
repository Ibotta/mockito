package org.mockito.internal;

public class Namer {

    public static String nameForMock(Object mock) {
    	if (mock.getClass().getInterfaces().length == 2) {
    		return mock.getClass().getInterfaces()[0].getSimpleName();
    	} else {
    		return mock.getClass().getSuperclass().getSimpleName();
    	}
    }
}