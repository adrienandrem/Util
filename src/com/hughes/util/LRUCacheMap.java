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

import java.util.LinkedHashMap;

/** Least recently used cache map. */
public class LRUCacheMap<K,V> extends LinkedHashMap<K, V> {

    private static final long serialVersionUID = 197833078417223126L;

    private final int maxSize;

    /** Builds a LRUCacheMap. */
    public LRUCacheMap(final int maxSize) {
        // we do not want re-hashing, so manually apply a
        // load factor and set the load factor argument to a high value
        super(maxSize*3/2, 1.0f, true);
        this.maxSize = maxSize;
    }

    /** Remove the least recently used item. */
    @Override
    protected boolean removeEldestEntry(java.util.Map.Entry<K, V> eldest) {
        return this.size() > maxSize;
    }

}
