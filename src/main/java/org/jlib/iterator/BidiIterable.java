/*
 * jlib - Open Source Java Library
 *
 *     www.jlib.org
 *
 *
 *     Copyright 2005-2015 Igor Akkerman
 *
 *     Licensed under the Apache License, Version 2.0 (the "License");
 *     you may not use this file except in compliance with the License.
 *     You may obtain a copy of the License at
 *
 *         http://www.apache.org/licenses/LICENSE-2.0
 *
 *     Unless required by applicable law or agreed to in writing, software
 *     distributed under the License is distributed on an "AS IS" BASIS,
 *     WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *     See the License for the specific language governing permissions and
 *     limitations under the License.
 */

package org.jlib.iterator;

import java.util.Iterator;

/**
 * {@link Object} iterable by a {@link BidiIterator}.
 *
 * @param <Item>
 *        type of items returned by the {@link Iterator}
 *
 * @author Igor Akkerman
 */
public interface BidiIterable<Item>
    extends Iterable<Item> {

    /**
     * Returns a new {@link BidiIterator} over the Items of this
     * {@link BidiIterable}.
     *
     * @return newly iterator}
     */
    @Override
    BidiIterator<Item> iterator();
}
