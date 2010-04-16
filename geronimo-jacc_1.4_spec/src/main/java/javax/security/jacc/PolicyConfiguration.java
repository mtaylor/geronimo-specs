/*
 * Licensed to the Apache Software Foundation (ASF) under one
 * or more contributor license agreements.  See the NOTICE file
 * distributed with this work for additional information
 * regarding copyright ownership.  The ASF licenses this file
 * to you under the Apache License, Version 2.0 (the
 * "License"); you may not use this file except in compliance
 * with the License.  You may obtain a copy of the License at
 *
 *  http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing,
 * software distributed under the License is distributed on an
 * "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 * KIND, either express or implied.  See the License for the
 * specific language governing permissions and limitations
 * under the License.
 */

//
// This source code implements specifications defined by the Java
// Community Process. In order to remain compliant with the specification
// DO NOT add / change / or delete method signatures!
//

package javax.security.jacc;

import java.security.Permission;
import java.security.PermissionCollection;

/**
 * @version $Rev$ $Date$
 */
public interface PolicyConfiguration {

    public String getContextID() throws PolicyContextException;
    
    public void addToRole(String roleName, PermissionCollection permissions) throws PolicyContextException;
    
    public void addToRole(String roleName, Permission permission) throws PolicyContextException;
    
    public void addToUncheckedPolicy(PermissionCollection permissions) throws PolicyContextException;
    
    public void addToUncheckedPolicy(Permission permission) throws PolicyContextException;
    
    public void addToExcludedPolicy(PermissionCollection permissions) throws PolicyContextException;
    
    public void addToExcludedPolicy(Permission permission) throws PolicyContextException;
    
    public void removeRole(String roleName) throws PolicyContextException;
    
    public void removeUncheckedPolicy() throws PolicyContextException;
    
    public void removeExcludedPolicy() throws PolicyContextException;
    
    public void linkConfiguration(PolicyConfiguration link) throws PolicyContextException;
    
    public void delete() throws PolicyContextException;
    
    public void commit() throws PolicyContextException;
    
    public boolean inService() throws PolicyContextException;
}
