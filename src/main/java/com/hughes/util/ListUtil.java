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

import java.util.List;

/** Functions for common operations on lists. */
public final class ListUtil {

    /** Get element at given index.
     * 
     * @param defaultValue returned value if index is greater than list size */
    @SuppressWarnings("WeakerAccess")
    public static <T> T get(final List<T> list, final int index, final T defaultValue) {
        return index < list.size() ? list.get(index) : defaultValue;
    }

    /** Get element at given index. */
    @SuppressWarnings("unused")
    public static <T> T get(final List<T> list, final int index) {
        return get(list, index, null);
    }

    /** Extract element at given index.
     * 
     * element is removed from list. */
    @SuppressWarnings("unused")
    public static <T> T remove(final List<T> list, final int index, final T defaultValue) {
        return index < list.size() ? list.remove(index) : defaultValue;
    }

    /** Swap 2 elements. */
    public static <T> void swap(final List<T> list, int i1, int i2) {
        if (i1 == i2) {
            return;
        }
        T temp = list.get(i1);
        list.set(i1, list.get(i2));
        list.set(i2, temp);
    }

    public static <T> T fastRemoveWithReorder(final List<T> list, final int index) {
        swap(list, index, list.size() - 1);
        return list.remove(list.size() - 1);
    }

}
