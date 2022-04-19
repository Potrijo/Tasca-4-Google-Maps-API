package com.example.mapapp

import android.Manifest
import android.content.pm.PackageManager
import android.graphics.Color
import android.location.Location
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.core.app.ActivityCompat
import com.example.mapapp.databinding.ActivityMapsBinding
import com.google.android.gms.location.FusedLocationProviderClient
import com.google.android.gms.location.LocationServices
import com.google.android.gms.maps.CameraUpdateFactory
import com.google.android.gms.maps.GoogleMap
import com.google.android.gms.maps.OnMapReadyCallback
import com.google.android.gms.maps.SupportMapFragment
import com.google.android.gms.maps.model.*


class MapsActivity : AppCompatActivity(), OnMapReadyCallback {

    private lateinit var mMap: GoogleMap
    private lateinit var binding: ActivityMapsBinding
    private lateinit var fusedLocationProviderClient: FusedLocationProviderClient
    private lateinit var fusedLocationClient: FusedLocationProviderClient


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityMapsBinding.inflate(layoutInflater)
        setContentView(binding.root)

        fusedLocationProviderClient = LocationServices.getFusedLocationProviderClient(this)


        // Obtain the SupportMapFragment and get notified when the map is ready to be used.
        val mapFragment = supportFragmentManager
            .findFragmentById(R.id.map) as SupportMapFragment
        mapFragment.getMapAsync(this)
    }

    /**
     * Manipulates the map once available.
     * This callback is triggered when the map is ready to be used.
     * This is where we can add markers or lines, add listeners or move the camera. In this case,
     * we just add a marker near Sydney, Australia.
     * If Google Play services is not installed on the device, the user will be prompted to install
     * it inside the SupportMapFragment. This method will only be triggered once the user has
     * installed Google Play services and returned to the app.
     */
    override fun onMapReady(googleMap: GoogleMap) {
        mMap = googleMap

        // Add a marker in Sydney and move the camera
        val castellet = LatLng(41.6716, 1.8641)
        val cata = LatLng(41.7317, 1.8437)
        val luidDePeras = LatLng(41.7317, 1.8258)
        val pius = LatLng(41.7408341, 1.8342043)
        val lacetania = LatLng(41.7370, 1.8277)
        val gravao = LatLng(41.7202, 1.8458)
        val vacarisses = LatLng(41.675892, 1.7998255)
        //mMap.addMarker(MarkerOptions().position(castellet).title("Ins Castellet").icon(
            //BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_ORANGE)))
        mMap.addMarker(MarkerOptions().position(cata).title("Guillem Catà").icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_GREEN)))
        mMap.addMarker(MarkerOptions().position(luidDePeras).title("Lluis de Peguera").icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_RED)))
        mMap.addMarker(MarkerOptions().position(pius).title("Pius Font i Quer").icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_ROSE)))
        mMap.addMarker(MarkerOptions().position(lacetania).title("Institut lacetània").icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_YELLOW)))
        mMap.addMarker(MarkerOptions().position(gravao).title("Institut Cal Gravat").icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_VIOLET)))
        mMap.addMarker(MarkerOptions().position(vacarisses).title("Institut Vacarisses").icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_CYAN)))

        mMap.addCircle(
            CircleOptions()
                .center(LatLng(41.6716, 1.8641))
                .radius(10000.0)
                .strokeColor(Color.RED)
                .fillColor(0x220000FF)

                .strokeWidth(5f)
        )

        val zoomLevel = 11f//This goes up to 21

        mMap.moveCamera(CameraUpdateFactory.newLatLngZoom(castellet, zoomLevel))
        mMap.uiSettings.isZoomControlsEnabled = true






    }




}