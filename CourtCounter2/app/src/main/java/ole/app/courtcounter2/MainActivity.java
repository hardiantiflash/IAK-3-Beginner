package ole.app.courtcounter2;

import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    //untuk team Merah
    TextView txtPointMerah;
    Button btnTambahTigaMerah, btnTambahDuaMerah, btnFreeMerah;

    //untuk team Putih
    TextView txtPointPutih;
    Button btnTambahTigaPutih, btnTambahDuaPutih, btnFreePutih;

    //untuk tombol reset
    Button btnReset;

    int pointMerah = 0, pointPutih = 0;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        definisi();
    }

    //definisi (casting) object ke variabel diatas
    private void definisi(){
        //UNTUK TEAM MERAH
        txtPointMerah = (TextView) findViewById(R.id.txt_point_merah);
        btnTambahTigaMerah = (Button) findViewById(R.id.btn_tambah3_merah);
        btnTambahDuaMerah = (Button) findViewById(R.id.btn_tambah2_merah);
        btnFreeMerah = (Button) findViewById(R.id.btn_free_merah);

        //UNTUK TEAM PUTIH
        txtPointPutih = (TextView) findViewById(R.id.txt_point_putih);
        btnTambahTigaPutih = (Button) findViewById(R.id.btn_tambah3_putih);
        btnTambahDuaPutih = (Button) findViewById(R.id.btn_tambah2_putih);
        btnFreePutih = (Button) findViewById(R.id.btn_free_putih);

        //UNTUK TOMBOL RESET
        btnReset = (Button) findViewById(R.id.btn_reset);

        //FUNGSIKAN SEMUA TOMBOL
        btnTambahTigaMerah.setOnClickListener(this);
        btnTambahDuaMerah.setOnClickListener(this);
        btnFreeMerah.setOnClickListener(this);

        btnTambahTigaPutih.setOnClickListener(this);
        btnTambahDuaPutih.setOnClickListener(this);
        btnFreePutih.setOnClickListener(this);

        btnReset.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        switch (view.getId()){
            case R.id.btn_tambah3_merah:
                pointMerah = pointMerah + 3;
                txtPointMerah.setText(String.valueOf(pointMerah));
                break;
            case R.id.btn_tambah2_merah:
                pointMerah = pointMerah + 2;
                txtPointMerah.setText(String.valueOf(pointMerah));
                break;
            case R.id.btn_free_merah:
                pointMerah = pointMerah + 1;
                txtPointMerah.setText(String.valueOf(pointMerah));
                break;
            case R.id.btn_tambah3_putih:
                pointPutih = pointPutih + 3;
                txtPointPutih.setText(String.valueOf(pointPutih));
                break;
            case R.id.btn_tambah2_putih:
                pointPutih = pointPutih + 2;
                txtPointPutih.setText(String.valueOf(pointPutih));
                break;
            case R.id.btn_free_putih:
                pointPutih = pointPutih + 1;
                txtPointPutih.setText(String.valueOf(pointPutih));
                break;
            case R.id.btn_reset:
                pointMerah = 0;
                pointPutih = 0;
                txtPointMerah.setText("0");
                txtPointPutih.setText("0");
                break;
        }
    }
}
