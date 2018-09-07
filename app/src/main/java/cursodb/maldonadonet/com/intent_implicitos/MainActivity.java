package cursodb.maldonadonet.com.intent_implicitos;



import android.content.Context;
import android.content.Intent;
import android.net.ConnectivityManager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ConnectivityManager con = (ConnectivityManager) getSystemService(Context.CONNECTIVITY_SERVICE);

        Boolean eswifi = con.getNetworkInfo(ConnectivityManager.TYPE_MOBILE).isConnectedOrConnecting();

        if ( !eswifi ){
            startActivity(new Intent(MainActivity.this, InicioActivity.class));
        }else{
            Toast.makeText(getApplicationContext(),"Telefono conectado",Toast.LENGTH_SHORT).show();
        }



    }
}
