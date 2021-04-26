package com.example.demo.utils;

import java.util.Objects;
import java.util.function.BiConsumer;

/*****
 *@className: ForEachUtils
 *@date: 2021/4/13  17:31
 *@User: create By haha
 *
 */


public class ForEachUtils {

    public static <T> void forEach(int startIndex,Iterable<? extends T> elements, BiConsumer<Integer, ? super T> action) {
        Objects.requireNonNull(elements);
        Objects.requireNonNull(action);
        if(startIndex < 0) {
            startIndex = 0;
        }
        int index = 0;
        for (T element : elements) {
            index++;
            if(index <= startIndex) {
                continue;
            }

            action.accept(index, element);
        }
    }
}
