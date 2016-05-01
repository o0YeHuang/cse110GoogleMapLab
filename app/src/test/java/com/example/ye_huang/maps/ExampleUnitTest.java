package com.example.ye_huang.maps;

import android.location.Location;

import com.google.android.gms.maps.model.LatLng;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * To work on unit tests, switch the Test Artifact in the Build Variants view.
 */
public class ExampleUnitTest {
    private MapsActivity mapsActivity;
    private LatLng latLng = new LatLng(32.8800604,-117.2362022);
    @Test
    public void addition_isCorrect() throws Exception {
        assertEquals(4, 2 + 2);
    }@Test
    public void detection_isCorrect() throws Exception {
        assertTrue(mapsActivity.detectIfClosed(new Location("where")));
    }
}