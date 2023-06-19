package com.laxman;
public void reverse()
        {
        var previous = first;
        var current = first.next;
        while (current!=null)
        {
        var next = current.next;
        current.next = previous;
        previous = current;
        current = next;
        }
        last = first;
        last.next = null
        first = previous;
        }