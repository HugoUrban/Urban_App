package castaneda.com.webserviceintegration;

import android.graphics.Color;
import android.os.Bundle;
import android.support.v4.app.FragmentActivity;

import com.google.android.gms.appindexing.AppIndex;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.OnMapReadyCallback;
import com.google.android.gms.maps.SupportMapFragment;
import com.google.android.gms.maps.UiSettings;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.MarkerOptions;
import com.google.android.gms.maps.model.PolylineOptions;

public class Mapa1 extends FragmentActivity implements OnMapReadyCallback {

    private GoogleMap mMap;
    /**
     * ATTENTION: This was auto-generated to implement the App Indexing API.
     * See https://g.co/AppIndexing/AndroidStudio for more information.
     */
    private GoogleApiClient client;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mapa1);
        // Obtain the SupportMapFragment and get notified when the map is ready to be used.
        SupportMapFragment mapFragment = (SupportMapFragment) getSupportFragmentManager()
                .findFragmentById(R.id.map);
        mapFragment.getMapAsync(this);
        // ATTENTION: This was auto-generated to implement the App Indexing API.
        // See https://g.co/AppIndexing/AndroidStudio for more information.
        client = new GoogleApiClient.Builder(this).addApi(AppIndex.API).build();
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

        LatLng urbc = new LatLng(22.215257, -97.859612);
        mMap.addMarker(new MarkerOptions().position(urbc).title("Urban Central")
                .icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_BLUE)));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(urbc));

        LatLng udg = new LatLng(22.218351, -97.858137);
        mMap.addMarker(new MarkerOptions().position(udg).title("Universidad del Golfo")
                .icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_YELLOW)));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(udg));

        LatLng iut = new LatLng(22.219984, -97.861833);
        mMap.addMarker(new MarkerOptions().position(iut).title("Instituto Universitario de Tamaulipas")
                .icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_YELLOW)));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(iut));

        LatLng pfmc = new LatLng(22.221109, -97.863241);
        mMap.addMarker(new MarkerOptions().position(pfmc).title("Preparatoria Francisco Medina Cedillo")
                .icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_YELLOW)));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(pfmc));

        LatLng artt = new LatLng(22.223264, -97.863403);
        mMap.addMarker(new MarkerOptions().position(artt).title("Arteli Hidalgo")
                .icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_YELLOW)));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(artt));

        LatLng tmt = new LatLng(22.226083, -97.864488);
        mMap.addMarker(new MarkerOptions().position(tmt).title("Torre Médica Tampico")
                .icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_YELLOW)));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(tmt));

        LatLng dtv = new LatLng(22.227643, -97.865087);
        mMap.addMarker(new MarkerOptions().position(dtv).title("Dirección de Tránsito y Vialidad")
                .icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_YELLOW)));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(dtv));

        LatLng wa = new LatLng(22.230977, -97.866354);
        mMap.addMarker(new MarkerOptions().position(wa).title("Walmart Alijadores")
                .icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_YELLOW)));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(wa));

        LatLng chc = new LatLng(22.234815, -97.867875);
        mMap.addMarker(new MarkerOptions().position(chc).title("Clínica Hospital Cemain")
                .icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_YELLOW)));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(chc));

        LatLng bih = new LatLng(22.236546, -97.868553);
        mMap.addMarker(new MarkerOptions().position(bih).title("Bonitto Inn Hidalgo")
                .icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_YELLOW)));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(bih));

        LatLng rjc = new LatLng(22.239718, -97.870003);
        mMap.addMarker(new MarkerOptions().position(rjc).title("Restaurante Jardín Corona")
                .icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_YELLOW)));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(rjc));

        LatLng bs = new LatLng(22.241906, -97.870893);
        mMap.addMarker(new MarkerOptions().position(bs).title("Banco Santander")
                .icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_YELLOW)));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(bs));

        LatLng byf = new LatLng(22.243488, -97.871585);
        mMap.addMarker(new MarkerOptions().position(byf).title("Brazza y Fogo")
                .icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_YELLOW)));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(byf));

        LatLng kfce = new LatLng(22.246456, -97.873067);
        mMap.addMarker(new MarkerOptions().position(kfce).title("KFC Ejército")
                .icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_YELLOW)));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(kfce));

        LatLng vg = new LatLng(22.249194, -97.874502);
        mMap.addMarker(new MarkerOptions().position(vg).title("Vizzio Gym")
                .icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_YELLOW)));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(vg));

        LatLng bbva = new LatLng(22.252089, -97.875587);
        mMap.addMarker(new MarkerOptions().position(bbva).title("BBVA Bancomer")
                .icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_YELLOW)));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(bbva));

        LatLng bene = new LatLng(22.255074, -97.876437);
        mMap.addMarker(new MarkerOptions().position(bene).title("Beneficiencia Española de Tampico")
                .icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_YELLOW)));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(bene));

        LatLng MA = new LatLng(22.257475, -97.876515);
        mMap.addMarker(new MarkerOptions().position(MA).title("Macro Arteli")
                .icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_YELLOW)));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(MA));

        LatLng liv = new LatLng(22.260567, -97.875713);
        mMap.addMarker(new MarkerOptions().position(liv).title("Liverpool")
                .icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_YELLOW)));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(liv));

        LatLng chtc = new LatLng(22.262017, -97.875356);
        mMap.addMarker(new MarkerOptions().position(chtc).title("Chedraui Tampico Crystal")
                .icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_YELLOW)));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(chtc));

        LatLng tgif = new LatLng(22.266966, -97.873733);
        mMap.addMarker(new MarkerOptions().position(tgif).title("T.G.I. Friday's")
                .icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_YELLOW)));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(tgif));

        LatLng wmh = new LatLng(22.270801, -97.873819);
        mMap.addMarker(new MarkerOptions().position(wmh).title("WalMart Hidalgo")
                .icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_YELLOW)));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(wmh));

        LatLng cnpl = new LatLng(22.272840, -97.874549);
        mMap.addMarker(new MarkerOptions().position(cnpl).title("Cinepolis")
                .icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_YELLOW)));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(cnpl));

        LatLng hebh = new LatLng(22.280085, -97.872962);
        mMap.addMarker(new MarkerOptions().position(hebh).title("HEB Hidalgo")
                .icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_YELLOW)));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(hebh));

        LatLng une = new LatLng(22.282594, -97.872885);
        mMap.addMarker(new MarkerOptions().position(une).title("Universidad del Noreste")
                .icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_YELLOW)));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(une));

        LatLng smt = new LatLng(22.287161, -97.873288);
        mMap.addMarker(new MarkerOptions().position(smt).title("Sam's Tampico")
                .icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_YELLOW)));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(smt));

        LatLng hin = new LatLng(22.291412, -97.873444);
        mMap.addMarker(new MarkerOptions().position(hin).title("Hampton Inn")
                .icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_YELLOW)));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(hin));

        LatLng eaa = new LatLng(22.293804, -97.874935);
        mMap.addMarker(new MarkerOptions().position(eaa).title("El Asador Aeropuerto")
                .icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_YELLOW)));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(eaa));

        LatLng sa = new LatLng(22.297780, -97.877338);
        mMap.addMarker(new MarkerOptions().position(sa).title("Soriana Aeropuerto")
                .icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_YELLOW)));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(sa));

        LatLng emp = new LatLng(22.301153, -97.879494);
        mMap.addMarker(new MarkerOptions().position(emp).title("El Mejor Pan")
                .icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_YELLOW)));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(emp));

        LatLng avt = new LatLng(22.304512, -97.881523);
        mMap.addMarker(new MarkerOptions().position(avt).title("Avante")
                .icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_YELLOW)));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(avt));

        LatLng stm = new LatLng(22.307325, -97.881401);
        mMap.addMarker(new MarkerOptions().position(stm).title("Scotiabank Tampico - Mante")
                .icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_YELLOW)));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(stm));

        LatLng co = new LatLng(22.310042, -97.880535);
        mMap.addMarker(new MarkerOptions().position(co).title("Carnitas Orta")
                .icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_YELLOW)));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(co));

        LatLng btm = new LatLng(22.312503, -97.879749);
        mMap.addMarker(new MarkerOptions().position(btm).title("Bancomer Tampico - Mante")
                .icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_YELLOW)));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(btm));

        LatLng adadt = new LatLng(22.314585, -97.879110);
        mMap.addMarker(new MarkerOptions().position(adadt).title("Abastecedora de Aceros de Tampico")
                .icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_YELLOW)));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(adadt));

        LatLng azlt = new LatLng(22.317512, -97.878183);
        mMap.addMarker(new MarkerOptions().position(azlt).title("AutoZone Las Torres")
                .icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_YELLOW)));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(azlt));

        LatLng agr = new LatLng(22.320528, -97.877257);
        mMap.addMarker(new MarkerOptions().position(agr).title("Agrigan")
                .icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_YELLOW)));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(agr));

        LatLng ma = new LatLng(22.324507, -97.876004);
        mMap.addMarker(new MarkerOptions().position(ma).title("MADISA Altamira")
                .icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_YELLOW)));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(ma));

        LatLng chtn = new LatLng(22.331705, -97.873746);
        mMap.addMarker(new MarkerOptions().position(chtn).title("Chedrahui Tampico Norte")
                .icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_YELLOW)));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(chtn));

        LatLng deb = new LatLng(22.338263, -97.873937);
        mMap.addMarker(new MarkerOptions().position(deb).title("Distribuidor El Barquito")
                .icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_YELLOW)));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(deb));

        LatLng nr = new LatLng(22.344253, -97.875792);
        mMap.addMarker(new MarkerOptions().position(nr).title("Nautico Residencial")
                .icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_YELLOW)));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(nr));

        LatLng gj = new LatLng(22.347632, -97.878024);
        mMap.addMarker(new MarkerOptions().position(gj).title("Gas Jebla")
                .icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_YELLOW)));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(gj));

        LatLng kwh = new LatLng(22.350809, -97.882444);
        mMap.addMarker(new MarkerOptions().position(kwh).title("Kenworth de la Huasteca")
                .icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_YELLOW)));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(kwh));

        LatLng msc = new LatLng(22.354615, -97.887482);
        mMap.addMarker(new MarkerOptions().position(msc).title("Maseca")
                .icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_YELLOW)));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(msc));

        LatLng hita = new LatLng(22.358370, -97.890941);
        mMap.addMarker(new MarkerOptions().position(hita).title("Holida Inn Tampico Altamira")
                .icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_YELLOW)));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(hita));

        LatLng ibd = new LatLng(22.362380, -97.894563);
        mMap.addMarker(new MarkerOptions().position(ibd).title("Iberdrola")
                .icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_YELLOW)));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(ibd));

        LatLng lps = new LatLng(22.368558, -97.900290);
        mMap.addMarker(new MarkerOptions().position(lps).title("Las Palapas de Simón")
                .icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_YELLOW)));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(lps));

        LatLng dtcm = new LatLng(22.372841, -97.904042);
        mMap.addMarker(new MarkerOptions().position(dtcm).title("Distribuidor Tampico - Ciudad Mante")
                .icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_YELLOW)));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(dtcm));

        LatLng ipro = new LatLng(22.379789, -97.900962);
        mMap.addMarker(new MarkerOptions().position(ipro).title("Indelpro")
                .icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_YELLOW)));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(ipro));

        LatLng mpa = new LatLng(22.387963, -97.895817);
        mMap.addMarker(new MarkerOptions().position(mpa).title("Motel Plaza Altamira")
                .icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_YELLOW)));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(mpa));

        LatLng am = new LatLng(22.391257, -97.893731);
        mMap.addMarker(new MarkerOptions().position(am).title("Almonte, S.A. de C.V")
                .icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_YELLOW)));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(am));

        LatLng up = new LatLng(22.390254, -97.885395);
        mMap.addMarker(new MarkerOptions().position(up).title("Urban Pedrera")
                .icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_ORANGE)));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(up));

        mMap.animateCamera(CameraUpdateFactory.zoomTo(12));

        UiSettings settings = mMap.getUiSettings();
        settings.setCompassEnabled( true );
        settings.setMyLocationButtonEnabled( true );
        settings.setRotateGesturesEnabled( true );
        settings.setScrollGesturesEnabled( true );
        settings.setTiltGesturesEnabled( true );
        settings.setZoomControlsEnabled( true );

        mMap.addPolyline(new PolylineOptions().add(new LatLng(22.215213, -97.859637), new LatLng(22.218307, -97.858022)).width(10).color(Color.BLUE));
        mMap.addPolyline(new PolylineOptions().add(new LatLng(22.218307, -97.858022), new LatLng(22.220519, -97.863059)).width(10).color(Color.BLUE));
        mMap.addPolyline(new PolylineOptions().add(new LatLng(22.220519, -97.863059), new LatLng(22.220621, -97.863167)).width(10).color(Color.BLUE));
        mMap.addPolyline(new PolylineOptions().add(new LatLng(22.220621, -97.863167), new LatLng(22.220928, -97.863234)).width(10).color(Color.BLUE));
        mMap.addPolyline(new PolylineOptions().add(new LatLng(22.220928, -97.863234), new LatLng(22.221872, -97.863285)).width(10).color(Color.BLUE));
        mMap.addPolyline(new PolylineOptions().add(new LatLng(22.221872, -97.863285), new LatLng(22.223536, -97.863448)).width(10).color(Color.BLUE));
        mMap.addPolyline(new PolylineOptions().add(new LatLng(22.223536, -97.863448), new LatLng(22.226182, -97.864513)).width(10).color(Color.CYAN));
        mMap.addPolyline(new PolylineOptions().add(new LatLng(22.223536, -97.863448), new LatLng(22.226182, -97.864513)).width(10).color(Color.CYAN));
        mMap.addPolyline(new PolylineOptions().add(new LatLng(22.226182, -97.864513), new LatLng(22.226853, -97.864751)).width(10).color(Color.BLUE));
        mMap.addPolyline(new PolylineOptions().add(new LatLng(22.226853, -97.864751), new LatLng(22.235306, -97.868033)).width(10).color(Color.BLUE));
        mMap.addPolyline(new PolylineOptions().add(new LatLng(22.235306, -97.868033), new LatLng(22.242973, -97.871339)).width(10).color(Color.BLUE));
        mMap.addPolyline(new PolylineOptions().add(new LatLng(22.242973, -97.871339), new LatLng(22.244188, -97.871888)).width(10).color(Color.BLUE));
        mMap.addPolyline(new PolylineOptions().add(new LatLng(22.244188, -97.871888), new LatLng(22.245787, -97.872681)).width(10).color(Color.BLUE));
        mMap.addPolyline(new PolylineOptions().add(new LatLng(22.245787, -97.872681), new LatLng(22.248283, -97.874099)).width(10).color(Color.BLUE));
        mMap.addPolyline(new PolylineOptions().add(new LatLng(22.248283, -97.874099), new LatLng(22.249911, -97.874805)).width(10).color(Color.BLUE));
        mMap.addPolyline(new PolylineOptions().add(new LatLng(22.249911, -97.874805), new LatLng(22.254673, -97.876379)).width(10).color(Color.BLUE));
        mMap.addPolyline(new PolylineOptions().add(new LatLng(22.254673, -97.876379), new LatLng(22.255519, -97.876494)).width(10).color(Color.BLUE));
        mMap.addPolyline(new PolylineOptions().add(new LatLng(22.255519, -97.876494), new LatLng(22.256916, -97.876617)).width(10).color(Color.BLUE));
        mMap.addPolyline(new PolylineOptions().add(new LatLng(22.256916, -97.876617), new LatLng(22.257299, -97.876566)).width(10).color(Color.BLUE));
        mMap.addPolyline(new PolylineOptions().add(new LatLng(22.257299, -97.876566), new LatLng(22.259837, -97.875970)).width(10).color(Color.BLUE));
        mMap.addPolyline(new PolylineOptions().add(new LatLng(22.259837, -97.875970), new LatLng(22.260007, -97.875831)).width(10).color(Color.BLUE));
        mMap.addPolyline(new PolylineOptions().add(new LatLng(22.260007, -97.875831), new LatLng(22.264130, -97.874877)).width(10).color(Color.BLUE));
        mMap.addPolyline(new PolylineOptions().add(new LatLng(22.264130, -97.874877), new LatLng(22.264602, -97.874726)).width(10).color(Color.BLUE));
        mMap.addPolyline(new PolylineOptions().add(new LatLng(22.264602, -97.874726), new LatLng(22.266752, -97.873804)).width(10).color(Color.BLUE));
        mMap.addPolyline(new PolylineOptions().add(new LatLng(22.266752, -97.873804), new LatLng(22.267618, -97.873623)).width(10).color(Color.BLUE));
        mMap.addPolyline(new PolylineOptions().add(new LatLng(22.267618, -97.873623), new LatLng(22.270130, -97.873634)).width(10).color(Color.BLUE));
        mMap.addPolyline(new PolylineOptions().add(new LatLng(22.270130, -97.873634), new LatLng(22.270576, -97.873748)).width(10).color(Color.BLUE));
        mMap.addPolyline(new PolylineOptions().add(new LatLng(22.270576, -97.873748), new LatLng(22.272448, -97.874519)).width(10).color(Color.BLUE));
        mMap.addPolyline(new PolylineOptions().add(new LatLng(22.272448, -97.874519), new LatLng(22.273065, -97.874561)).width(10).color(Color.BLUE));
        mMap.addPolyline(new PolylineOptions().add(new LatLng(22.273065, -97.874561), new LatLng(22.277919, -97.873080)).width(10).color(Color.BLUE));
        mMap.addPolyline(new PolylineOptions().add(new LatLng(22.277919, -97.873080), new LatLng(22.278686, -97.872972)).width(10).color(Color.BLUE));
        mMap.addPolyline(new PolylineOptions().add(new LatLng(22.278686, -97.872972), new LatLng(22.282234, -97.872816)).width(10).color(Color.BLUE));
        mMap.addPolyline(new PolylineOptions().add(new LatLng(22.282234, -97.872816), new LatLng(22.282765, -97.872963)).width(10).color(Color.BLUE));
        mMap.addPolyline(new PolylineOptions().add(new LatLng(22.282765, -97.872963), new LatLng(22.284466, -97.873799)).width(10).color(Color.BLUE));
        mMap.addPolyline(new PolylineOptions().add(new LatLng(22.284466, -97.873799), new LatLng(22.285300, -97.873838)).width(10).color(Color.BLUE));
        mMap.addPolyline(new PolylineOptions().add(new LatLng(22.285300, -97.873838), new LatLng(22.286156, -97.873547)).width(10).color(Color.BLUE));
        mMap.addPolyline(new PolylineOptions().add(new LatLng(22.286156, -97.873547), new LatLng(22.286698, -97.873436)).width(10).color(Color.BLUE));
        mMap.addPolyline(new PolylineOptions().add(new LatLng(22.286698, -97.873436), new LatLng(22.287796, -97.873078)).width(10).color(Color.BLUE));
        mMap.addPolyline(new PolylineOptions().add(new LatLng(22.287796, -97.873078), new LatLng(22.288764, -97.872496)).width(10).color(Color.BLUE));
        mMap.addPolyline(new PolylineOptions().add(new LatLng(22.288764, -97.872496), new LatLng(22.289441, -97.872148)).width(10).color(Color.BLUE));
        mMap.addPolyline(new PolylineOptions().add(new LatLng(22.289441, -97.872148), new LatLng(22.289818, -97.872181)).width(10).color(Color.BLUE));
        mMap.addPolyline(new PolylineOptions().add(new LatLng(22.289818, -97.872181), new LatLng(22.291104, -97.873228)).width(10).color(Color.BLUE));
        mMap.addPolyline(new PolylineOptions().add(new LatLng(22.291104, -97.873228), new LatLng(22.292169, -97.873883)).width(10).color(Color.BLUE));
        mMap.addPolyline(new PolylineOptions().add(new LatLng(22.292169, -97.873883), new LatLng(22.294055, -97.875094)).width(10).color(Color.BLUE));
        mMap.addPolyline(new PolylineOptions().add(new LatLng(22.294055, -97.875094), new LatLng(22.294307, -97.875154)).width(10).color(Color.BLUE));
        mMap.addPolyline(new PolylineOptions().add(new LatLng(22.294307, -97.875154), new LatLng(22.295077, -97.875646)).width(10).color(Color.BLUE));
        mMap.addPolyline(new PolylineOptions().add(new LatLng(22.295077, -97.875646), new LatLng(22.298330, -97.877690)).width(10).color(Color.BLUE));
        mMap.addPolyline(new PolylineOptions().add(new LatLng(22.298330, -97.877690), new LatLng(22.298433, -97.877874)).width(10).color(Color.BLUE));
        mMap.addPolyline(new PolylineOptions().add(new LatLng(22.298433, -97.877884), new LatLng(22.304287, -97.881463)).width(10).color(Color.BLUE));
        mMap.addPolyline(new PolylineOptions().add(new LatLng(22.304287, -97.881463), new LatLng(22.305493, -97.881700)).width(10).color(Color.BLUE));
        mMap.addPolyline(new PolylineOptions().add(new LatLng(22.305493, -97.881700), new LatLng(22.306700, -97.881600)).width(10).color(Color.BLUE));
        mMap.addPolyline(new PolylineOptions().add(new LatLng(22.306700, -97.881600), new LatLng(22.332053, -97.873629)).width(10).color(Color.BLUE));
        mMap.addPolyline(new PolylineOptions().add(new LatLng(22.332053, -97.873629), new LatLng(22.335407, -97.873171)).width(10).color(Color.BLUE));
        mMap.addPolyline(new PolylineOptions().add(new LatLng(22.335407, -97.873171), new LatLng(22.336542, -97.873379)).width(10).color(Color.BLUE));
        mMap.addPolyline(new PolylineOptions().add(new LatLng(22.336542, -97.873379), new LatLng(22.345744, -97.876319)).width(10).color(Color.BLUE));
        mMap.addPolyline(new PolylineOptions().add(new LatLng(22.336542, -97.873379), new LatLng(22.345744, -97.876319)).width(10).color(Color.BLUE));
        mMap.addPolyline(new PolylineOptions().add(new LatLng(22.345744, -97.876319), new LatLng(22.346436, -97.876859)).width(10).color(Color.BLUE));
        mMap.addPolyline(new PolylineOptions().add(new LatLng(22.346436, -97.876859), new LatLng(22.349388, -97.879940)).width(10).color(Color.BLUE));
        mMap.addPolyline(new PolylineOptions().add(new LatLng(22.349388, -97.879940), new LatLng(22.350875, -97.882501)).width(10).color(Color.BLUE));
        mMap.addPolyline(new PolylineOptions().add(new LatLng(22.350875, -97.882501), new LatLng(22.351618, -97.883875)).width(10).color(Color.BLUE));
        mMap.addPolyline(new PolylineOptions().add(new LatLng(22.351618, -97.883875), new LatLng(22.354754, -97.887622)).width(10).color(Color.BLUE));
        mMap.addPolyline(new PolylineOptions().add(new LatLng(22.354754, -97.887622), new LatLng(22.368868, -97.900567)).width(10).color(Color.BLUE));
        mMap.addPolyline(new PolylineOptions().add(new LatLng(22.368868, -97.900567), new LatLng(22.369068, -97.900888)).width(10).color(Color.BLUE));
        mMap.addPolyline(new PolylineOptions().add(new LatLng(22.369068, -97.900888), new LatLng(22.371851, -97.903669)).width(10).color(Color.BLUE));
        mMap.addPolyline(new PolylineOptions().add(new LatLng(22.371851, -97.903669), new LatLng(22.373179, -97.904078)).width(10).color(Color.BLUE));
        mMap.addPolyline(new PolylineOptions().add(new LatLng(22.371851, -97.903669), new LatLng(22.373179, -97.904078)).width(10).color(Color.BLUE));
        mMap.addPolyline(new PolylineOptions().add(new LatLng(22.373179, -97.904078), new LatLng(22.374029, -97.903785)).width(10).color(Color.BLUE));
        mMap.addPolyline(new PolylineOptions().add(new LatLng(22.374029, -97.903785), new LatLng(22.375690, -97.902423)).width(10).color(Color.BLUE));
        mMap.addPolyline(new PolylineOptions().add(new LatLng(22.375690, -97.902423), new LatLng(22.377292, -97.901619)).width(10).color(Color.BLUE));
        mMap.addPolyline(new PolylineOptions().add(new LatLng(22.377292, -97.901619), new LatLng(22.381505, -97.900477)).width(10).color(Color.BLUE));
        mMap.addPolyline(new PolylineOptions().add(new LatLng(22.381505, -97.900477), new LatLng(22.382091, -97.900124)).width(10).color(Color.BLUE));
        mMap.addPolyline(new PolylineOptions().add(new LatLng(22.382091, -97.900124), new LatLng(22.385409, -97.897139)).width(10).color(Color.BLUE));
        mMap.addPolyline(new PolylineOptions().add(new LatLng(22.385409, -97.897139), new LatLng(22.385884, -97.896797)).width(10).color(Color.BLUE));
        mMap.addPolyline(new PolylineOptions().add(new LatLng(22.385884, -97.896797), new LatLng(22.386125, -97.896508)).width(10).color(Color.BLUE));
        mMap.addPolyline(new PolylineOptions().add(new LatLng(22.386125, -97.896508), new LatLng(22.391345, -97.894635)).width(10).color(Color.BLUE));
        mMap.addPolyline(new PolylineOptions().add(new LatLng(22.391345, -97.894635), new LatLng(22.390587, -97.888421)).width(10).color(Color.BLUE));
        mMap.addPolyline(new PolylineOptions().add(new LatLng(22.390587, -97.888421), new LatLng(22.390235, -97.885074)).width(10).color(Color.BLUE));
    }
}
