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

public abstract class ForwardingIteratorState<Item, Itble extends BidiIterable<Item>, State extends
    ForwardingIteratorState<Item, Itble, State>>
    extends IterableAware<Item, Itble>
    implements BidiIteratorState<Item, State> {

    private final BidiIteratorState<Item, State> delegateIteratorState;

    protected ForwardingIteratorState(final Itble iterable,
                                      final BidiIteratorState<Item, State> delegateIteratorState) {
        super(iterable);

        this.delegateIteratorState = delegateIteratorState;
    }

    protected BidiIteratorState<Item, State> getDelegateIteratorState() {
        return delegateIteratorState;
    }

    @Override
    public State previousState() {
        return delegateIteratorState.previousState();
    }

    @Override
    public State nextState() {
        return delegateIteratorState.nextState();
    }

    @Override
    public boolean hasNext() {
        return delegateIteratorState.hasNext();
    }

    @Override
    public Item next()
        throws NoNextItemException {
        return delegateIteratorState.next();
    }

    @Override
    public boolean hasPrevious() {
        return delegateIteratorState.hasPrevious();
    }

    @Override
    public Item previous()
        throws NoPreviousItemException {
        return delegateIteratorState.previous();
    }
}
