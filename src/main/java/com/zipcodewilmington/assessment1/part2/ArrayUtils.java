package com.zipcodewilmington.assessment1.part2;

import java.util.Arrays;
import java.lang.Object;

/**
 * Created by leon on 2/16/18.
 */
public class ArrayUtils {
    /**
     * @param objectArray   an array of any type of Object
     * @param objectToCount any non-primitive value
     * @return the number of times the specified `value` occurs in the specified `objectArray`
     * Given an array of objects, named `objectArray`, and an object `objectToCount`, return the number of times the `objectToCount` appears in the `objectArray`
     */
    public static Integer getNumberOfOccurrences(Object[] objectArray, Object objectToCount) {

        int counter = 0;

        for (int i = 0; i < objectArray.length; i++) {
            if (objectArray[i].equals(objectToCount)) {
                counter++;
            }
        }
        return counter;
    }

    /**
     * @param objectArray    an array of any type of Object
     * @param objectToRemove a value to be removed from the `objectArray`
     * @return an array with identical content excluding the specified `objectToRemove`
     * Given an array of objects, name `objectArray`, and an object `objectToRemove`, return an array of objects with identical contents excluding `objectToRemove`
     */
    public static Integer[] removeValue(Integer[] objectArray, Integer objectToRemove) {
        Integer[] newArr = new Integer[objectArray.length - getNumberOfOccurrences(objectArray, objectToRemove)];
        int i = 0;
        for (Integer o : objectArray) {
            if (!(o.equals(objectToRemove))) {
                newArr[i] = o;
                i++;
            }
        }
        return newArr;
    }

    /**
     * @param objectArray an array of any type of Object
     * @return the most frequently occurring object in the array
     * given an array of objects, named `objectArray` return the most frequently occuring object in the array
     */
    public static Integer getMostCommon(Integer[] objectArray) {

        Arrays.sort(objectArray);

        int maxCounter = 1;
        int currentCounter = 1;
        int common = objectArray[0];

        for (int i = 1; i < objectArray.length; i++) {
            if (objectArray[i] == objectArray[i - 1]) {
                currentCounter++;
            } else {
                if (currentCounter > maxCounter) {
                    maxCounter = currentCounter;
                    common = objectArray[i - 1];
                }
                currentCounter = 1;
            }
        }

        if (currentCounter > maxCounter) {
            maxCounter = currentCounter;
            common = objectArray[objectArray.length - 1];
        }
        return common;

    }


    /**
     * @param objectArray an array of any type of Object
     * @return the least frequently occurring object in the array
     * given an array of objects, named `objectArray` return the least frequently occuring object in the array
     */
    public static Integer getLeastCommon(Integer[] objectArray) {

        //solution doesnt work

        Arrays.sort(objectArray);

        int minCounter = 0;
        int currentCounter = 0;
        int common = objectArray[0];

        for (int i = 1; i < objectArray.length; i++) {
            if (!(objectArray[i] == objectArray[i - 1])) {
                currentCounter++;
            } else {
                if (currentCounter > minCounter) {
                    minCounter = currentCounter;
                    common = objectArray[i - 1];
                }
                currentCounter = 0;
            }
        }

        if (currentCounter > minCounter) {
            minCounter = currentCounter;
            common = objectArray[objectArray.length - 1];
        }
        return common;
    }

    /**
     * @param objectArray      an array of any type of Object
     * @param objectArrayToAdd an array of Objects to add to the first argument
     * @return an array containing all elements in `objectArray` and `objectArrayToAdd`
     * given two arrays `objectArray` and `objectArrayToAdd`, return an array containing all elements in `objectArray` and `objectArrayToAdd`
     */
    public static Integer[] mergeArrays(Integer[] objectArray, Integer[] objectArrayToAdd) {

        Integer[] newArr = new Integer[objectArray.length + objectArrayToAdd.length];

        int j = 0;

        for (Integer i : objectArray) {
            newArr[j] = i;
            j++;
        }
        for (Integer i : objectArrayToAdd) {
            newArr[j] = i;
            j++;
        }

        return newArr;
    }
}
