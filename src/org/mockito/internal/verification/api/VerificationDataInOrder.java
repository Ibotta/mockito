/*
 * Copyright (c) 2007 Mockito contributors
 * This program is made available under the terms of the MIT License.
 */
package org.mockito.internal.verification.api;

import org.mockito.internal.invocation.InvocationMatcher;
import org.mockito.invocation.Invocation;

import java.util.List;

public interface VerificationDataInOrder {

    List<Invocation> getAllInvocations();

    InvocationMatcher getWanted();   
    
    InOrderContext getOrderingContext(); 
    
}