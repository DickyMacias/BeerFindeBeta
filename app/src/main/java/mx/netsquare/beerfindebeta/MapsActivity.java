package mx.netsquare.beerfindebeta;

import android.support.v4.app.FragmentActivity;
import android.os.Bundle;

import org.json.JSONObject;

import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.OnMapReadyCallback;
import com.google.android.gms.maps.SupportMapFragment;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.LatLngBounds;
import com.google.android.gms.maps.model.MarkerOptions;

public class MapsActivity extends FragmentActivity implements OnMapReadyCallback {

    private GoogleMap mMap;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_maps);
        // Obtain the SupportMapFragment and get notified when the map is ready to be used.
        SupportMapFragment mapFragment = (SupportMapFragment) getSupportFragmentManager()
                .findFragmentById(R.id.layout_map);
        mapFragment.getMapAsync(this);
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
    @Override
    public void onMapReady(GoogleMap googleMap) {
        mMap = googleMap;

        //Delimitar el enfoque de la pantalla
        LatLngBounds Chihuahua = new LatLngBounds(new LatLng(28.6, -106.1), new LatLng(28.7,-106.15));
        mMap.moveCamera(CameraUpdateFactory.newLatLngZoom(Chihuahua.getCenter(),12));

        // Agregar sitios en el mapa
        LatLng utch = new LatLng(28.6458775, -106.1475035);
        mMap.addMarker(new MarkerOptions().position(utch).title("UTCH"));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(utch));

        LatLng expendio1 = new LatLng(28.6435345, -106.1163414);
        mMap.addMarker(new MarkerOptions().position(expendio1).title("La casa"));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(expendio1));

        LatLng expendio2 = new LatLng(28.6641076, -106.1331413);
        mMap.addMarker(new MarkerOptions().position(expendio2).title("La sacristia"));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(expendio2));

        LatLng expendio3 = new LatLng(28.6851961, -106.1336833);
        mMap.addMarker(new MarkerOptions().position(expendio3).title("El panteon"));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(expendio3));

        //mMap.setMyLocationEnabled(true);


    }
}
