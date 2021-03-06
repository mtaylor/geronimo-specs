/**
 *
 * Copyright 2003-2004 The Apache Software Foundation
 *
 *  Licensed under the Apache License, Version 2.0 (the "License");
 *  you may not use this file except in compliance with the License.
 *  You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 *  Unless required by applicable law or agreed to in writing, software
 *  distributed under the License is distributed on an "AS IS" BASIS,
 *  WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *  See the License for the specific language governing permissions and
 *  limitations under the License.
 */

//
// This source code implements specifications defined by the Java
// Community Process. In order to remain compliant with the specification
// DO NOT add / change / or delete method signatures!
//

package javax.resource.spi;

import javax.resource.ResourceException;

/**
 *
 *
 *
 * @version $Rev$ $Date$
 */
public class ResourceAllocationException extends ResourceException {
    public ResourceAllocationException() {
        super();
    }

    public ResourceAllocationException(String message) {
        super(message);
    }

    public ResourceAllocationException(Throwable cause) {
        super(cause);
    }

    public ResourceAllocationException(String message, Throwable cause) {
        super(message, cause);
    }

    public ResourceAllocationException(String message, String errorCode) {
        super(message, errorCode);
    }
}
