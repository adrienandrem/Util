// Copyright 2011 Google Inc. All Rights Reserved.
//
// Licensed under the Apache License, Version 2.0 (the "License");
// you may not use this file except in compliance with the License.
// You may obtain a copy of the License at
//
//     http://www.apache.org/licenses/LICENSE-2.0
//
// Unless required by applicable law or agreed to in writing, software
// distributed under the License is distributed on an "AS IS" BASIS,
// WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
// See the License for the specific language governing permissions and
// limitations under the License.

package com.hughes.util;

/** An object that knows its position (index) inside a list. */
public class IndexedObject {

    /** Position in list. */
    protected int index;

    /** Build IndexedObject.
     * 
     * @param index position */
    @SuppressWarnings("WeakerAccess")
    public IndexedObject(final int index) {
        this.index = index;
    }

    /** Position in list. */
    public int index() {
        return index;
    }

}
