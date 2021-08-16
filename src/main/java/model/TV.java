package model;

import iterator.Collection;
import iterator.Iterator;

public class TV implements Collection {

    private final String[] channels;

    public TV(String[] channels) {
        this.channels = channels;
    }

    @Override
    public Iterator getIterator() {
        return new ChannelIterator();
    }

    private class ChannelIterator implements Iterator{
        int index;

        @Override
        public boolean hasNext() {
            return index < channels.length;
        }

        @Override
        public Object next() {
            return channels[index++];
        }
    }

}
