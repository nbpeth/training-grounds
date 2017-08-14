package com.training.grounds;

import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.*;

public class FunWithCollectionsTest {

    private FunWithCollections funWithCollections;

    @Before
    public void setup(){
        funWithCollections = new FunWithCollections();
    }

//    @Test
//    public void canFillAnArrayWithStrings(){
//        Object[] expected = new Object[]{"admiral","ackbar","potato","wedges"};
//
//        Object[] result = funWithCollections.fillArray("admiral","ackbar","potato","wedges");
//
//        assertArrayEquals(result,expected);
//    }
//
//    @Test
//    public void canFillAnArrayWithDifferentStrings(){
//        Object[] expected = new Object[]{"bad","cheese","tomorrow"};
//
//        Object[] result = funWithCollections.fillArray("bad","cheese","tomorrow");
//
//        assertArrayEquals(result,expected);
//    }
//
//    @Test
//    public void canFillAnArrayWithWithIntegers(){
//        Object[] expected = new Object[]{1,2,3,4,5,6,7,8};
//
//        Object[] result = funWithCollections.fillArray(1,2,3,4,5,6,7,8);
//
//        assertArrayEquals(result,expected);
//    }
//
//    @Test
//    public void canFillAnArrayList(){
//        List<Object> expected = new ArrayList<>(Arrays.asList("admiral","ackbar","potato","wedges"));
//
//        List<Object> result = funWithCollections.fillArrayList("admiral","ackbar","potato","wedges");
//
//        assertEquals(expected.toString(), result.toString());
//    }
//
//    @Test
//    public void canFillAnArrayListWithDifferentStrings(){
//        List<Object> expected = new ArrayList<>(Arrays.asList("bad","cheese","tomorrow"));
//
//        List<Object> result = funWithCollections.fillArrayList("bad","cheese","tomorrow");
//
//        assertEquals(expected.toString(), result.toString());
//    }
//
//    @Test
//    public void canFillAnArrayListWithIntegers(){
//        List<Object> expected = new ArrayList<>(Arrays.asList(2,4,6,8,10,12));
//
//        List<Object> result = funWithCollections.fillArrayList(2,4,6,8,10,12);
//
//        assertEquals(expected.toString(), result.toString());
//    }
//
//    @Test
//    public void canFillAnArrayListWithDifferentIntegers(){
//        List<Object> expected = new ArrayList<>(Arrays.asList(12,13,14,15,16,17,18,19));
//
//        List<Object> result = funWithCollections.fillArrayList(12,13,14,15,16,17,18,19);
//
//        assertEquals(expected.toString(), result.toString());
//    }
//
//    @Test
//    public void canSortAnArrayListOfStrings(){
//        List<String> expected = new ArrayList<>(Arrays.asList("alpha","bellow","cello","potato","theta","zeta"));
//
//        List<Object> result = funWithCollections.sort(new ArrayList<>(Arrays.asList("theta","zeta","alpha","potato","cello","bellow")));
//
//        assertEquals(expected.toString(), result.toString());
//    }
//
//    @Test
//    public void canSortAnArrayListOfIntegers(){
//        List<Integer> expected = new ArrayList<>(Arrays.asList(-2,0,1,2,3,5,30,100,3000));
//
//        List<Object> result = funWithCollections.sort(new ArrayList<>(Arrays.asList(5,1,3,30,0,100,2,3000,-2)));
//
//        assertEquals(expected.toString(), result.toString());
//    }
//
//    @Test
//    public void getListReturnsThisList(){
//        List<Object> expected = new ArrayList<>(Arrays.asList(-2,0,1,2,3,5,30,100,3000));
//        funWithCollections = new FunWithCollections(expected);
//
//        List<Object> result = funWithCollections.getList();
//
//        assertEquals(expected.toString(), result.toString());
//
//    }
//
//    @Test
//    public void getListReturnsThisDifferentList(){
//        List<Object> list = new ArrayList<>(Arrays.asList("alpha","bellow","cello","potato","theta","zeta"));
//        funWithCollections = new FunWithCollections(list);
//
//        List<Object> result = funWithCollections.getList();
//
//        assertEquals(list.toString(), result.toString());
//
//    }


}
