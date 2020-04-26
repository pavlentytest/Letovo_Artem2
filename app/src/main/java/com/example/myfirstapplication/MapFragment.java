package com.example.myfirstapplication;

import android.content.Context;
import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.navigation.fragment.NavHostFragment;

import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.google.android.gms.common.GooglePlayServicesNotAvailableException;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.MapView;
import com.google.android.gms.maps.MapsInitializer;
import com.google.android.gms.maps.OnMapReadyCallback;
import com.google.android.gms.maps.SupportMapFragment;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.Marker;
import com.google.android.gms.maps.model.MarkerOptions;

import java.util.Map;


/**
 * A simple {@link Fragment} subclass.
 */
public class MapFragment extends Fragment implements OnMapReadyCallback {

    private GoogleMap mMap;
    private MapView mapView;
    private int current_year;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_map, container, false);
        Bundle args = getArguments();
        if (args != null) {
            current_year = getArguments().getInt("year");
        }
        mapView = view.findViewById(R.id.map);
        mapView.onCreate(savedInstanceState);
        mapView.getMapAsync(this);
        return view;
    }

    public void onViewCreated(@NonNull View view, Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        view.findViewById(R.id.button_back).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                NavHostFragment.findNavController(MapFragment.this)
                        .navigate(R.id.action_mapFragment3_to_SecondFragment);
            }
        });
    }


    @Override
    public void onMapReady(GoogleMap googleMap) {
        mMap = googleMap;
        MapsInitializer.initialize(this.getActivity());
        // Add a marker in Sydney and move the camera

        if (current_year == 1800)
        {
            final LatLng year1800test = new LatLng(0, 0);
            Marker mYear1800test;
            mYear1800test = mMap.addMarker(new MarkerOptions()
                    .position(year1800test)
                    .draggable(false)
                    .title("Test 1800"));
            mYear1800test.setTag(0);
        }
        else if(current_year == 1810)
        {
            final LatLng year1810test = new LatLng(20, 20);
            Marker mYear1810test;
            mYear1810test = mMap.addMarker(new MarkerOptions()
                    .position(year1810test)
                    .draggable(false)
                    .title("Test 1810"));
            mYear1810test.setTag(0);
        }
        else if(current_year == 1820)
        {
            final LatLng year1820test = new LatLng(30, 30);
            Marker mYear1820test;
            mYear1820test = mMap.addMarker(new MarkerOptions()
                    .position(year1820test)
                    .draggable(false)
                    .title("Test 1820"));
            mYear1820test.setTag(0);
        }
        else if(current_year == 1830)
        {
            final LatLng year1830test = new LatLng(40, 40);
            Marker mYear1830test;
            mYear1830test = mMap.addMarker(new MarkerOptions()
                    .position(year1830test)
                    .draggable(false)
                    .title("Test 1830"));
            mYear1830test.setTag(0);
        }
        else if(current_year == 1840)
        {
            final LatLng year1840test = new LatLng(50, 50);
            Marker mYear1840test;
            mYear1840test = mMap.addMarker(new MarkerOptions()
                    .position(year1840test)
                    .draggable(false)
                    .title("Test 1840"));
            mYear1840test.setTag(0);
        }
        else if(current_year == 1850)
        {
            final LatLng year1850test = new LatLng(60, 60);
            Marker mYear1850test;
            mYear1850test = mMap.addMarker(new MarkerOptions()
                    .position(year1850test)
                    .draggable(false)
                    .title("Test 1850"));
            mYear1850test.setTag(0);
        }
        else if(current_year == 1860)
        {
            final LatLng year1860test = new LatLng(70, 70);
            Marker mYear1860test;
            mYear1860test = mMap.addMarker(new MarkerOptions()
                    .position(year1860test)
                    .draggable(false)
                    .title("Test 1860"));
            mYear1860test.setTag(0);
        }
        else if(current_year == 1870)
        {
            final LatLng year1870test = new LatLng(80, 80);
            Marker mYear1870test;
            mYear1870test = mMap.addMarker(new MarkerOptions()
                    .position(year1870test)
                    .draggable(false)
                    .title("Test 1870"));
            mYear1870test.setTag(0);
        }
        else if(current_year == 1880)
        {
            final LatLng year1880test = new LatLng(90, 90);
            Marker mYear1880test;
            mYear1880test = mMap.addMarker(new MarkerOptions()
                    .position(year1880test)
                    .draggable(false)
                    .title("Test 1880"));
            mYear1880test.setTag(0);
        }
        else if(current_year == 1890)
        {
            final LatLng year1890test = new LatLng(100, 100);
            Marker mYear1890test;
            mYear1890test = mMap.addMarker(new MarkerOptions()
                    .position(year1890test)
                    .draggable(false)
                    .title("Test 1890"));
            mYear1890test.setTag(0);
        }
        else if(current_year == 1900)
        {
            final LatLng year1900test = new LatLng(110, 110);
            Marker mYear1900test;
            mYear1900test = mMap.addMarker(new MarkerOptions()
                    .position(year1900test)
                    .draggable(false)
                    .title("Test 1900"));
            mYear1900test.setTag(0);
        }
    }

    @Override
    public void onResume() {
        mapView.onResume();
        super.onResume();
    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        mapView.onDestroy();
    }
}

